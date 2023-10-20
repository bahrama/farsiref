package ir.farsiref.dto.bookSession;

import ir.farsiref.dto.book.BookDto;
import ir.farsiref.model.Book;
import ir.farsiref.model.BookSession;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface BookSessionDtoManager {
    @Mapping(source = "id" , target = "id")
    @Mapping(source = "title" , target = "title")
    @Mapping(source = "doc" , target = "doc")
    @Mapping(source = "description" , target = "description")
    BookSessionDto transferBookSessionToDto(BookSession bookSession);

    @InheritInverseConfiguration
    BookSession transferBookSessionDtoToEntity(BookSessionDto bookSessionDto);
}
