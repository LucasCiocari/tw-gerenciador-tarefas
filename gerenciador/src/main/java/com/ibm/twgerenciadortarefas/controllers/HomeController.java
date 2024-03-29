package com.ibm.twgerenciadortarefas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //Entende as requisições feitas pela app java
public class HomeController {
	
	@GetMapping("/")
	public ModelAndView home() {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("home/home");

	    mv.addObject("mensagem", "mensagem do controller");

		return mv;
	}
}
