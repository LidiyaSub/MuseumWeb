package com.softserveinc.edu.ita.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softserveinc.edu.ita.entity.Author;

@Controller
public class AuthorController {
	@Autowired
	AuthorService authorService;
	
	@RequestMapping("/showAllAuthors")
	public String getAllAuthors(Model model){
		List<Author> authors = authorService.getAll();
		model.addAttribute("allAuthors", authors);
		return "show-authors";
	}
	@RequestMapping("/createAuthor")
	public String addAuthor(Model model){
		model.addAttribute("author", new Author());
		return "addNewAuthor";
	}
	
	@RequestMapping(value = "/saveAuthor", method = RequestMethod.POST)
	public String saveAuthorToDB(@ModelAttribute("author")Author author){
		authorService.save(author);
		return "redirect:/show-authors?message=true";
	}
}
