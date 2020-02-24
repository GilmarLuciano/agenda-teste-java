package com.teste.agenda.entidades;

import java.io.Serializable;

public class Usuarios implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nome;
	private String dataDeNascimento;
	private String cfp;
	private String endereco;
	private String telefones;
	
	public Usuarios() {
	}

	public Usuarios(String nome, String dataDeNascimento, String cfp, String endereco, String telefones) {
		super();
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.cfp = cfp;
		this.endereco = endereco;
		this.telefones = telefones;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getCfp() {
		return cfp;
	}

	public void setCfp(String cfp) {
		this.cfp = cfp;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefones() {
		return telefones;
	}

	public void setTelefones(String telefones) {
		this.telefones = telefones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((telefones == null) ? 0 : telefones.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (telefones == null) {
			if (other.telefones != null)
				return false;
		} else if (!telefones.equals(other.telefones))
			return false;
		return true;
	}
	
	

}
