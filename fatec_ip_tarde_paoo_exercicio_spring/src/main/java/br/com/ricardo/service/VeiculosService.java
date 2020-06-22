package br.com.ricardo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ricardo.model.Veiculo;
import br.com.ricardo.repository.VeiculosRepository;
import br.com.ricardo.util.Calculadora;



@Service
public class VeiculosService {
	@Autowired
	private VeiculosRepository veiculosRepo;
	
	@Autowired
	private Calculadora calculadora;
	
	public void salvar (Veiculo veiculo) {
		veiculosRepo.save(veiculo);
	}
	
	public List <Veiculo> listarTodos(){
		List <Veiculo> veiculos = veiculosRepo.findAll();
		for(Veiculo veiculo: veiculos) {
			veiculo.setAutonomia(calculadora.calculaAutonomia(veiculo.getLitros(), veiculo.getKml()));
		}
		return veiculos;
	}
		
}
