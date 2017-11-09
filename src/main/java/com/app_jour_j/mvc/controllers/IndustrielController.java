package com.app_jour_j.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app_jour_j.mvc.entities.Industriel;
import com.app_jour_j.mvc.services.IIndustrielService;

@Controller
@RequestMapping(value = "/industriel")
public class IndustrielController {

	@Autowired
	IIndustrielService indusService;
	
	@RequestMapping(value = "/")
	public String getAllIndustriels(Model model){
		List<Industriel> industriels = indusService.selectAll();
		if (industriels == null) {
			industriels = new ArrayList<Industriel>();
		}
		model.addAttribute("industriels", industriels);
		return "main_views/industriel";
	}
}
