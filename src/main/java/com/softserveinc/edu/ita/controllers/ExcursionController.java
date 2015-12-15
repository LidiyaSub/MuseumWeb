package com.softserveinc.edu.ita.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softserveinc.edu.ita.entity.Excursion;
import com.softserveinc.edu.ita.service.ExcursionService;
import com.softserveinc.edu.ita.service.ScheduleService;
import com.softserveinc.edu.ita.service.ShowpieceService;

@Controller
public class ExcursionController {

	@Autowired
	ExcursionService excursionService;

	@Autowired
	ScheduleService scheduleService;

	@RequestMapping("/showAllExcursions")
	public String showAll(Model model) {
		List<Excursion> allExcursions = excursionService.getAllExcursions();
		model.addAttribute("allExcursions", allExcursions);
		model.addAttribute("allSchedules", scheduleService.getAllSchedules());
		return "excursion/show-excursions";
	}

	@RequestMapping("/addNewExcursion")
	public String addNew(Model model) {
		model.addAttribute("excursion", new Excursion());
		model.addAttribute("scheduleList", scheduleService.getAllSchedules());
		return "excursion/new-excursion";
	}

	@RequestMapping(value = "/saveAddedExcursion", method = RequestMethod.POST)
	public String saveExcursion(@ModelAttribute("excursion") Excursion excursion) {
		excursionService.saveExcursion(excursion);
		return "redirect:/showAllExcursions?msg=true";

	}

	@RequestMapping("/updateExcursion-{id}")
	public String updateExcursionById(@PathVariable Long id, Model model) {
		Excursion excursion = excursionService.findOneById(id);
		model.addAttribute("excursion", excursion);
		model.addAttribute("scheduleList", scheduleService.getAllSchedules());
		return "excursion/showExcursionPerUpdate";
	}

	@RequestMapping(value = "/saveUpdatedExcursion", method = RequestMethod.POST)
	public String saveUpdate(@ModelAttribute("excursion") Excursion excursion) {
		//some code
		excursionService.updateExcursion(excursion);
		return "redirect:/showAllExcursions?notify=true";
	}

	@RequestMapping("/deleteExcursion-{id}")
	public String deleteExcursion(@PathVariable Long id, Model model) {
		excursionService.deleteExcursion(id);
		return "redirect:/showAllExcursions?message=true";
	}
}
