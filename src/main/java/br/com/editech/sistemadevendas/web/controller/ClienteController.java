package br.com.editech.sistemadevendas.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.editech.sistemadevendas.domain.Cliente;
import br.com.editech.sistemadevendas.domain.UF;
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
	public String salvar(Cliente cliente ,RedirectAttributes attr) {
		service.salvar(cliente);
		attr.addFlashAttribute("sucesso","Cliente cadastrado com sucesso!");
		return "redirect:/cadastros/cliente/cadastrar";
	}
	
	@ModelAttribute("ufs")
	public UF[] getUFs() {
		 return UF.values();
	}
	
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("cliente",service.buscarPorId(id));
		return "cadastros/cliente/CadCliente";
	}
	@PostMapping("/editar")
	public String editar(Cliente cliente, RedirectAttributes attr) {
		service.editar(cliente);
		attr.addFlashAttribute("sucesso","Cliente atualizado com sucesso!");
		return "redirect:/cadastros/cliente/cadastrar";
	}
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, RedirectAttributes attr) {
		
		service.excluir(id);
		attr.addFlashAttribute("sucesso", "cliente excluido com sucesso!");
		
		return "redirect:/cadastros/cliente/consultar";
	}
}
