package com.app_jour_j.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addParticipant(Model model) {
		Participant participant = new Participant();
		model.addAttribute("participant", participant);
		
		return "forms/form_participant";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String saveParticipant(Model model, Participant participant) {
		
		if (participant.getIdParticipant() != null) {
			participantService.update(participant);
		} else {			
			participantService.save(participant);
		}
		
		return "redirect:/participant/add";
	}
	

	@RequestMapping(value = "/edit/{idParticipant}")
	public String editParticipant(Model model, @PathVariable Long idParticipant) {
		if (idParticipant != null) {
			Participant participant = participantService.getById(idParticipant);
			if (participant != null) {
				model.addAttribute("participant", participant);
			}
		}
		return "forms/form_participant";
	}
	
	@RequestMapping(value = "/delete/{id}")
	public String deleteParticipant(Model model, @PathVariable Long id) {
		
		if (id != null) {
			Participant participant = participantService.getById(id);
			if (participant != null) {
				participantService.remove(id);
			}
		}
		return "redirect:/participant/";
	}
}
