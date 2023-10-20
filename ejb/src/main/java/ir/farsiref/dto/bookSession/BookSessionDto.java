package ir.farsiref.dto.bookSession;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookSessionDto {
    private Long id;
    private String title;
    private String description;
    private String doc;
}
