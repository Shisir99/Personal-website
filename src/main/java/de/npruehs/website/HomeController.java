package de.npruehs.website;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import de.npruehs.website.model.Project;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "redirect:home";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		Project[] projects = new Project[4];
		
		projects[0] = new Project();
		projects[0].setName("Notes Application(CLI based)");
		projects[0].setSummary("Simple Nodejs Command Line based application to perform basic operations like add, delete, update notes.");
		projects[0].setImgSrc("img/notes.png");
		projects[0].setUrl("https://github.com/Shisir99/Notes-App");
		
		projects[1] = new Project();
		projects[1].setName("CORONA-VIRUS TRACKING APPLICATION | Web Development");
		projects[1].setSummary("Used Spring boot.Took dataset from the cssegianddata github repository which is updated on daily basis. Spring boot’s thymeleaf and web dependencies were used");
		projects[1].setImgSrc("img/corona.png");
		projects[1].setUrl("https://github.com/Shisir99/Corona-Virus-tracker-Application");
		
		projects[2] = new Project();
		projects[2].setName("Linear Regression Program");
		projects[2].setSummary("Python program to perform linear regression on 2- dimensional data created from scratch.");
		projects[2].setImgSrc("img/linear_regression.png");
		projects[2].setUrl("https://github.com/Shisir99/Linear-Regression");
		
		projects[3] = new Project();
		projects[3].setName("NIDRA| Internet of things");
		projects[3].setSummary(" Arduino based device using bluetooth module and gyro sensor to detect to detect sleep walking. An automated band was used to alarm people in case of sleep walk");
		projects[3].setImgSrc("img/nidra.png");
		projects[3].setUrl("https://github.com/Shisir99/Linear-Regression");
		

		Collections.reverse(Arrays.asList(projects)); 

		model.addAttribute("projects", projects);
		return "home";
	}
	
	@GetMapping("/impressum")
	public String impressum() {
		return "impressum";
	}
}
