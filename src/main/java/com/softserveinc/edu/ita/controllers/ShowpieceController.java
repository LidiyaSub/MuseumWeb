package com.softserveinc.edu.ita.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		return "showpiece/newShowpiece";
	}

	@RequestMapping(value = "/createShowpiece", method = RequestMethod.POST)
	public String createShowpiece(@ModelAttribute("createShowpiece") Showpiece showpiece) {
		showpieceService.saveShowpiece(showpiece);
		return "showpiece/newShowpiece";
	}
	
	@RequestMapping(value = "/deleteShowpiece", method = RequestMethod.GET)
	public String deleteSchedule(@RequestParam("checkbox") Long [] id) {
		for (Long long1 : id) {
			showpieceService.deleteShowpiece(long1);
		}
		return "redirect:/showAllShowpieces?delete=true";
	}

}
