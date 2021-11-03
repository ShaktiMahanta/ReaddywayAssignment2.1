package com.Reddyway.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Reddyway.model.Readdyway;
import com.Reddyway.model.dao.ReaddywayRepository;

@Controller
public class ReaddywayController {
	
	@Autowired
	ReaddywayRepository readdy;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addReddyway")
	public String addReddyway(Readdyway readdyway) {
		readdy.save(readdyway);
		return "home.jsp";
		
	}

}
