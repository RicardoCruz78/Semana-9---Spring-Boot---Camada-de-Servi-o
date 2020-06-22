package br.com.ricardo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.ricardo.util.Calculadora;

@Configuration
public class AppConfig {
	
	@Bean
	public Calculadora getCalculadora() {
		return new Calculadora();
	}
}

