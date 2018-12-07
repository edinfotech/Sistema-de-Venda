package br.com.editech.sistemadevendas.dao;

import java.util.List;

import br.com.editech.sistemadevendas.domain.Produto;

public interface ProdutoDao {

	void save(Produto produto);
	
	void update(Produto produto);
	
	void delete(Long id);
	
	Produto findById(Long id);
	
	List<Produto> findAll();
}
