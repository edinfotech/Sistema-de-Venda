package br.com.editech.sistemadevendas.dao;

import java.util.List;

import br.com.editech.sistemadevendas.domain.Venda;

public interface VendaDao {

    void save(Venda venda);
    
	void update(Venda venda);
	
	void delete(Long id);
	
	Venda findById(Long id);
	
	List<Venda> findAll();
}
