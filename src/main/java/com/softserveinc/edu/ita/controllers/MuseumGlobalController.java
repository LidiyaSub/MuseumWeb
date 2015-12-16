package com.softserveinc.edu.ita.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softserveinc.edu.ita.service.AuthorService;
import com.softserveinc.edu.ita.service.HallService;
import com.softserveinc.edu.ita.service.ShowpieceService;
import com.softserveinc.edu.ita.service.WorkerService;

@Controller
public class MuseumGlobalController {

	@Autowired
	private WorkerService workerService;

	@Autowired
	private HallService hallService;

	@Autowired
	private ShowpieceService showpieceService;

	@Autowired
	private AuthorService authorService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showMuseum(Model model) {
		model.addAttribute("workers", workerService.getAllWorkers());
		model.addAttribute("halls", hallService.getAllHalls());
		model.addAttribute("showpieces", showpieceService.getAllShowpieces());
		model.addAttribute("authors", authorService.getAllAuthors());
		return "index";
	}
}
