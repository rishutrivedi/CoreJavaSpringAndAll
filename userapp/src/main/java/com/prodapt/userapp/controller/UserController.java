package com.prodapt.userapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.prodapt.userapp.entity.Role;
import com.prodapt.userapp.entity.User;
import com.prodapt.userapp.entity.UserDetails;
import com.prodapt.userapp.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("registrationform")
	public String showRegistrationForm(@ModelAttribute("user") User user,@ModelAttribute("userdetails") UserDetails userd) {
		return "registration";
	}
	@PostMapping("/registeruser")
	public ModelAndView userRegistration(@ModelAttribute("user") User user,@ModelAttribute("userdetails") UserDetails userdetails) {
			ModelAndView mv = new ModelAndView();
			user.setUserDetails(userdetails);	
			userService.addUser(user);
			
			mv.setViewName("redirect:/loginform");
		return mv;
	}
}