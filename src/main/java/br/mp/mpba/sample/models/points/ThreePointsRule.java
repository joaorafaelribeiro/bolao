package br.mp.mpba.sample.models.points;

import br.mp.mpba.sample.models.Aposta;

class ThreePointsRule implements Rule {

	@Override
	public int verifica(Aposta aposta) {
		if(aposta.getAposta().getResultado1() == aposta.getResultado().getResultado1() &&
				aposta.getAposta().getResultado2() == aposta.getResultado().getResultado2()	)
			return 3;
		return 0;
	}

}
