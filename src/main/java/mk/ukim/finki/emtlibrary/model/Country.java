package mk.ukim.finki.emtlibrary.model;

import lombok.Data;
import lombok.Lombok;

import javax.persistence.*;

@Data
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    private String continent;

    public Country(){

    }
    public Country(String name, String continent) {
        this.name = name;
        this.continent = continent;
    }
}
