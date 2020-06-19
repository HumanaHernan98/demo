package demo.example.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping("index")
	public String main(Model model) {
		
		return "index";
	}
	
	@GetMapping("principal")
	public String principal(Model model) {
		return "principal";
	}
	
}