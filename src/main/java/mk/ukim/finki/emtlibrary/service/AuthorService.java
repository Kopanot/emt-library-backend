package mk.ukim.finki.emtlibrary.service;

import mk.ukim.finki.emtlibrary.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> findAll();
    Optional<Author> findById(Long id);

    Optional<Author> findAuthorByNameAndSurname(String name, String surname);

    Optional<Author> save(Author author);

}
