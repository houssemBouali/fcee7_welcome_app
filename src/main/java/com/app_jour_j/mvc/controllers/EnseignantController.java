package com.app_jour_j.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app_jour_j.mvc.entities.Enseignant;
import com.app_jour_j.mvc.services.IEnseignantService;

@Controller
@RequestMapping(value = "/enseignant")
public class EnseignantController {

	@Autowired
	IEnseignantService enseignantService;

	@RequestMapping(value = "/")
	public String getAll(Model model) {
		List<Enseignant> enseignants = enseignantService.selectAll();
		if (enseignants == null) {
			enseignants = new ArrayList<Enseignant>();
		}
		model.addAttribute("enseignants", enseignants);
		return "main_views/enseignant";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addEnseignant(Model model) {
		Enseignant enseignant = new Enseignant();
		model.addAttribute("enseignant", enseignant);
		return "forms/form_enseignant";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String saveEnseignant(Model model, Enseignant enseignant) {
		enseignantService.save(enseignant);
		
		return "forms/form_enseignant";
	}


}
