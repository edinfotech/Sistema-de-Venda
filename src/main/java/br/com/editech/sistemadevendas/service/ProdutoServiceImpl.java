package br.com.editech.sistemadevendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.editech.sistemadevendas.dao.ProdutoDao;
import br.com.editech.sistemadevendas.domain.Produto;

@Service @Transactional(readOnly = false)
public class ProdutoServiceImpl implements ProdutoService{

	@Autowired
	private ProdutoDao dao;
	
	@Override
	public void salvar(Produto produto) {
	
		dao.save(produto);
	}

	@Override
	public void editar(Produto produto) {
		
		dao.update(produto);
	}

	@Override
	public void excluir(Long id) {
		
		dao.delete(id);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public Produto buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Produto> buscarTodos() {
		
		return dao.findAll();
	}

	
}
