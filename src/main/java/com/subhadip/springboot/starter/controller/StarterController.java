package com.subhadip.springboot.starter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {

	@RequestMapping("/")
	public String index() {
		return "Hello from Subhadip";
	}
}
