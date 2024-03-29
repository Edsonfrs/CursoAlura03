package br.com.fullstackvox.screenmatch.modelos;

public class Serie extends Titulo {
	
	private int temporadas;
	private int episodiosPorTemporadas;
	private boolean ativa;
	private int minutosPorEpisodios;
	
	
	public int getTempodradas() {
		return temporadas;
	}
	public void setTempodradas(int tempodradas) {
		this.temporadas = tempodradas;
	}
	public int getEpisodiosPorTemporadas() {
		return episodiosPorTemporadas;
	}
	public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
		this.episodiosPorTemporadas = episodiosPorTemporadas;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public int getMinutosPorEpisodios() {
		return minutosPorEpisodios;
	}
	public void setMinutosPorEpisodios(int minutosPorEpisodios) {
		this.minutosPorEpisodios = minutosPorEpisodios;
	}
	
	@Override
	public int getDuracaoEmMinutos() {
		return temporadas * episodiosPorTemporadas * minutosPorEpisodios;
	}
	
	
	

}
