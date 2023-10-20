package ir.farsiref.dao.home;

import ir.farsiref.dao.base.BaseDaoImpl;
import ir.farsiref.model.Home;
import ir.farsiref.utils.HomeType;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.Query;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Stateless
@LocalBean
public class HomeDao extends BaseDaoImpl<Home> {

    public HomeDao() {
        setModelClass(Home.class);
        setClassName("home");
    }
    public List<Home> findHomePage(Boolean active, HomeType homeType) {
        String q = "select * from home \n";
        StringBuilder queryBuilder =new StringBuilder(q);
        queryBuilder.append(" where active = ? and home_type = ? ");
        Query query = em.createNativeQuery(queryBuilder.toString(), Home.class);
        query.setParameter(1,active);
        query.setParameter(2,homeType.toString());
        return query.getResultList();
    }
}
