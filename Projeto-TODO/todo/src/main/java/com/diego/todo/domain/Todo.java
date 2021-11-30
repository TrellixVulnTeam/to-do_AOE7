package com.diego.todo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity // a calsse sera uma entidade
public class Todo implements Serializable {

	private static final long serialVersionUID = 1L;// Serializable

	@Id // id é uma chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // gerar id automaticamente

	
	//atributos encapsulados
	private Integer id;
	private String titulo;
	private String descricao;
	
	@JsonFormat(pattern =  "dd/MM/yyyy")
	private Date dataParaFinalizar;
	private Boolean finalizar = false;

	// construtor sem parametros
	public Todo() {
		super();
	}

	// construtor com parametros
	public Todo(Integer id, String titulo, String descricao, Date dataParaFinalizar, Boolean finalizar) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataParaFinalizar = dataParaFinalizar;
		this.finalizar = finalizar;
	}
	
	// metodos acessores getters e setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataParaFinalizar() {
		return dataParaFinalizar;
	}

	public void setDataParaFinalizar(Date dataParaFinalizar) {
		this.dataParaFinalizar = dataParaFinalizar;
	}

	public Boolean getFinalizar() {
		return finalizar;
	}

	public void setFinalizar(Boolean finalizar) {
		this.finalizar = finalizar;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	//equals e hashcode
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return Objects.equals(id, other.id);
	}

}
