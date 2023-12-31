package ir.farsiref.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Entity(name="book_session")
@Table(name="book_session")
@Getter
@Setter
@EqualsAndHashCode
@Cacheable(value = false)
@NoArgsConstructor
public class BookSession  extends BaseModel{

    @Column(length = 100 , nullable = false , unique = true)
    private String title;
    @Column(length = 2000 , nullable = false , unique = true)
    private String description;
    @Column(nullable = false , unique = true)
    private String doc;

    @ManyToOne(cascade= CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name="book_id")
    private Book book;


}
