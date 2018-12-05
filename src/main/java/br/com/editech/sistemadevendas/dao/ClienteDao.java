package br.com.editech.sistemadevendas.dao;

import java.util.List;

import br.com.editech.sistemadevendas.domain.Cliente;

public interface ClienteDao {

	void save(Cliente cliente);
	
	void update(Cliente cliente);
	
	void delete(Cliente cliente);
	
	Cliente findById(Long id);
	
	List<Cliente> findAll();
}
