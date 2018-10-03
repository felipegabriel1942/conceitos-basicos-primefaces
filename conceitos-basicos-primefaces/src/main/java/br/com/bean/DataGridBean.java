package br.com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "dataGridBean")
@SessionScoped
public class DataGridBean {
	private List<ProdutoModel> produtos;

	public List<ProdutoModel> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoModel> produtos) {
		this.produtos = produtos;
	}
	
	@PostConstruct
	public void init() {
		produtos = new ArrayList<>();
		produtos.add(new ProdutoModel("PS3",999,250));
		produtos.add(new ProdutoModel("XBOX",799,190));
		produtos.add(new ProdutoModel("WII",699,150));
		produtos.add(new ProdutoModel("IPHONE 4S",1699,350));
		produtos.add(new ProdutoModel("GALAXY S3",2199,262));
		produtos.add(new ProdutoModel("NINTENDO SWITCH",1999,325));
		produtos.add(new ProdutoModel("PS4",1999,275));
		produtos.add(new ProdutoModel("MOTO G4 PLUS",1099,230));
		produtos.add(new ProdutoModel("NOTEBOOK DELL INSPIRON 15",1999,100));
		produtos.add(new ProdutoModel("NOTEBOOK SAMSUNG",1899,120));
	}
	
}
