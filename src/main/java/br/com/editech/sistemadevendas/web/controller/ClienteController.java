package br.com.editech.sistemadevendas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cadastros/cliente")
public class ClienteController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "cadastros/cliente/CadCliente";
	}
	
	@GetMapping("/consultar")
	public String consultar() {
		return "cadastros/cliente/ConCliente";
	}
}
