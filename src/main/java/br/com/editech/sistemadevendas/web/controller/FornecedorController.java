package br.com.editech.sistemadevendas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/CadFornecedor")
public class FornecedorController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "cadastros/CadFornecedor";
	}
}
