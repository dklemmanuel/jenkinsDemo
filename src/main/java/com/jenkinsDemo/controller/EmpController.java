package com.jenkinsDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class EmpController {
	
	@GetMapping("/success")
	public String getEmpDetails() {
		return "Success";
	}

}
