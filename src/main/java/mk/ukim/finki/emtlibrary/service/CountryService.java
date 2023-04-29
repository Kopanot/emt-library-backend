package mk.ukim.finki.emtlibrary.service;

import mk.ukim.finki.emtlibrary.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    List<Country> findAll();
    Optional<Country> findById(Long id);
    Optional<Country> findByName(String name);

    Optional<Country> save(Country country);
}
