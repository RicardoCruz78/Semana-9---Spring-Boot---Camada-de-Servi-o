package br.com.ricardo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ricardo.model.Usuario;
import br.com.ricardo.repository.UsuarioRepository;

  @Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepo;
	
	public boolean existe (Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(),usuario.getSenha()) != null;
	}

}
