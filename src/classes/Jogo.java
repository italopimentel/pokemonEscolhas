package classes;

public class Jogo {
	
	private Jogador jogador;	
	private Capitulo capituloAtual;
	
	
	public Jogo(Jogador jogador, Capitulo capituloAtual) {
		super();
		this.jogador = jogador;
		this.capituloAtual = capituloAtual;
	}
	
	public int proximoNivel(int posicao)
	{
			// Quando ta sem energia
		if (this.jogador.getEnergia() <= 0 )
		{
			return 1;
		} // Quando não tem mais capitulo a seguir
		else if (this.capituloAtual.getProximosCapitulos().size() < 2)
		{
			return 2;
		}
		else
		{	//continua e faz oque tem que fazer
			this.capituloAtual=this.capituloAtual.getProximosCapitulos().get(posicao);
			int	energiaCapitulo = this.capituloAtual.getEnergia();	
			this.jogador.modificarEnergia(energiaCapitulo);
			
			return 0;
		}
		
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Capitulo getCapituloAtual() {
		return capituloAtual;
	}

	public void setCapituloAtual(Capitulo capituloAtual) {
		this.capituloAtual = capituloAtual;
	}

	@Override
	public String toString() {
		return "Jogo [jogador=" + jogador + ", capituloAtual=" + capituloAtual + "]";
	}
	

}
