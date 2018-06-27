package br.mp.mpba.sample.models.points;

import br.mp.mpba.sample.models.Aposta;

class OnePointRule implements Rule {

	@Override
	public int verifica(Aposta aposta) {
		if(!acertouPlacar(aposta) && acertouPeloMenosUmJogo(aposta))
			return 1;
		return 0;
	}
	
	private boolean acertouPlacar(Aposta aposta) {
		return aposta.getAposta().getResultado1() == aposta.getResultado().getResultado1() &&
				aposta.getAposta().getResultado2() == aposta.getResultado().getResultado2();
	}
	
	private boolean acertouPeloMenosUmJogo(Aposta aposta) {
		return aposta.getAposta().getResultado1() == aposta.getResultado().getResultado1() ||
				aposta.getAposta().getResultado2() == aposta.getResultado().getResultado2();
	}


}
