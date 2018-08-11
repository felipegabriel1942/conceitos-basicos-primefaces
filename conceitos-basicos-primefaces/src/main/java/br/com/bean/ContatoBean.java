package br.com.bean;

import java.util.*;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "contatoBean")
@SessionScoped
public class ContatoBean {

	private Contato contato;
	private List<Contato> contatos;

	public ContatoBean() {
		contato = new Contato();
		contatos = new ArrayList<Contato>();
	}

	public void inserirContato() {
		if (contatos.contains(contato)) {
			FacesMessage msg = new FacesMessage("Registro Duplicado", "O contato que você esta inserindo já existe");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		} else {
			contatos.add(contato);
			contato = new Contato();
		}

	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

}
