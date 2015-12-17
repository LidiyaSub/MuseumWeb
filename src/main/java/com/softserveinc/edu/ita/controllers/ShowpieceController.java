package com.softserveinc.edu.ita.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.softserveinc.edu.ita.entity.Showpiece;
import com.softserveinc.edu.ita.service.AuthorService;
import com.softserveinc.edu.ita.service.HallService;
import com.softserveinc.edu.ita.service.ShowpieceService;

@Controller
public class ShowpieceController {

	@Autowired
	private ShowpieceService showpieceService;

	@Autowired
	private AuthorService authorService;

	@Autowired
	private HallService hallService;

	@RequestMapping(value = "/showAllShowpieces", method = RequestMethod.GET)
	public String showAllShowpieces(Model model) {
		model.addAttribute("showpieces", showpieceService.getAllShowpieces());
		model.addAttribute("authors", authorService.getAllAuthors());
		model.addAttribute("halls", hallService.getAllHalls());
		return "showpiece/show-showpieces";
	}

	@RequestMapping(value = "/createShowpiece", method = RequestMethod.GET)
	public String createShowpiece(Model model) {
		model.addAttribute("showpiece", new Showpiece());
		model.addAttribute("authors", authorService.getAllAuthors());
		model.addAttribute("halls", hallService.getAllHalls());
		return "showpiece/new-showpiece";
	}

	@RequestMapping(value = "/createShowpiece", method = RequestMethod.POST)
	public String createShowpiece(@RequestParam("nameShowpiece") String nameShowpiece,
			@RequestParam("dateIncome") String dateIncome, @RequestParam("materials") String materials,
			@RequestParam("technics") String technics, @RequestParam("hallId") Long hallId,
			@RequestParam("authorId") Long authorId) {
		Showpiece showpiece = new Showpiece(nameShowpiece, dateIncome, materials, technics);
		showpiece.setAuthor(authorService.findOneById(authorId));
		showpiece.setHall(hallService.findOneById(hallId));
		showpieceService.saveShowpiece(showpiece);
		return "redirect:/showAllShowpieces?message=true";
	}

	@RequestMapping(value = "/deleteShowpiece", method = RequestMethod.GET)
	public String deleteShowpiece(@RequestParam("checkbox") Long[] id) {
		for (Long long1 : id) {
			showpieceService.deleteShowpiece(long1);
		}
		return "redirect:/showAllShowpieces?delete=true";
	}

	@RequestMapping(value = "/editShowpiece/{id}", method = RequestMethod.GET)
	public String editSchedule(@PathVariable("id") Long id, Model model) {
		model.addAttribute("showpiece", showpieceService.findOneById(id));
		model.addAttribute("authors", authorService.getAllAuthors());
		model.addAttribute("halls", hallService.getAllHalls());
		return "showpiece/showShowpiecePerUpdate";
	}
	
	@RequestMapping(value = "/editShowpiece", method = RequestMethod.POST)
	public String editSchedule(@ModelAttribute("showpiece") Showpiece showpiece, @RequestParam("hallId") Long hallId,
			@RequestParam("authorId") Long authorId, Model model) {
		showpiece.setAuthor(authorService.findOneById(authorId));
		showpiece.setHall(hallService.findOneById(hallId));
		showpieceService.updateShowpiece(showpiece);
		return "redirect:/showAllShowpieces?msg=true";
	}

}
