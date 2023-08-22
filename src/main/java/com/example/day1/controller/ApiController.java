package com.example.day1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController {
	@GetMapping("/welcome")
	public String Welcome() {
		return "Welcome String Boot!";
	}
	@GetMapping("/get")
	public String getName() {
		String studentName="IamNeo";
		return "Welcome "+studentName +"!";
	}
	@GetMapping("/")
	public String getMyFav() {
		String favColor="Green";
		return "My favorite color is "+favColor;
	}
}
