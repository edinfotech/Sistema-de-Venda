package br.com.editech.sistemadevendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.editech.sistemadevendas.dao.FornecedorDao;
import br.com.editech.sistemadevendas.domain.Fornecedor;

@Service @Transactional(readOnly = false)
public class FornecedorServiceImpl implements FornecedorService{

	@Autowired
	private FornecedorDao dao;
	
	@Override
	public void salvar(Fornecedor fornecedor) {
	
		dao.save(fornecedor);
	}

	@Override
	public void editar(Fornecedor fornecedor) {
		
		dao.update(fornecedor);
	}

	@Override
	public void excluir(Long id) {
		
		dao.delete(id);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public Fornecedor buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Fornecedor> buscarTodos() {
		
		return dao.findAll();
	}

	
}
