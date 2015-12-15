package com.softserveinc.edu.ita.controllers;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softserveinc.edu.ita.entity.Author;
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
	
	@RequestMapping("/showAllHalls")
	public String showHalls(Model model){
		List<Hall> listHalls = hallService.getAllHalls();
//		Hibernate.initialize(listHalls);
//		for (int i = 0; i < listHalls.size(); i++) {
//			Hibernate.initialize(listHalls.get(i));
//			Hibernate.initialize(listHalls.get(i).getWorker());
//			for (int k = 0; k < listHalls.get(i).getShowpiece().size(); k++) {
//				Hibernate.initialize(listHalls.get(i).getShowpiece().get(k).getNameShowpiece());
//			}
//			
//		}
		for (int i = 0; i < listHalls.size(); i++) {
			listHalls.get(i).getWorker();
			listHalls.get(i).getShowpiece();
		}
		model.addAttribute("allHalls", listHalls);
		return "hall/show-halls";
	}
	
	@RequestMapping("/addHall")
	public String addNewHall(Model model){
		model.addAttribute("hallInfo", new Hall());
		model.addAttribute("workerList", workerService.getAllWorkers());
		model.addAttribute("showpieceList", showpieceService.getAllShowpieces());
//		workerService.collectionDefaultModel(model);
//		showpieceService.collectionDefaultModel(model);
		return "hall/new-hall";
		
	}
	
	@RequestMapping(value="/saveHall", method = RequestMethod.POST)
	public String saveNewHall(@ModelAttribute("hallInfo") Hall hall){
		//some code
		return "redirect:/showAllHalls?message=true";
	}
	
	@RequestMapping(value="/updateHall-{id}")
	public String updateHall(@PathVariable("id") Long id, Model model){
		Hall hall = hallService.findOneById(id);
		model.addAttribute("hallInfo", hall);
		model.addAttribute("workerList", workerService.getAllWorkers());
		model.addAttribute("showpieceList", showpieceService.getAllShowpieces());
		return "hall/showHallPerUpdate";
	}
	
	@RequestMapping(value = "/saveUpdateHall", method = RequestMethod.POST)
	public String saveModify(@ModelAttribute(value = "hallInfo") Hall hall) {
		hallService.updateHall(hall);
		//some code
		return "redirect:/showAllHalls?msg=true";
	}
	
	@RequestMapping("/deleteHall-{id}")
	public String deleteHall(@PathVariable("id") Long id){
		Hall hall = hallService.findOneById(id);
		hallService.deleteHall(id);
		return "redirect:/showAllHalls?notify=true";
		
	}
}
