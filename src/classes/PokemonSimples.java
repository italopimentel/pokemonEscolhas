package classes;

public class PokemonSimples {
	
	private String nome;	
	private String tipo;
	

	public PokemonSimples(String nome, String tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return nome + ", tipo: " + tipo;
	}
	
	

}
