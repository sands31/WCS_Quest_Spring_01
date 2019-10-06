package com.wildcodeschool.SpringChallenge01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Controller
@SpringBootApplication
public class SpringChallenge01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringChallenge01Application.class, args);
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		String html;
		html ="<ul>"
				+ "<li><a href=\"/doctor/3\">Jon Pertwee</a></li>"
				+ "<li><a href=\"/doctor/7\">Sylvester McCoy</a></li>"
				+ "<li><a href=\"/doctor/11\">Matt Smith</a></li>"
				+ "<li><a href=\"/doctor/13\">Jodie Whittaker</a></li>"
				+"</ul>";
		
		return html;
	}
	
	
	@RequestMapping("/doctor/3")
	@ResponseBody
	public String pertwee() {
		return "Jon Pertwee";
	}
	
	@RequestMapping("/doctor/7")
	@ResponseBody
	public String mcCoy() {
		return "Sylvester McCoy";
	}
	
	@RequestMapping("/doctor/11")
	@ResponseBody
	public String smith() {
		return "Matt Smith";
	}
	
	@RequestMapping("/doctor/13")
	@ResponseBody
	public String whittaker() {
		return "Jodie Whittaker";
	}

}
