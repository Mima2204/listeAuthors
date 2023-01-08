package com.exemple7web.Exemple7.Bootstrap;

import com.exemple7web.Exemple7.Domain.Author;
import com.exemple7web.Exemple7.Domain.Book;
import com.exemple7web.Exemple7.Domain.Publisher;
import com.exemple7web.Exemple7.Repositories.AuthorRepository;
import com.exemple7web.Exemple7.Repositories.BookRepository;
import com.exemple7web.Exemple7.Repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       System.out.println("Started in bootstraap");

        Publisher publisher = new Publisher();
        publisher.setName("Fadi Romeyyedh");
        publisher.setCity("Groningen");
        publisher.setState("Irislaan");
        publisherRepository.save(publisher);

        System.out.println("publisher book : " + publisherRepository.count());
        Author eric = new Author("Eric","Evian");
        Book ddd = new Book("desig sdhsgdjsg", "12324");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author roc = new Author("Salhi", "Halima");
        Book noJBI = new Book("culture spring", "1234554");
        roc.getBooks().add(noJBI);
        noJBI.getAuthors().add(roc);

        noJBI.setPublisher(publisher);
        publisher.getBooks().add(noJBI);
        authorRepository.save(roc);
        bookRepository.save(noJBI);
        publisherRepository.save(publisher);
         System.out.println("Stareted met sping");
         System.out.println("Number de book" + bookRepository.count());
         System.out.println("book publisher :"+ publisher.getBooks().size());

    }
}
