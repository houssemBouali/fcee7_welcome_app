package com.app_jour_j.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/enseignant")
public class EnseignantController {
	
	@RequestMapping(value = "/enseignant")
	public String test () {
		
		return "main_views/enseignant";
	}

}
