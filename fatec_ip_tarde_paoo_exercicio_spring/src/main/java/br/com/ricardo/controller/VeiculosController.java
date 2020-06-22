package br.com.ricardo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ricardo.model.Veiculo;
import br.com.ricardo.service.VeiculosService;

@Controller
public class VeiculosController {	
	
		//@Autowired
		//private VeiculosRepository veiculosRepo;
	@Autowired
	private VeiculosService veiculosService;
		@GetMapping("/veiculos")
		public ModelAndView listarVeiculos() {
			//List <Veiculo> veiculos = veiculosRepo.findAll();
			List <Veiculo> veiculos = veiculosService.listarTodos();
			ModelAndView mv = new ModelAndView("veiculos");
			mv.addObject(new Veiculo());
			mv.addObject("veiculos", veiculos);
			return mv;			
		}
		
		@PostMapping ("/veiculos")
		public String salvar( Veiculo veiculo) {
			//veiculosRepo.save(veiculo);
			veiculosService.salvar(veiculo);
			return "redirect:/veiculos";
		}
	}
