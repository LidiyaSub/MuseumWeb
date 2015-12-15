package com.softserveinc.edu.ita.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softserveinc.edu.ita.dto.WorkerScheduleDTO;
import com.softserveinc.edu.ita.entity.Schedule;
import com.softserveinc.edu.ita.entity.Worker;
import com.softserveinc.edu.ita.service.ScheduleService;
import com.softserveinc.edu.ita.service.WorkerService;

@Controller
public class WorkerController {

	@Autowired
	private WorkerService workerService;

	@Autowired
	private ScheduleService scheduleService;

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

	@RequestMapping(value = "/assignWorkerToSchedule")
	public String assignWorkerToSchedule(Model model) {
		model.addAttribute("workerSchedule", new WorkerScheduleDTO());
		model.addAttribute("schedules", scheduleService.getAllSchedules());
		model.addAttribute("workers", workerService.getAllWorkers());
		return "worker/assignWorkerToSchedule";
	}

	@RequestMapping(value = "/assignWorkerToSchedule", method = RequestMethod.POST)
	public String assignWorkerToSchedule(@ModelAttribute("schedule") Schedule schedule,
			@ModelAttribute("worker") Worker worker, @ModelAttribute ("workerSchedule") WorkerScheduleDTO wsDTO) {
		
		System.out.println(schedule);
		System.out.println(worker);
		System.out.println(wsDTO);
		List<Schedule> listOfSchedule = new ArrayList<Schedule>();
		for (Schedule schedule2 : wsDTO.getSchedule()) {
			listOfSchedule.add(schedule2);
		}
		worker.setListOfSchedule(listOfSchedule);
		workerService.updateWorker(worker);
		
		return "worker/showAllWorkers";
	}

}
