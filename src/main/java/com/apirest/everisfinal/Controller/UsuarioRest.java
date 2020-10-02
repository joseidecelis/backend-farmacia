package com.apirest.everisfinal.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.everisfinal.entity.Usuario;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping
public class UsuarioRest {

	@PostMapping("/login")
	public boolean login(@RequestBody Usuario usuario) {
		
		System.out.print(usuario.getNombreUsuario());
		System.out.print(usuario.getClaveUsuario());
		
		if (usuario.getNombreUsuario().equals("Admin") && usuario.getClaveUsuario().equals("Admin")) {
				
			return true;
		}

		return false;

	}

}
