package com.app_jour_j.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app_jour_j.mvc.entities.Enseignant;
import com.app_jour_j.mvc.services.IEnseignantService;

@Controller
@RequestMapping(value = "/enseignant")
public class EnseignantController {

	@Autowired
	IEnseignantService enseignantService;
	
	@RequestMapping(value = "/")
	public String test (Model model) {
		List<Enseignant> enseignants = enseignantService.selectAll();
		if (enseignants == null) {
			enseignants = new ArrayList<Enseignant>();
		}
		model.addAttribute("enseignants", enseignants);
		return "main_views/enseignant";
	}

}
