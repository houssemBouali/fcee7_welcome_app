package com.app_jour_j.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/industriel")
public class IndustrielController {

	@RequestMapping(value = "/")
	public String test(){
		return "main_views/industriel";
	}
}
