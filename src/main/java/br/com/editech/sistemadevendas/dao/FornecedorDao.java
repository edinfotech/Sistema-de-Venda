package br.com.editech.sistemadevendas.dao;

import java.util.List;

import br.com.editech.sistemadevendas.domain.Fornecedor;

public interface FornecedorDao {

void save(Fornecedor fornecedor);
	
	void update(Fornecedor fornecedor);
	
	void delete(Long id);
	
	Fornecedor findById(Long id);
	
	List<Fornecedor> findAll();
}
