package ir.farsiref.dto.home;

import ir.farsiref.utils.HomeType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HomeDto {

    private Long id;
    private HomeType homeType;
    private String pic;
    private String link;
    private String title;
    private String alt;
    private Boolean active;
}
