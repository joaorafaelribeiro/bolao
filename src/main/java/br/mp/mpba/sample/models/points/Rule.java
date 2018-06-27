package br.mp.mpba.sample.models.points;

import br.mp.mpba.sample.models.Aposta;

interface Rule {

	public int verifica(Aposta aposta);
}
