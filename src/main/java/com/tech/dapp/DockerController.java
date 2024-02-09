package com.tech.dapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	@GetMapping("/get")
public String post() {
	return "Hello";
}
}
