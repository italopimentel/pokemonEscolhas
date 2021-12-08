package classes;

public class Jogador {
	
	private int energia;
	private PokemonSimples pokemon;
	
	public Jogador(int energia, PokemonSimples pokemon) {
		super();
		this.energia = energia;
		this.pokemon = pokemon;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public PokemonSimples getPokemon() {
		return pokemon;
	}

	public void setPokemon(PokemonSimples pokemon) {
		this.pokemon = pokemon;
	}
	
	public void modificarEnergia(int energia)
	{
		this.energia+=energia;
	}

	@Override
	public String toString() {
		return "Jogador [energia=" + energia + ", pokemon=" + pokemon + "]";
	}

	
}
