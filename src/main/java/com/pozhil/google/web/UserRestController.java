package com.pozhil.google.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Rest controller for getting logged user details
 * 
 * @author Sarath Muraleedharan
 *
 */
@RestController
public class UserRestController {
	@RequestMapping("/user")
	public Principal sayHello(Principal principal) {
		return principal;
	}

}
