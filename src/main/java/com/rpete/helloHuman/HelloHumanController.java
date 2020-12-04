package com.rpete.helloHuman;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="firstName", required = false) String fName) {
		if(fName == null) {
			return "Hello Human!";
		} else {
			return "Hello " + fName;
		}
	}

	
	@RequestMapping("/{firstName} {lastName}")
	public String hello(@PathVariable("firstName") String fName, @PathVariable("lastName") String lName) {
		return "Hello! We have your full name: " + fName + " " + lName;
	}

	
//	@RequestMapping("/{fName}/{lName}")
//	public String hello(@RequestParam(required=false) String fName, @RequestParam(required=false) String lName) {
//		if(lName == null) {
//			return "We have your first name: " + fName;
//		} else {
//			return "We have your full name: " + fName + " " + lName;
//		}
//	}
	
}
