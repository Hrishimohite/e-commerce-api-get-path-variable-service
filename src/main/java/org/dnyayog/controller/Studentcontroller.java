package org.dnyayog.controller;

import org.dnyayog.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Studentcontroller {
	@GetMapping("/firstName/{username}")
	public String getFirstName(@PathVariable String username) {
		return new StudentService().getFirstName(username);
	}

	@GetMapping("/email/{username}")
	public String getEmail(@PathVariable String username) {
		return new StudentService().getEmail(username);
	}

}
