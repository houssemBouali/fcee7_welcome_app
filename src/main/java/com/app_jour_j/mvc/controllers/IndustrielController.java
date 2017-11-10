package com.app_jour_j.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String add(Model model) {
		Industriel industriel = new Industriel();
		model.addAttribute("industriel", industriel);

		return "forms/form_industriel";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String saveEnseignant(Model model, Industriel industriel) {
		indusService.save(industriel);

		return "redirect:/industriel/add";
	}
}
