package screenmatch;

public class Filme {
	
	String nome;
	int anoLancamento;
	boolean incluidoNoPlano;
	double somaDasAvaliacoes;
	int totalAvaliacoes;
	int duracaoEmMinuto;
	
	
	
	// Métodos
	
	void exibeFichaTecnica() {
		System.out.println("*** FICHA TECNICA ***");
		System.out.println("Filme: " + nome);
		System.out.println("Ano de lançamento: " + anoLancamento);
		System.out.println("Duração (min) " + duracaoEmMinuto);
		System.out.println();
	}
	
	void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalAvaliacoes++;
	}
	
	double pegaMedia() {
		return somaDasAvaliacoes / totalAvaliacoes;
	}
	

}
