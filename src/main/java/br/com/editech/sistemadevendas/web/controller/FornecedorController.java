package br.com.editech.sistemadevendas.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.editech.sistemadevendas.domain.Fornecedor;
import br.com.editech.sistemadevendas.domain.UF;
import br.com.editech.sistemadevendas.service.FornecedorService;

@Controller
@RequestMapping("/cadastros/fornecedor")
public class FornecedorController {

	@Autowired
	private FornecedorService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Fornecedor fornecedor) {
		return "cadastros/fornecedor/CadFornecedor";
	}
	
	@GetMapping("/consultar")
	public String consultar(ModelMap model) {
		model.addAttribute("fornecedores", service.buscarTodos());
		return "cadastros/fornecedor/ConFornecedor";
	}
	
	
	
	@PostMapping("/salvar")
	public String salvar(Fornecedor fornecedor) {
		service.salvar(fornecedor);
		return "redirect:/cadastros/fornecedor/cadastrar" ;
	}
	
	@ModelAttribute("ufs")
	public UF[] getUFs() {
		 return UF.values();
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model ) {
		model.addAttribute("fornecedor",service.buscarPorId(id));
		return "cadastros/fornecedor/CadFornecedor";
		
	}
	@PostMapping("/editar")
	public String editar(Fornecedor fornecedor) {
		service.editar(fornecedor);
		return "redirect:/cadastros/fornecedor/consultar";
	}
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id) {
		service.excluir(id);
		return "redirect:/cadastros/fornecedor/consultar";
	}
}
