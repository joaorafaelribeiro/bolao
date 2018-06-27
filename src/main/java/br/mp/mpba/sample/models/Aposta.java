package br.mp.mpba.sample.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Aposta {
	@Id
	@GeneratedValue
	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Partida resultado;
	@ManyToOne
	private Partida aposta;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Partida getResultado() {
		return resultado;
	}
	public void setResultado(Partida resultado) {
		this.resultado = resultado;
	}
	public Partida getAposta() {
		return aposta;
	}
	public void setAposta(Partida aposta) {
		this.aposta = aposta;
	}
	
	
}
