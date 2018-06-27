package br.mp.mpba.sample.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aposta {
	@Id
	@GeneratedValue
	private Long id;
	private Usuario usuario;
	private Jogo jogo;
	private Resultado resultado;
	
}
