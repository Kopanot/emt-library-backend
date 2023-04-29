package mk.ukim.finki.emtlibrary.config;

import mk.ukim.finki.emtlibrary.model.Author;
import mk.ukim.finki.emtlibrary.model.Book;
import mk.ukim.finki.emtlibrary.model.Country;
import mk.ukim.finki.emtlibrary.model.dto.BookDto;
import mk.ukim.finki.emtlibrary.model.enums.Category;
import mk.ukim.finki.emtlibrary.service.AuthorService;
import mk.ukim.finki.emtlibrary.service.BookService;
import mk.ukim.finki.emtlibrary.service.CountryService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Component
public class DataInitializer {
    private final BookService bookService;
    private final AuthorService authorService;

    private final CountryService countryService;

    public DataInitializer(BookService bookService, AuthorService authorService, CountryService countryService) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.countryService = countryService;
    }


    @PostConstruct
    public void init(){
        for (int i=0;i<5;i++){
            Country country = new Country("Country 1" + i,"Europe");
            countryService.save(country);
        }

        for (int i=0; i<10; i++){
            Country country = countryService.findById(1L).get();
            Author author = new Author("Name " + i,"Surname "+ i,country);
            authorService.save(author);
        }

        for (int i=0; i<10; i++){
            Category category = Category.HISTORY;
            if (i%3 == 0){
                 category = Category.NOVEL;
            }
            if (i%3 == 1){
                category = Category.HISTORY;
            }
            if (i%3 == 2){
                category = Category.BIOGRAPHY;
            }
            bookService.save(new BookDto("Name " + i,category,2L,i*7));
        }


    }
}
