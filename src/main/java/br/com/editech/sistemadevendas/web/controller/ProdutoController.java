package br.com.editech.sistemadevendas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/CadProduto")
public class ProdutoController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "cadastros/CadProduto";
	}
}
