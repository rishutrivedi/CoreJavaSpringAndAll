package springmvcannotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello.htm")
	public ModelAndView greet() {
	ModelAndView mv=new ModelAndView();
	//name on jsp page or view
	mv.setViewName("welcome");
	//data that you want to show on view
	mv.addObject("name","prodapt");
	return mv;
	}	
	@RequestMapping("/helloparam.htm")
	public ModelAndView greet(@RequestParam("name") String name) {
	ModelAndView mv=new ModelAndView();
	//name on jsp page or view
	mv.setViewName("welcome");
	//data that you want to show on view
	mv.addObject("name",name);
	return mv;
}
	@RequestMapping("/helloparam2.htm")
	public ModelAndView greet(@RequestParam("name") String name ,@RequestParam("name1") String name1) {
	ModelAndView mv=new ModelAndView();
	//name on jsp page or view
	mv.setViewName("welcomewithtwoparam");
	//data that you want to show on view
	mv.addObject("name",name);
	mv.addObject("name1",name1);
	return mv;
}
	@RequestMapping("/hellostring.htm")
	public String greeting() {
		return "hello";
	}
}
