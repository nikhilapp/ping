package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.components.PingDomain;

@RestController
public class TestController {

	@Autowired
	private PingDomain e;
	
	@RequestMapping("/")
	public String hello() {
		//Example e  = new Example();
		return e.statusCheck();
	}
}
