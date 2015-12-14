package com.softserveinc.edu.ita.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softserveinc.edu.ita.entity.Worker;
import com.softserveinc.edu.ita.service.WorkerService;

@Controller
public class WorkerController {

	@Autowired
	private WorkerService workerService;

	@RequestMapping("/showAllWorkers")
	public String showAllWorkers(Model model) {
		model.addAttribute("workers", workerService.getAllWorkers());
		model.addAttribute("worker", new Worker());
		return "worker/allWorkers";
	}

	@RequestMapping(value = "/saveWorker", method = RequestMethod.POST)
	public String createWorker(@ModelAttribute("worker") Worker worker) {
		workerService.saveWorker(worker);
		return "redirect:/showAllWorkers?message=true";
	}

	@RequestMapping("/deleteWorker/{id}")
	public String deleteWorker(@PathVariable("id") Long id) {
		workerService.deleteWorker(id);
		return "redirect:/showAllWorkers?delete=true";
	}

	@RequestMapping("/editWorker/{id}")
	public String editWorker(@PathVariable("id") Long id, Model model) {
		model.addAttribute("worker", workerService.findOneById(id));
		return "worker/editWorker";
	}
	
	@RequestMapping(value = "/editWorker/{id}", method = RequestMethod.POST)
	public String editWorker(@ModelAttribute("worker") Worker worker) {
		workerService.updateWorker(worker);
		return "redirect:/showAllWorkers?edit=true";
	}

}
