package br.com.editech.sistemadevendas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/CadFuncionario")
public class FuncionarioController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "cadastros/CadFuncionario";
	}
}
