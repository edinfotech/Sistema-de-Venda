package br.com.editech.sistemadevendas.service;

import java.util.List;

import br.com.editech.sistemadevendas.domain.Produto;

public interface ProdutoService {

	void salvar(Produto produto);

	void editar(Produto produto);
	
	void excluir(Long id);
	
	Produto buscarPorId(Long id);
	
	List<Produto> buscarTodos();
}
