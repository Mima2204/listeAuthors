package com.exemple7web.Exemple7.Repositories;

import com.exemple7web.Exemple7.Domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
