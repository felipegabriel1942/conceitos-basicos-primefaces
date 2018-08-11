package br.com.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "funcionarioBean")
@RequestScoped
public class FuncionarioBean {

	private String nome;
	private String funcao;

	public void salvarFuncionario(ActionEvent actionEvent) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Olá " + nome + " que trabalha na função de " + funcao));
	}

	public void salvarFuncionarioComSleep(ActionEvent actionEvent) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Olá " + nome + " que trabalha na função de " + funcao));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
