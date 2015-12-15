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
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping(value = "/showAllWorkers", method = RequestMethod.GET)
	public String showAllWorkers(Model model) {
		model.addAttribute("workers", workerService.getAllWorkers());
		model.addAttribute("worker", new Worker());
		return "worker/show-workers";
	}

	@RequestMapping(value = "/saveWorker", method = RequestMethod.POST)
	public String createWorker(@ModelAttribute("worker") Worker worker) {
		workerService.saveWorker(worker);
		return "redirect:/showAllWorkers?message=true";
	}

	@RequestMapping(value = "/deleteWorker", method = RequestMethod.GET)
	public String deleteWorker(@RequestParam("checkbox") Long[] id) {
		for (Long long1 : id) {
			workerService.deleteWorker(long1);
		}
		return "redirect:/showAllWorkers?delete=true";
	}

	@RequestMapping(value = "/editWorker/{id}", method = RequestMethod.GET)
	public String editWorker(@PathVariable("id") Long id, Model model) {
		model.addAttribute("worker", workerService.findOneById(id));
		return "worker/showWorkerPerUpdate";
	}

	@RequestMapping(value = "/editWorker/{id}", method = RequestMethod.POST)
	public String editWorker(@ModelAttribute("worker") Worker worker) {
		workerService.updateWorker(worker);
		return "redirect:/show-workers?edit=true";
	}

	@RequestMapping(value = "/assignWorkerToSchedule", method = RequestMethod.GET)
	public String assignWorkerToSchedule(Model model) {
		model.addAttribute("schedules", scheduleService.getAllSchedules());
		model.addAttribute("workers", workerService.getAllWorkers());
		return "worker/assignWorkerToSchedule";
	}

	@RequestMapping(value = "/assignWorkerToSchedule", method = RequestMethod.POST)
	public String assignWorkerToSchedule(@RequestParam("workerName") Long workerId,
			@RequestParam("scheduleName") Long[] scheduleId) {
		List<Schedule> list = new ArrayList<Schedule>();
		Worker worker = workerService.findOneById(workerId);
		for (Long long1 : scheduleId) {
			Schedule schedule = scheduleService.findOneById(long1);
			list.add(schedule);
		}
		worker.setListOfSchedule(list);
		workerService.updateWorker(worker);
		return "redirect:/showAllWorkers";
	}

}
