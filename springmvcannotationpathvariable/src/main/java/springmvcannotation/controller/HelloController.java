package springmvcannotation.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hellomessage/{message}")
	public ModelAndView getmessage(@PathVariable("message") String message) {
	ModelAndView mv=new ModelAndView();
	//name on jsp page or view
	mv.setViewName("welcomewithpathvariable");
	//data that you want to show on view
	mv.addObject("message",message);
	return mv;
}
	@RequestMapping("/hellostring.htm")
	public String greeting() {
		return "hello";
	}
}
 