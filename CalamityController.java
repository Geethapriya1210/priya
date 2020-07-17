package com.xworkz.spring.calamities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.spring.calamities.dto.CalamityDTO;
import com.xworkz.spring.calamities.services.CalamityService;

@Controller
@RequestMapping
public class CalamityController {

	@Autowired
	private CalamityService service;

	public CalamityController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/register.doc")
	public String register(CalamityDTO calamityEntity, ModelMap map) {
			
			try {
				System.out.println("invoked register");
				int check = this.service.validateAndSave(calamityEntity);
				if (check == 0) {
					map.addAttribute("success", "Data saved");
				} else {
					map.addAttribute("failure", "Data not saved");
				}	
			} catch (Exception e) {
				System.err.println("Exception in register "+e.getMessage());
			}
			return "success";
		}
		
	}
