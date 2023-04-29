package mk.ukim.finki.emtlibrary.service;

import mk.ukim.finki.emtlibrary.model.Book;
import mk.ukim.finki.emtlibrary.model.dto.BookDto;
import mk.ukim.finki.emtlibrary.model.enums.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();
    Optional<Book> findById(Long id);
    Optional<Book> findByName(String name);
    Optional<Book> save(String name, Category category, Long authorId,Integer availableCopies);
    Optional<Book> save (BookDto bookDto);
    Optional<Book> edit(Long id, String name, Category category, Long authorId,Integer availableCopies);
    Optional<Book> edit(Long id, BookDto bookDto);
    void deleteById(Long id);
    void deleteByName(String name);
    void bookTaken(Long id);
    Page<Book> findAllWithPagination(Pageable pageable);

}
