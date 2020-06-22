package br.com.ricardo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ricardo.model.Usuario;
import br.com.ricardo.service.UsuarioService;




@Controller
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping (value = {"/login", "/"})
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject(new Usuario());
		return mv;
		
	}
	@PostMapping ("/fazerLogin")
	public String fazerLogin (Usuario usuario) {
		if (usuarioService.existe(usuario))
			return "redirect:/veiculos"; 
		
		else
			return "login";
	}

}