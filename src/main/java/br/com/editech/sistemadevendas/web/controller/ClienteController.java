package br.com.editech.sistemadevendas.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.editech.sistemadevendas.domain.Cliente;
import br.com.editech.sistemadevendas.service.ClienteService;

@Controller
@RequestMapping("/cadastros/cliente")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Cliente cliente) {
		return "cadastros/cliente/CadCliente";
	}
	
	@GetMapping("/consultar")
	public String consultar(ModelMap model) {
		model.addAttribute("clientes", service.buscarTodos()); //model.addAtribute("nome da variavel no form(HTML)")
		return "cadastros/cliente/ConCliente";
	}
	@PostMapping("/salvar")
	public String salvar(Cliente cliente) {
		service.salvar(cliente);
		return "redirect:/cadastros/cliente/cadastrar";
	}
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("cliente",service.buscarPorId(id));
		return "cadastros/cliente/CadCliente";
	}
	@PostMapping("/editar")
	public String editar(Cliente cliente) {
		service.editar(cliente);
		return "redirect:/cadastros/cliente/cadastrar";
	}
	
}
