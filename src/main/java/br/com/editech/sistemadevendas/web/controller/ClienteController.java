package br.com.editech.sistemadevendas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/CadCliente")
public class ClienteController {

	@GetMapping("cadastrar")
	public String cadastrar() {
		return "cadastros/CadCliente";
	}
	
}
