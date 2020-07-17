package com.xworkz.spring.calamities.services;

import com.xworkz.spring.calamities.dto.CalamityDTO;

public interface CalamityService {

	public int validateAndSave(CalamityDTO calamityDTO);
}
