package br.com.fullstackvox.screenmatch.modelos;

public class Titulo {
		
	private String nome;
	private int anoLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalAvaliacoes;
	private int duracaoEmMinutos;
	
		
	public void exibeFichaTecnica() {
		System.out.println("*** FICHA TECNICA ***");
		System.out.println("Filme: " + nome);
		System.out.println("Ano de lançamento: " + anoLancamento);
		System.out.println("Duração (min) " + duracaoEmMinutos);
		System.out.println();
	}
	
	public void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalAvaliacoes++;
	}
	
	public double pegaMedia() {
		return somaDasAvaliacoes / totalAvaliacoes;
	}
	
	// Getters e Setters
	
	public int getTotalAvaliacoes() {
		return totalAvaliacoes;
	}
	
	public double getSomaDasAvaliacoes() {
		return somaDasAvaliacoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

}
