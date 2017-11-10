package com.app_jour_j.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.app_jour_j.mvc.entities.Participant;
import com.app_jour_j.mvc.services.IParticipantService;

@Controller
@RequestMapping(value = "/participant")
public class ParticipantController {

	@Autowired
	IParticipantService participantService;

	@RequestMapping(value = "/")
	public String getAll(Model model) {
		List<Participant> participants = participantService.selectAll();
		if (participants == null) {
			participants = new ArrayList<Participant>();
		}
		model.addAttribute("participants", participants);
		return "main_views/participant";
	}

	@RequestMapping(value = "/add")
	public String add() {

		return "forms/form_participant";
	}
}
