package com.softserveinc.edu.ita.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.softserveinc.edu.ita.entity.Hall;

import com.softserveinc.edu.ita.entity.Worker;
import com.softserveinc.edu.ita.service.HallService;
import com.softserveinc.edu.ita.service.ShowpieceService;
import com.softserveinc.edu.ita.service.WorkerService;

@Controller
public class HallController {

	@Autowired
	private HallService hallService;

	@Autowired
	private WorkerService workerService;

	@Autowired
	private ShowpieceService showpieceService;

	@RequestMapping(value = "/showAllHalls", method = RequestMethod.GET)
	public String showHalls(Model model) {
		model.addAttribute("allHalls", hallService.getAllHalls());

		return "hall/show-halls";
	}

	@RequestMapping(value = "/addHall", method = RequestMethod.GET)
	public String addNewHall(Model model) {

		model.addAttribute("workers", workerService.getAllWorkers());

		return "hall/new-hall";

	}

	@RequestMapping(value = "/saveHall", method = RequestMethod.POST)
	public String saveNewHall(Model model,
			@RequestParam(value = "nameHall") String nameHall,
			@RequestParam(value = "worker") Long idWorker) {

		Hall hall = new Hall(nameHall);
		Worker worker = workerService.findOneById(idWorker);

		hall.setWorker(worker);

		hallService.saveHall(hall);
		return "redirect:/showAllHalls?message=true";

	}

	@RequestMapping(value = "/updateHall-{id}", method = RequestMethod.GET)
	public String updateHall(@PathVariable("id") Long id, Model model) {
		model.addAttribute("hallInfo", hallService.findOneById(id));
		model.addAttribute("workerList", workerService.getAllWorkers());

		return "hall/showHallPerUpdate";
	}

	@RequestMapping(value = "/saveUpdateHall", method = RequestMethod.POST)
	public String saveModify(@ModelAttribute(value = "hallInfo") Hall hall,
			@RequestParam("worker") Long idWorker) {

		Worker worker = workerService.findOneById(idWorker);
		hall.setWorker(worker);

		hallService.updateHall(hall);

		return "redirect:/showAllHalls?msg=true";
	}

	@RequestMapping(value = "/deleteHall", method = RequestMethod.GET)
	public String deleteHall(@RequestParam("checkbox") Long[] id) {
		for (Long long1 : id) {
			hallService.deleteHall(long1);
		}
		return "redirect:/showAllHalls?notify=true";

	}
}
