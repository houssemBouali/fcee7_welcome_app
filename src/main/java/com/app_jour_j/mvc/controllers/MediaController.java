package com.app_jour_j.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/media")
public class MediaController {
	
	@RequestMapping(value = "/media")
	public String test(){
		
		return "main_views/media";
	}
}
