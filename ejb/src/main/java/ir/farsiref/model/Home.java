package ir.farsiref.model;

import ir.farsiref.utils.HomeType;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity(name="home")
@Table(name="home")
@Getter
@Setter
@EqualsAndHashCode
@Cacheable(value = false)
@NoArgsConstructor
public class Home  extends BaseModel{

    @Enumerated(EnumType.STRING)
    @Column(name = "home_type" , length = 20 , nullable = false)
    private HomeType homeType;
    @Column(length = 200 , nullable = false)
    private String pic;
    @Column(length = 200 , nullable = false)
    private String link;
    @Column(length = 200 , nullable = false)
    private String title;
    @Column(length = 200 , nullable = false)
    private String alt;
    private Boolean active;
}
