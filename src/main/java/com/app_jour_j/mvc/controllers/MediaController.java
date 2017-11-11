package com.app_jour_j.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app_jour_j.mvc.entities.Media;
import com.app_jour_j.mvc.services.IMediaService;

@Controller
@RequestMapping(value = "/media")
public class MediaController {

	@Autowired
	IMediaService mediaService;

	@RequestMapping(value = "/")
	public String getAll(Model model) {
		List<Media> medias = mediaService.selectAll();
		if (medias == null) {
			medias = new ArrayList<Media>();
		}
		model.addAttribute("medias", medias);
		return "main_views/media";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addMedia(Model model) {
		Media media = new Media();
		model.addAttribute("media", media);

		return "forms/form_media";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String saveMedia(Model model, Media media) {
		
		if(media.getIdMedia() != null) {
			mediaService.update(media);
		} else {			
			mediaService.save(media);
		}

		return "redirect:/media/add";
	}
	
	@RequestMapping(value = "/edit/{idMedia}")
	public String editMedia(Model model, @PathVariable Long idMedia) {
		if (idMedia != null) {
			Media media = mediaService.getById(idMedia);
			if (media != null) {
				model.addAttribute("media", media);
			}
		}
		return "forms/form_media";
	}
	
	@RequestMapping(value = "/delete/{id}")
	public String deleteMedia(Model model, @PathVariable Long id) {
		
		if (id != null) {
			Media media = mediaService.getById(id);
			if (media != null) {
				mediaService.remove(id);
			}
		}
		return "redirect:/media/";
	}
}
