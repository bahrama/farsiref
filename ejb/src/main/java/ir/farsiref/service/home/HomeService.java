package ir.farsiref.service.home;

import ir.farsiref.dao.home.HomeDao;
import ir.farsiref.dto.home.HomeDto;
import ir.farsiref.dto.home.HomeDtoManager;
import ir.farsiref.model.Home;
import ir.farsiref.utils.HomeType;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.mapstruct.factory.Mappers;

import java.util.*;

@Stateless
@LocalBean
public class HomeService {
    @Inject
    private HomeDao homeDao;

    private HomeDtoManager homeDtoManager = Mappers.getMapper(HomeDtoManager.class);

    public Optional<Home> save(HomeDto homeDto) throws Exception {
        return homeDao.save(homeDtoManager.transferHomeDtoToEntity(homeDto));
    }

    public List<HomeDto> findAllHome(){
        List<HomeDto> homeDtos = new ArrayList<>();
        homeDao.findAll().stream()
                .forEach(p -> {
                    homeDtos.add(homeDtoManager.transferHomeToDto(p));
                });
        return homeDtos;
    }

    public Long delete(HomeDto homeDto){
        return homeDao.delete(homeDtoManager.transferHomeDtoToEntity(homeDto));
    }
    public HomeDto findHomeById(Long id) throws NoSuchElementException {
        try {
            return homeDtoManager.transferHomeToDto(homeDao.findById(id).get());
        }catch (Exception e){
            e.getMessage();
            return null;
        }
    }

    public List<HomeDto> search(int offset, int pageSize, Map<String, String> sortBy, Map<String, String> filterBy) {
        List<Home> homes = homeDao.search(offset,pageSize,sortBy,filterBy);
        List<HomeDto> homeDtos = new ArrayList<>();
        homes.stream().forEach(i->{
            homeDtos.add(homeDtoManager.transferHomeToDto(i));
        });
        return homeDtos;
    }

    public int countHome(){
        return homeDao.countEntity();
    }

    public List<HomeDto> findHomePage(Boolean active, HomeType homeType){
        List<HomeDto> homeDtos = new ArrayList<>();
        List<Home> homes = homeDao.findHomePage(active,homeType);
        homes.forEach(i->{
            homeDtos.add(homeDtoManager.transferHomeToDto(i));
        });
        return homeDtos;
    }
}
