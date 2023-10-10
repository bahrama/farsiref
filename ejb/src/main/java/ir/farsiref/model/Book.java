package ir.farsiref.model;

import ir.farsiref.utils.BookType;
import ir.farsiref.utils.HomeType;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="book")
@Getter
@Setter
@EqualsAndHashCode
@Cacheable(value = false)
@NoArgsConstructor
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "book_type" , length = 20 , nullable = false)
    private BookType bookType;

    @Column(length = 200 , nullable = false , unique = true)
    private String name;

    @Column(length = 100)
    private String pic1;

    @Column(name = "alt_pic1",length = 100)
    private String altPic1;

    @OneToMany(fetch=FetchType.LAZY,
            mappedBy="book",
            cascade= CascadeType.ALL , orphanRemoval = true)
    private Set<BookSession> bookSessions = new HashSet<>();
}
