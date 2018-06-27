package br.mp.mpba.sample.models.points;

import java.util.ArrayList;
import java.util.List;

import br.mp.mpba.sample.models.Aposta;
import br.mp.mpba.sample.models.Bolao;
import br.mp.mpba.sample.models.Usuario;

public class CalculateUserPointsImpl {

	private List<Rule> regras;
	
	public CalculateUserPointsImpl() {
		regras = new ArrayList<>();
		regras.add(new OnePointRule());
		regras.add(new ThreePointsRule());
	}
	
	public int calcula(Bolao bolao, Usuario usuario) {
		List<Aposta> apostas = bolao.getApostas(usuario);
		int pontos = 0;
		for (Aposta aposta : apostas) {
			pontos += applyRules(aposta);
		}
		return pontos;
	}

	private int applyRules(Aposta aposta) {
		int pontos = 0;
		for (Rule regra : regras) {
			pontos += regra.verifica(aposta);
		}
		return pontos;
	}
	
	
}
