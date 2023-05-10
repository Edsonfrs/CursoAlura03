package screenmatch;

import br.com.fullstackvox.screenmatch.modelos.Filme;

public class Principal {

	public static void main(String[] args) {
		
		Filme meuFilme = new Filme();
		meuFilme.setNome("O poderoso chefão");
		meuFilme.setAnoLancamento(1972);
		meuFilme.setDuracaoEmMinuto(120);
		
		meuFilme.exibeFichaTecnica();
				
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		
		System.out.println("Soma das Avaliaçãoes: " + meuFilme.getSomaDasAvaliacoes());
		System.out.println("Total das Avaliaçãoes: " + meuFilme.getTotalAvaliacoes());
		System.out.println("Média das Avaliações: " + meuFilme.pegaMedia());
				
		

		
	}

}
