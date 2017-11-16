package com.app_jour_j.mvc.controllers;

import java.io.FileOutputStream;
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
import com.itextpdf.text.Document;
<<<<<<< HEAD
import com.itextpdf.text.FontFactory;
=======
>>>>>>> 31a8d172d443b98b819568cb2d998095ff9f6336
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

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
		generatePdf(participant);
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
	
	private void generatePdf(Participant participant){
		Document doc = new Document();
<<<<<<< HEAD
		Document docFull = new Document();
=======
		
>>>>>>> 31a8d172d443b98b819568cb2d998095ff9f6336
		try {
			PdfWriter.getInstance(doc, new FileOutputStream(
					getClass().getResource("/pdf/participants/").getFile() 
					+ participant.getIdParticipant()
					+"_"+participant.getNom() + ".pdf"));
<<<<<<< HEAD
			PdfWriter.getInstance(docFull, new FileOutputStream(
					getClass().getResource("/pdf/participants/").getFile() 
					+ participant.getIdParticipant()
					+"_full_"+participant.getNom() + ".pdf"));
			Rectangle size = new Rectangle(228, 150);
			doc.setPageSize(size);
			docFull.setPageSize(size);
			doc.addAuthor(EnseignantController.AUTHOR);
			docFull.addAuthor(EnseignantController.AUTHOR);
			doc.addTitle("Participant");
			docFull.addTitle("Participant_full");
			doc.open();
			docFull.open();
			Phrase infos = new Phrase("Nom : " + participant.getNom() +  
									  "\nPrÃ©nom : " + participant.getPrenom() + 
									  "\nEtablissement : " + participant.getEtablissement(),
									  FontFactory.getFont(FontFactory.COURIER, 10));
			Phrase fullInfo = new Phrase(participant.toString(), FontFactory.getFont(FontFactory.COURIER, 10));
			doc.add(infos);
			docFull.add(fullInfo);
=======
			Rectangle size = new Rectangle(228, 150);
			doc.setPageSize(size);
			doc.addAuthor(EnseignantController.AUTHOR);
			doc.addTitle("Participant");
			doc.open();
			Phrase infos = new Phrase("Nom : " + participant.getNom() +  
									 		"\nPrénom : " + participant.getPrenom() + 
									 		"\nEtablissement : " + participant.getEtablissement());
			doc.add(infos);
>>>>>>> 31a8d172d443b98b819568cb2d998095ff9f6336
		} catch (Exception e) {
			e.printStackTrace();
		}
		doc.close();
<<<<<<< HEAD
		docFull.close();
=======
>>>>>>> 31a8d172d443b98b819568cb2d998095ff9f6336
		
	}
}
