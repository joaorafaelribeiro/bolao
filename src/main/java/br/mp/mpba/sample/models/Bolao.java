package br.mp.mpba.sample.models;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bolao {
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private List<Aposta> apostas;

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
	
	public List<Aposta> getApostas(Usuario usuario) {
		return apostas.stream().filter(partida -> partida.getUsuario().equals(usuario)).collect(Collectors.toList());
		
	}
	
}
