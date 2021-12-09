package classes;

public class Jogador {
	
	private String nome;
	private int energia;
	private PokemonSimples pokemon;
	
	public Jogador(int energia, PokemonSimples pokemon, String nome) 
	{
		this.nome = nome;
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
	
	public String getPokemonNome()
	{
		return pokemon.getNome();
	}

	public void setPokemon(PokemonSimples pokemon) {
		this.pokemon = pokemon;
	}
	
	public void modificarEnergia(int energia)
	{
		this.energia+=energia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Jogador [energia=" + energia + ", pokemon=" + pokemon + "]";
	}

	
}
