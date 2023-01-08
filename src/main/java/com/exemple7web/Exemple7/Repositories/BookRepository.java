package com.exemple7web.Exemple7.Repositories;

import com.exemple7web.Exemple7.Domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
