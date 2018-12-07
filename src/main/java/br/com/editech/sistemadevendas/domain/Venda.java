package br.com.editech.sistemadevendas.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Venda")
public class Venda extends AbstractEntity<Long> {

	private String codigoVenda;
	
	@ManyToOne
	@JoinColumn(name ="idCliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name ="idProduto")
	private Produto produto;
	
	private Integer quantidade;

	public String getCodigoVenda() {
		return codigoVenda;
	}

	public void setCodigoVenda(String codigoVenda) {
		this.codigoVenda = codigoVenda;
	}

	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
