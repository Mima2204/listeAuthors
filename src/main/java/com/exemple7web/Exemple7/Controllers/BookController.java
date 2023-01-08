package com.exemple7web.Exemple7.Controllers;

import com.exemple7web.Exemple7.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/book")
public class BookController {
    @Autowired

   private final BookRepository bookRepository;

  public BookController(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
  }
@RequestMapping("/books")

      public String getBooks(Model model) {

        model.addAttribute("books",bookRepository.findAll());

        return "liste";
    }
}
