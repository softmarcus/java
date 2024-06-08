package com.softgraf.farmacia.model;

import java.util.Objects;

public class Produto {
	private long id;
	private String codigo;
	private String descricao;
	private float precoUnitario;

	// construtor padrao
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	// construtor com 3 parametros
	// alt shift s => generate construtor using fields
	public Produto(String codigo, String descricao, float precoUnitario) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	// getters and setters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}

	// alt shift hashcode and equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(descricao, other.descricao);
	}
	// alt shift s 

	@Override
	public String toString() {
		return "Produto [id=" + id + ", codigo=" + codigo + ", descricao=" + descricao + ", precoUnitario="
				+ precoUnitario + "]";
	}

	

	
}
