package br.com.editech.sistemadevendas.dao;

import org.springframework.stereotype.Repository;

import br.com.editech.sistemadevendas.domain.Cliente;

@Repository
public class ClienteDaoImpl extends AbstractDao<Cliente,  Long>  implements ClienteDao{

	@Override
	public void delete(Cliente cliente) {
		
		
	}

}
