package mk.ukim.finki.emtlibrary.model;

import lombok.Data;
import mk.ukim.finki.emtlibrary.model.enums.Category;

import javax.persistence.*;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    @Enumerated(EnumType.STRING)
    private Category category;
    @ManyToOne
    private Author author;
    private Integer availableCopies;

    public Book(){
    }
    public Book(String name,Category category, Author author, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
    }
}
