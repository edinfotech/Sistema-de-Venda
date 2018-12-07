package br.com.editech.sistemadevendas.dao;

import java.util.List;

import br.com.editech.sistemadevendas.domain.Funcionario;;

public interface FuncionarioDao {

void save(Funcionario funcionario);
	
	void update(Funcionario funcionario);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
}
