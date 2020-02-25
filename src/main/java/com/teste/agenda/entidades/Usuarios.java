package com.teste.agenda.entidades;

import java.io.Serializable;
import java.net.URI;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.teste.agenda.recursos.UsuariosRecursos;

import antlr.collections.List;

@Entity
public class Usuarios implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String dataDeNascimento;
	private String cfp;
	private String endereco;
	private String rua;
	private String nº;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String telefones;
	private String celular;
	private String residencial;
	private String ddi;
	private String ddd;
	private String numero;
	private String ramal;
	
	public Usuarios() {
	}

	
	
	public Usuarios(Long id, String nome, String dataDeNascimento, String cfp, String endereco, String rua, String nº,
			String complemento, String bairro, String cidade, String cep, String telefones, String celular,
			String residencial, String ddi, String ddd, String numero, String ramal) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.cfp = cfp;
		this.endereco = endereco;
		this.rua = rua;
		this.nº = nº;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.telefones = telefones;
		this.celular = celular;
		this.residencial = residencial;
		this.ddi = ddi;
		this.ddd = ddd;
		this.numero = numero;
		this.ramal = ramal;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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



	public String getRua() {
		return rua;
	}



	public void setRua(String rua) {
		this.rua = rua;
	}



	public String getNº() {
		return nº;
	}



	public void setNº(String nº) {
		this.nº = nº;
	}



	public String getComplemento() {
		return complemento;
	}



	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}



	public String getTelefones() {
		return telefones;
	}



	public void setTelefones(String telefones) {
		this.telefones = telefones;
	}



	public String getCelular() {
		return celular;
	}



	public void setCelular(String celular) {
		this.celular = celular;
	}



	public String getResidencial() {
		return residencial;
	}



	public void setResidencial(String residencial) {
		this.residencial = residencial;
	}



	public String getDdi() {
		return ddi;
	}



	public void setDdi(String ddi) {
		this.ddi = ddi;
	}



	public String getDdd() {
		return ddd;
	}



	public void setDdd(String ddd) {
		this.ddd = ddd;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getRamal() {
		return ramal;
	}



	public void setRamal(String ramal) {
		this.ramal = ramal;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@RequestMapping(method=RequestMethod.GET)
 	public ResponseEntity<List<Usuarios>> findAll() {
 	public ResponseEntity<List<UsuariosDTO>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
		List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
 	}
 	
	@RequestMapping(method=RequestMethod.POST)
 	public ResponseEntity<Void> insert(@RequestBody UsuariosRecursos objDto) {
		Usuarios obj = UsuariosRecursos.FromDTO(objDto);
		obj = UsuariosRecursos.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
 	public ResponseEntity<Void> delete(@PathVariable String id) {
		UsuariosRecursos.delete(id);
		return ResponseEntity.noContent().build();
		
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
 	public ResponseEntity<Void> update(@RequestBody UserDTO objDto, @PathVariable String id) {
		UsuariosRecursos obj = UsuariosRecursos.fromDTO(objDto);
		obj.setId(id);
		obj = UsuariosRecursos.update(obj);
		return ResponseEntity.noContent().build();
	}
}
