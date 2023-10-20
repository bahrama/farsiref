package ir.farsiref.dto.home;

import ir.farsiref.model.Home;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface HomeDtoManager {
    @Mapping(source = "id" , target = "id")
    @Mapping(source = "pic" , target = "pic")
    @Mapping(source = "alt" , target = "alt")
    @Mapping(source = "homeType" , target = "homeType")
    @Mapping(source = "title" , target = "title")
    @Mapping(source = "link" , target = "link")
    @Mapping(source = "active" , target = "active")
    HomeDto transferHomeToDto(Home home);

    @InheritInverseConfiguration
    Home transferHomeDtoToEntity(HomeDto homeDto);
}
