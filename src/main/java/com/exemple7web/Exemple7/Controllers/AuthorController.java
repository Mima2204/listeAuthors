package com.exemple7web.Exemple7.Controllers;

import com.exemple7web.Exemple7.Repositories.AuthorRepository;
import com.exemple7web.Exemple7.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value = "/book")
public class AuthorController {

    @Autowired

    private final AuthorRepository authorRepository;

    public AuthorController( AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    @RequestMapping("/authors")

    public String getAuthors(Model model) {

        model.addAttribute("authors",authorRepository.findAll());

        return "index";
    }
}



