package br.com.editech.sistemadevendas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cadastros/fornecedor")
public class FornecedorController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "cadastros/fornecedor/CadFornecedor";
	}
	
	@GetMapping("/consultar")
	public String consultar() {
		return "cadastros/fornecedor/ConFornecedor";
	}
}
