package com.softserveinc.edu.ita.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softserveinc.edu.ita.entity.Author;
import com.softserveinc.edu.ita.service.AuthorService;
import com.softserveinc.edu.ita.service.ShowpieceService;

@Controller
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	@Autowired
	private ShowpieceService showpieceService;

	@RequestMapping(value = "/")
	public String showInitialPage() {
		return "index";
	}

	@RequestMapping("/showAllAuthors")
	public String getAllAuthors(Model model) {
		List<Author> authors = authorService.getAllAuthors();
		model.addAttribute("allAuthors", authors);
		return "author/show-authors";
	}

	@RequestMapping("/createAuthor")
	public String addAuthor(Model model) {
		model.addAttribute("author", new Author());
		return "author/addNewAuthor";
	}

	@RequestMapping(value = "/saveAuthor", method = RequestMethod.POST)
	public String saveAuthorToDB(@ModelAttribute("author") Author author) {
		authorService.saveAuthor(author);
		return "redirect:/showAllAuthors?message=true";
	}

	@RequestMapping("/updateAuthor-{id}")
	public String updateAuthor(@PathVariable("id") Long id, Model model) {
		Author author = authorService.findOneById(id);
		model.addAttribute("authorInfo", author);
		return "showAuthorPerUpdate";

	}

	@RequestMapping(value = "/saveUpdate", method = RequestMethod.POST)
	public String saveModify(@ModelAttribute(value = "authorInfo") Author author) {
		authorService.updateAuthor(author);
		return "redirect:/showAllAuthors?msg=true";
	}
	
	@RequestMapping("/deleteAuthor-{id}")
	public String deleteAuthor(@PathVariable("id") Long id){
		Author author = authorService.findOneById(id);
		authorService.deleteAuthor(id);
		return "redirect:/showAllAuthors?notify=true";
		
	}
}
