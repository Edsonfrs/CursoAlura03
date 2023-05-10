package br.com.fullstackvox.screenmatch.calculos;

public class FiltroRecomendacao {
	
	public void filtra(Classificavel classificavel) {
		if (classificavel.getClassificacao() >= 4) {
			System.out.println("Preferidos no momento!");
		} else if (classificavel.getClassificacao() >= 2) {
			System.out.println("Muito bem avaliado!");
		} else {
			System.out.println("Não perca seu tempo ;-) !");
		}
	}

}
