package com.div.springtesting.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MCFController {
	@GetMapping("/message/{message}")
	public @ResponseBody String greeting(@PathVariable String message) {
		return message;
	}
}
