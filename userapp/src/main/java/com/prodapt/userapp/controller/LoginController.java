package com.prodapt.userapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prodapt.userapp.entity.Role;
import com.prodapt.userapp.entity.User;
import com.prodapt.userapp.entity.UserDetails;
import com.prodapt.userapp.exceptions.InvalidCredentialsException;
import com.prodapt.userapp.service.UserDetailsService;
import com.prodapt.userapp.service.UserService;

@Controller
	public class LoginController {
		@Autowired
		private UserService userService;

		@PostMapping("/login")
		public String loginUser(@ModelAttribute("user") User user) {
				ModelAndView mv = new ModelAndView();
			try {
				User usr = userService.loginUser(user);
				if(usr.getRole().getName().equals("ADMIN")) {
					return "redirect:/admin";
				}
				else if(usr.getRole().equals("USER")){
					return "redirect:/user";
				}
//				mv.addObject("userData",usr);
//				mv.setViewName("loggedUser");
			} catch (InvalidCredentialsException e) {
//				mv.addObject("errormsg", "Username or Password incorrect");
//				mv.setViewName("login");
				return "redirect:/invalid";
			}
			 return "redirect:/notactive";
			
//			return mv;
		}

		@GetMapping("/loginform")
		public String showLoginForm(@ModelAttribute("user") User user) {
			return "login";
		}
		@GetMapping("/notactive")
		public ModelAndView notactive()
		{
			ModelAndView mv = new ModelAndView();
			mv.setViewName("noactive");
			return mv;
		}
		@GetMapping("/admin")
		public ModelAndView showadminpage()
		{
			ModelAndView mv = new ModelAndView();
			List<User> users=userService.allUser();
			mv.addObject("usersList",users);
			mv.setViewName("admin");
			return mv;
		}
		@RequestMapping("/delete")
		public String showdeletepage(@RequestParam("id") Long id)
		{
			userService.deleteUserById(id);
			return "redirect:/admin";
		}
		@GetMapping("/updateform")
		public ModelAndView showupdatepage(@ModelAttribute("user") User user,@ModelAttribute("userdetails") UserDetails userdetails,
				@ModelAttribute("userrole") Role role,@RequestParam("id") Long id)
		{
			ModelAndView mv = new ModelAndView();
			user.setUserId(id);
			mv.setViewName("update");
			return mv;
		}
		@GetMapping("/invalid")
		public ModelAndView invalid()
		{
			ModelAndView mv = new ModelAndView();
			mv.setViewName("invalid");
			return mv;
		}
		@PostMapping("/updateuser")
		public ModelAndView updateUser(@ModelAttribute("user") User user,@ModelAttribute("userdetails") UserDetails userdetails,
				@ModelAttribute("role") Role role,@RequestParam("id") Long id) {
			
			ModelAndView mv = new ModelAndView();
			user.setRole(role);
			user.setUserDetails(userdetails);
			userService.updateUser(user);
			mv.setViewName("redirect:/admin");
			return mv;
		}
	}

