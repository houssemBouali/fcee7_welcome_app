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

import com.app_jour_j.mvc.entities.Enseignant;
import com.app_jour_j.mvc.services.IEnseignantService;
import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

@Controller
@RequestMapping(value = "/enseignant")
public class EnseignantController {

	public static final String AUTHOR = "Eniso Google Club";

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

		if (enseignant.getIdProfessor() != null) {
			enseignantService.update(enseignant);
		} else {
			enseignantService.save(enseignant);
		}
		generatePdf(enseignant);
		return "redirect:/enseignant/add";
	}

	@RequestMapping(value = "/edit/{idEnseignant}")
	public String editEnseignant(Model model, @PathVariable Long idEnseignant) {
		if (idEnseignant != null) {
			Enseignant enseignant = enseignantService.getById(idEnseignant);
			if (enseignant != null) {
				model.addAttribute("enseignant", enseignant);
			}
		}
		return "forms/form_enseignant";
	}

	@RequestMapping(value = "/delete/{id}")
	public String deleteEnseignant(Model model, @PathVariable Long id) {

		if (id != null) {
			Enseignant enseignant = enseignantService.getById(id);
			if (enseignant != null) {
				enseignantService.remove(id);
			}
		}
		return "redirect:/enseignant/";
	}

	private void generatePdf(Enseignant enseignant) {
		Document doc = new Document();

		try {
			PdfWriter.getInstance(doc,
					new FileOutputStream(
							"C:\\Users\\BOUALI\\Documents"
							+ "\\workspace-sts-3.8.4.RELEASE\\"
							+ "app_jour_j\\pdf\\enseignants\\" + enseignant.getNom() + ".pdf"));
			Rectangle size = new Rectangle(228, 150);
			doc.setPageSize(size);
			doc.addAuthor(AUTHOR);
			doc.addTitle("Enseignant");
			doc.open();
			Phrase infos = new Phrase("Nom : " + enseignant.getNom() + 
									  "\nPrénom : " + enseignant.getPrenom() + 
									  "\nGrade : " + enseignant.getGrade());
			doc.add(infos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		doc.close();

	}

}
