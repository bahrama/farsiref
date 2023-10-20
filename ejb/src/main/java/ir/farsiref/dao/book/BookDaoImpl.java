package ir.farsiref.dao.book;

import ir.farsiref.dao.base.BaseDaoImpl;
import ir.farsiref.model.Book;
import ir.farsiref.model.Home;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;

@Stateless
@LocalBean
public class BookDaoImpl  extends BaseDaoImpl<Book> {
}
