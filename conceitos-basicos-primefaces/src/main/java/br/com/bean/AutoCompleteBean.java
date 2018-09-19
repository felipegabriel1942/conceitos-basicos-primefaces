package br.com.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="autoCompleteBean")
@SessionScoped
public class AutoCompleteBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	List<String> clientes;
	
	
	public AutoCompleteBean() {
		clientes = new ArrayList<String>();
		clientes.add("Felipe");
		clientes.add("Fernando");
		clientes.add("Francisco");
		clientes.add("Francisca");
		clientes.add("Felix");
		clientes.add("Flavio");
		clientes.add("Fagner");
	}
	
	private String cliente;


	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public List<String> complete(String busca){
		List<String> results = new ArrayList<String>();
		
		for (String cliente : clientes) {
			if(cliente.toUpperCase().contains(busca.toUpperCase())) {
				results.add(cliente);
			}
		}
		return results;
	}

}
