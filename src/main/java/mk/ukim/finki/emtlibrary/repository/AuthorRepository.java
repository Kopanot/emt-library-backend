package mk.ukim.finki.emtlibrary.repository;

import mk.ukim.finki.emtlibrary.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
    Optional<Author> findAuthorByNameAndSurname(String name, String surname);

}
