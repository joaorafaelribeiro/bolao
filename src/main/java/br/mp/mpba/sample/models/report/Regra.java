package br.mp.mpba.sample.models.report;

import br.mp.mpba.sample.models.Aposta;

public interface Regra {

	public int verifica(Aposta aposta);
}
