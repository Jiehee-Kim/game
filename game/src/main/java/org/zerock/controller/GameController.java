package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domain.NumberDTO;
import domain.NumberService;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/game/*")
@Log4j
public class GameController {

	@RequestMapping("")
	public void basic() {
		log.info("basic.............");
	}
	
	@RequestMapping(value = "/basic", method= {RequestMethod.GET, RequestMethod.POST})
	public void basicGet() {
		log.info("basic get...........");
	}
	
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("basic get only get.........");
	}
	
	@SuppressWarnings("null")
	@GetMapping("/computer")
	public void ComputerNumber() {
		
		NumberDTO dto = null;
		NumberService s = null;
		
		dto.setComputerNumber(s.ComputerNumber());
		log.info("ComputerNumber : " + dto.getComputerNumber());
		
	}
}
