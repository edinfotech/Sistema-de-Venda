package br.com.editech.sistemadevendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.editech.sistemadevendas.dao.VendaDao;
import br.com.editech.sistemadevendas.domain.Venda;

@Service @Transactional(readOnly = false)
public class VendaServiceImpl implements VendaService{

	@Autowired
	private VendaDao dao;
	
	@Override
	public void salvar(Venda venda) {
	
		dao.save(venda);
	}

	@Override
	public void editar(Venda venda) {
		
		dao.update(venda);
	}

	@Override
	public void excluir(Long id) {
		
		dao.delete(id);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public Venda buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Venda> buscarTodos() {
		
		return dao.findAll();
	}

	
}
