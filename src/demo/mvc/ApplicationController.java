package demo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "showform";
	}
	
	// add new controller method to read form data
	// add data to model
	
	@RequestMapping("/processFormModel")
	public String capitalize(HttpServletRequest request, Model model) {
		// read the request parameter from HTML form
		String theName = request.getParameter("studentName");
		
		// convert data to capital letters
		theName = theName.toUpperCase();
		
		// Create the message
		String result = "Hello "+theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
	
}
