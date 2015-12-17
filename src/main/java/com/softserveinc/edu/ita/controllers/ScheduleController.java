package com.softserveinc.edu.ita.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.softserveinc.edu.ita.entity.Schedule;
import com.softserveinc.edu.ita.service.ScheduleService;

@Controller
public class ScheduleController {

	@Autowired
	private ScheduleService scheduleService;

	@RequestMapping(value = "/showAllSchedules", method = RequestMethod.GET)
	public String showAllSchedules(Model model) {
		model.addAttribute("schedules", scheduleService.getAllSchedules());
		return "schedule/show-schedules";
	}

	@RequestMapping(value = "/createSchedule", method = RequestMethod.GET)
	public String createSchedule(Model model) {
		model.addAttribute("schedule", new Schedule());
		return "schedule/addNewSchedule";
	}

	@RequestMapping(value = "/saveSchedule", method = RequestMethod.POST)
	public String saveSchedule(@ModelAttribute("schedule") Schedule schedule) {
		scheduleService.saveSchedule(schedule);
		return "redirect:/show-schedules?message=true";
	}

	@RequestMapping(value = "/deleteSchedule", method = RequestMethod.GET)
	public String deleteSchedule(@RequestParam("checkbox") Long[] id) {
		for (Long long1 : id) {
			scheduleService.deleteSchedule(long1);
		}
		return "redirect:/showAllSchedules?delete=true";
	}

	@RequestMapping(value = "/editSchedule/{id}", method = RequestMethod.GET)
	public String editSchedule(@PathVariable("id") Long id, Model model) {
		model.addAttribute("schedule", scheduleService.findOneById(id));
		return "schedule/showSchedulePerUpdate";
	}

	@RequestMapping(value = "/editSchedule/{id}", method = RequestMethod.POST)
	public String editSchedule(@ModelAttribute("schedule") Schedule schedule) {
		scheduleService.updateSchedule(schedule);
		return "redirect:/showAllSchedules?edit=true";
	}

}
