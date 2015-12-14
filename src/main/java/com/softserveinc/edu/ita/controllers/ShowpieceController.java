package com.softserveinc.edu.ita.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softserveinc.edu.ita.entity.Showpiece;
import com.softserveinc.edu.ita.service.ShowpieceService;

@Controller
public class ShowpieceController {

	@Autowired
	private ShowpieceService showpieceService;

	@RequestMapping("/showAllShowpieces")
	public String showAllShowpieces(Model model) {
		return "showpiece/allShowpieces";
	}

	@RequestMapping("/createShowpiece")
	public String createShowpiece(Model model) {
		model.addAttribute("showpiece", new Showpiece());
		return "showpiece/newShowpiece";
	}

	@RequestMapping(value = "/createShowpiece", method = RequestMethod.POST)
	public String createShowpiece(@ModelAttribute("createShowpiece") Showpiece showpiece) {
		showpieceService.saveShowpiece(showpiece);
		return "showpiece/newShowpiece";
	}

}
