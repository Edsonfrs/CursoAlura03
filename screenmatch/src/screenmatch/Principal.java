package screenmatch;

public class Principal {

	public static void main(String[] args) {
		
		Filme meuFilme = new Filme();
		meuFilme.nome = "O poderoso chefão";
		meuFilme.anoLancamento = 1972;
		meuFilme.duracaoEmMinuto = 120;
		
		meuFilme.exibeFichaTecnica();
				
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		
		System.out.println("Soma das Avaliaçãoes: " + meuFilme.somaDasAvaliacoes);
		System.out.println("Total das Avaliaçãoes: " + meuFilme.totalAvaliacoes);
		System.out.println("Média das Avaliações: " + meuFilme.pegaMedia());
		
		

		
	}

}
