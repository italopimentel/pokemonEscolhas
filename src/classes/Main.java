package classes;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		PokemonSimples lala = new PokemonSimples("Pikachu", "Eletrico");
		Jogador jogador = new Jogador(100,lala);
		
		
		Capitulo raiz = new Capitulo("Texto1", "home", 0);
		Capitulo capitulo1 = new Capitulo("floresta", "floresta", -10);
		Capitulo capitulo2 = new Capitulo("cerulian", "cerulian", 8);
		Capitulo capitulo3 = new Capitulo("teste1", "teste1", 10);
		Capitulo capitulo4 = new Capitulo("teste2", "teste2", -100);
				
		raiz.adicionarCapitulo(capitulo1);
		raiz.adicionarCapitulo(capitulo2);
		capitulo2.adicionarCapitulo(capitulo3);
		capitulo2.adicionarCapitulo(capitulo4);
		
		Jogo jogo = new Jogo(jogador, raiz);
		System.out.println(jogo);
		
		int resultado = jogo.proximoNivel(1);
		
		System.out.println(jogo);
		System.out.println(resultado);
		
		jogo = new Jogo(jogador, capitulo2);
        resultado = jogo.proximoNivel(0);
		
		System.out.println(jogo);
		System.out.println(resultado);

	}

}
