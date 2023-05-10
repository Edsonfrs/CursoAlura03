package br.com.fullstackvox.screenmatch;

import br.com.fullstackvox.screenmatch.calculos.CalculadoraDeTempo;
import br.com.fullstackvox.screenmatch.modelos.Filme;
import br.com.fullstackvox.screenmatch.modelos.Serie;

public class Principal {

	public static void main(String[] args) {
		
		Filme meuFilme = new Filme();
		meuFilme.setNome("O poderoso chefão");
		meuFilme.setAnoLancamento(1972);
		meuFilme.setDuracaoEmMinutos(120);
		
		meuFilme.exibeFichaTecnica();
				
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		
		System.out.println("Soma das Avaliaçãoes: " + meuFilme.getSomaDasAvaliacoes());
		System.out.println("Total das Avaliaçãoes: " + meuFilme.getTotalAvaliacoes());
		System.out.println("Média das Avaliações: " + meuFilme.pegaMedia());
		System.out.println();
		
		Serie lost = new Serie();
		lost.setNome("Lost");
		lost.setAnoLancamento(2001);
		lost.setDuracaoEmMinutos(30);
		lost.setTempodradas(10);
		lost.setEpisodiosPorTemporadas(10);
		lost.setMinutosPorEpisodios(50);
		
		lost.exibeFichaTecnica();
		
		System.out.println("tempo para maratonar: " + lost.getDuracaoEmMinutos());
		System.out.println();
		
		Filme outroFilme = new Filme();
		outroFilme.setNome("Zulu");
		outroFilme.setAnoLancamento(1964);
		outroFilme.setDuracaoEmMinutos(138);
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		calculadora.inclui(lost);
		System.out.println("Tempo total calculado: " + calculadora.getTempoTotal());
		
		
				
		

		
	}

}
