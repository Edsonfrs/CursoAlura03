package br.com.edsonfrs.minhasMusicas.principal;

import java.util.Iterator;

import br.com.edsonfrs.minhasMusicas.modelos.MinhasPreferidas;
import br.com.edsonfrs.minhasMusicas.modelos.Musica;
import br.com.edsonfrs.minhasMusicas.modelos.Podcast;

public class Principal {

	public static void main(String[] args) {
		
		Musica minhaMusica = new Musica();
		
		minhaMusica.setTitulo("Shiny Happy People");
		minhaMusica.setArtista("REM");
		
		for (int i = 0; i < 3000; i++) {
			minhaMusica.reproduz();
		}
		
		for (int i = 0; i < 50; i++) {
			minhaMusica.curtir();
		}
		
		Podcast meuPodcast = new Podcast();
		meuPodcast.setTitulo("Bolha DEV");
		meuPodcast.setHost("Marcus Mendes");
		
		for (int i = 0; i < 1000; i++) {
			meuPodcast.reproduz();
		}
		
		for (int i = 0; i < 600; i++) {
			meuPodcast.curtir();
		}
		
		MinhasPreferidas preferidas = new MinhasPreferidas();
		preferidas.inclui(meuPodcast);
		preferidas.inclui(minhaMusica);
		
		

	}

}
