package ir.farsiref.dto.book;

import ir.farsiref.dto.home.HomeDto;
import ir.farsiref.model.Book;
import ir.farsiref.model.Home;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface BookDtoManager {

    @Mapping(source = "id" , target = "id")
    @Mapping(source = "name" , target = "name")
    @Mapping(source = "pic1" , target = "pic1")
    @Mapping(source = "altPic1" , target = "altPic1")
    @Mapping(source = "bookType" , target = "bookType")
    BookDto transferBookToDto(Book book);

    @InheritInverseConfiguration
    Book transferBookDtoToEntity(BookDto bookDto);
}
