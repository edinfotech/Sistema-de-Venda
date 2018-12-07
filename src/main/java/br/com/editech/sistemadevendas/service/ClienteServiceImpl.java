package br.com.editech.sistemadevendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.editech.sistemadevendas.dao.ClienteDao;
import br.com.editech.sistemadevendas.domain.Cliente;


@Service @Transactional(readOnly = false)
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteDao dao;
	
	@Override
	public void salvar(Cliente cliente) {
	
		dao.save(cliente);
	}

	@Override
	public void editar(Cliente cliente) {
		
		dao.update(cliente);
	}

	@Override
	public void excluir(Long id) {
		
		dao.delete(id);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public Cliente buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Cliente> buscarTodos() {
		
		return dao.findAll();
	}

	
}
