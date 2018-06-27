package br.mp.mpba.sample.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Partida {
	@Id
	@GeneratedValue
	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	@ManyToOne
	private Time jogador1;
	@ManyToOne
	private Time jogador2;
	private int resultado1;
	private int resultado2;
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Time getJogador1() {
		return jogador1;
	}
	public void setJogador1(Time jogador1) {
		this.jogador1 = jogador1;
	}
	public Time getJogador2() {
		return jogador2;
	}
	public void setJogador2(Time jogador2) {
		this.jogador2 = jogador2;
	}
	public int getResultado1() {
		return resultado1;
	}
	public void setResultado1(int resultado1) {
		this.resultado1 = resultado1;
	}
	public int getResultado2() {
		return resultado2;
	}
	public void setResultado2(int resultado2) {
		this.resultado2 = resultado2;
	}
	
	
}
