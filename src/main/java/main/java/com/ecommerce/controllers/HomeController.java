package main.java.com.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String showHomePage() {
		
		System.out.println("In Home Page");
		
		return "home";
	}
}
