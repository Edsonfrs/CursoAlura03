package br.com.fullstackvox.screenmatch.modelos;

import br.com.fullstackvox.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel{
	
	private String diretor;

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		
		return (int) pegaMedia() / 2;
	}
	
	
	

}
