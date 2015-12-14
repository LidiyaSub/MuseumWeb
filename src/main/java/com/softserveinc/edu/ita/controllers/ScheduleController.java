package com.softserveinc.edu.ita.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softserveinc.edu.ita.entity.Schedule;
import com.softserveinc.edu.ita.service.ScheduleService;

@Controller
public class ScheduleController {

	@Autowired
	private ScheduleService scheduleService;

	@RequestMapping("/showAllSchedules")
	public String showAllSchedules(Model model) {
		return "schedule/allSchedules";
	}

	@RequestMapping("/createSchedule")
	public String createSchedule(Model model) {
		model.addAttribute("schedule", new Schedule());
		return "schedule/newSchedule";
	}

	@RequestMapping(value = "/createSchedule", method = RequestMethod.POST)
	public String createSchedule(@ModelAttribute("createSchedule") Schedule schedule) {
		scheduleService.saveSchedule(schedule);
		return "schedule/newSchedule";
	}
}
