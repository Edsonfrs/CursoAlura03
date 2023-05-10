package br.com.edsonfrs.minhasMusicas.modelos;

public class MinhasPreferidas {
	
	public void inclui(Audio audio) {
		
		if(audio.getClassificacao() >= 9) {
			System.out.println(audio.getTitulo() + " SUCESSO ABSOLUTO!!!");
			System.out.println();
		} else {
			System.out.println(audio.getTitulo() + " ISSO É SÉRIO???!!! ;-) ");
			System.out.println();
		}
		
	}

}
