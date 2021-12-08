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
			
		if (this.jogador.getEnergia() <= 0 )
		{
			return 1;
		}
		else if (this.capituloAtual.getProximosCapitulos().size() < 2)
		{
			return 2;
		}
		else
		{
			this.capituloAtual=this.capituloAtual.getProximosCapitulos().get(posicao);
			int	energiaCapitulo = this.capituloAtual.getEnergia();	
			this.jogador.modificarEnergia(energiaCapitulo);
			
			return 0;
		}
		
	}

	@Override
	public String toString() {
		return "Jogo [jogador=" + jogador + ", capituloAtual=" + capituloAtual + "]";
	}
	

}
