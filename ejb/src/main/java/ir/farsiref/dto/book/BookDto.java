package ir.farsiref.dto.book;

import ir.farsiref.utils.BookType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDto {
    private Long id;

    private BookType bookType;

    private String name;

    private String pic1;

    private String altPic1;
}
