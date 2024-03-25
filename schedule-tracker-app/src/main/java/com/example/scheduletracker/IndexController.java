package com.example.scheduletracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@Autowired
	CalendarService calendarService;

	@GetMapping("/scheduletracker")
	public String init() {	
		return "index";
	}
	
	public String getResult() {
		return "index";
	}
	
	
}
