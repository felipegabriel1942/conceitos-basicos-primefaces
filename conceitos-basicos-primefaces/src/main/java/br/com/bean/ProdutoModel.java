package br.com.bean;

public class ProdutoModel {
	
	private String nome;
	private String descricao;
	private float valor;
	private int totalVendas;
	
	public ProdutoModel() {
		
	}
	
	

	public ProdutoModel(String nome, float valor, int totalVendas) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.totalVendas = totalVendas;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	
	
	
}
