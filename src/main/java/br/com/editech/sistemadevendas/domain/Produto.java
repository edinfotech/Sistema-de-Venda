package br.com.editech.sistemadevendas.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Produto")
public class Produto extends AbstractEntity<Long> {

	private String ean;
	private String descricao;
	private String dataEntrada;
	private String grupo;
	private String subgrupo;
	
	@ManyToOne
	@JoinColumn(name ="idFornecedor")
	private Fornecedor fornecedor;
	
	private String precoVenda;
	private String precoCusto;
	private String imagem;
	


	public String getEan() {
		return ean;
	}
	public void setEan(String ean) {
		this.ean = ean;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getSubgrupo() {
		return subgrupo;
	}
	public void setSubgrupo(String subgrupo) {
		this.subgrupo = subgrupo;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(String precoVenda) {
		this.precoVenda = precoVenda;
	}
	public String getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(String precoCusto) {
		this.precoCusto = precoCusto;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	
	
}
