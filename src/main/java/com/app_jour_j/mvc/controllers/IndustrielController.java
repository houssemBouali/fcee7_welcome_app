package com.app_jour_j.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app_jour_j.mvc.entities.Industriel;
import com.app_jour_j.mvc.services.IIndustrielService;

@Controller
@RequestMapping(value = "/industriel")
public class IndustrielController {

	@Autowired
	IIndustrielService indusService;

	@RequestMapping(value = "/")
	public String getAll(Model model) {
		List<Industriel> industriels = indusService.selectAll();
		if (industriels == null) {
			industriels = new ArrayList<Industriel>();
		}
		model.addAttribute("industriels", industriels);
		return "main_views/industriel";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addIndustriel(Model model) {
		Industriel industriel = new Industriel();
		model.addAttribute("industriel", industriel);

		return "forms/form_industriel";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String saveIndustriel(Model model, Industriel industriel) {
		
		if (industriel.getIdIndustriel() != null) {
			indusService.update(industriel);
		} else {			
			indusService.save(industriel);
		}

		return "redirect:/industriel/add";
	}
	
	@RequestMapping(value = "/edit/{idIndustriel}")
	public String editIndustriel(Model model, @PathVariable Long idIndustriel) {
		if (idIndustriel != null) {
			Industriel industriel = indusService.getById(idIndustriel);
			if (industriel != null) {
				model.addAttribute("industriel", industriel);
			}
		}
		return "forms/form_industriel";
	}
	
	@RequestMapping(value = "/delete/{id}")
	public String deleteIndustriel(Model model, @PathVariable Long id) {
		
		if (id != null) {
			Industriel industriel = indusService.getById(id);
			if (industriel != null) {
				indusService.remove(id);
			}
		}
		return "redirect:/industriel/";
	}
}
