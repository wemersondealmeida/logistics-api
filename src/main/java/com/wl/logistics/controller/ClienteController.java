package com.wl.logistics.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wl.logistics.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		Cliente c1 = new Cliente();
		c1.setId(1L);
		c1.setNome("Wemerson");
		c1.setEmail("wemerson@gmail.com");
		c1.setTelefone("61 3216549877");
		
		var c2 = new Cliente();
		c2.setId(2L);
		c2.setNome("Lini");
		c2.setEmail("lini@gmail.com");
		c2.setTelefone("61 987654987");
		
		return Arrays.asList(c1, c2);
	}
}
