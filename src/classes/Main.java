package classes;
<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> 0d8383dc1d381c25136e24f87b0f4877e1fbe9c8

public class Main {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		/*/ Criação do pokemom p/teste
		PokemonSimples lala = new PokemonSimples("Pikachu", "Eletrico");
		// Cria Jogador
		Jogador jogador = new Jogador(100,lala);
		
		Criação do Capitulo raiz
		Capitulo raiz = new Capitulo("Texto1", "home", 0);
		Criação do capitulos filhos da raiz.
		Capitulo capitulo1 = new Capitulo("floresta", "floresta", -10);
		Capitulo capitulo2 = new Capitulo("cerulian", "cerulian", 8);
		
		Adcionado os capitulos filhos ao raiz
		raiz.adicionarCapitulo(capitulo1);
		raiz.adicionarCapitulo(capitulo2);
		
		//
		Jogo jogo =new Jogo(jogador, raiz);
=======
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
>>>>>>> 0d8383dc1d381c25136e24f87b0f4877e1fbe9c8
		System.out.println(jogo);
		
		int resultado = jogo.proximoNivel(1);
		
		System.out.println(jogo);
		System.out.println(resultado);
		
<<<<<<< HEAD
        resultado = jogo.proximoNivel(1);
		
		System.out.println(jogo);
		System.out.println(resultado);*/
		
		
		Scanner consoleInput= new Scanner(System.in);
		PokemonSimples[] listaPokemon= new PokemonSimples[] 
		{
				new PokemonSimples("Charmanter", "Fogo"),
				new PokemonSimples("Bulbasaur", "Planta"),
				new PokemonSimples("Squirtle", "Água")
				
		};		
		
		//Criação do Capitulo raiz
		Capitulo raiz = new Capitulo("Você está iniciando hoje sua jornada pokemon, parabéns por ter escolhido charmander. O mundo lá fora está cheio de aventuras e perigos, cuidado onde pisa e boa jornada!! pra qual caminho você deseja percorrer? 1 - floresta de veridian 2 - pegar atalho para cidade de cerulean", "home", 0);
		//Criação do capitulos filhos da raiz 1º altura.
		Capitulo capitulo1 = new Capitulo("Você chegou com seu charmander na floresta de viridian e tentou capturar seu primeiro pokemon, ele era um Bedrill, e você o derrotou, mas ele fugiu e chamou os amigos. Corra!! Charmander está sendo atacado por diversos Bedrill's. (energia -20). O que você deseja fazer?\r\n"
				+ "3 - Seguir caminho para cidade de viridian e desafiar geovanni\r\n"
				+ "4 - Seguir para cidade de viridian, e não visitar o ginásio", "floresta", -20);
		Capitulo capitulo2 = new Capitulo("Você e seu charmander tomaram um atalho para cidade de cerulean, encontrando uma nova companheira no caminho, o nome dela é Misty. Chegando na cidade de cerulean, vocês dois juntos batalharam contra as irmãs de misty e venceram, ganhando sua primeira insígnia, a insígnia de cascata. (energia +40).", "cerulian", 40);
				
		//Adcionado os capitulos filhos ao raiz
		raiz.adicionarCapitulo(capitulo1);
		raiz.adicionarCapitulo(capitulo2);
		
		while(true)
		{	
			//			
			System.out.println("Escolha qual pokemon você deseja: ");
			System.out.println(" 0 - "+ listaPokemon[0]);
			System.out.println(" 1 - "+ listaPokemon[1]);
			System.out.println(" 2 - "+listaPokemon[2]);
			
			int opcaoPokemon=consoleInput.nextInt();
			
			//Jogador
			System.out.println("Informe o nome do Jogador: ");
			
			String nomeJogador=consoleInput.next();
			
			//JOGADOR 
			Jogador jogador = new Jogador(100, listaPokemon[opcaoPokemon],nomeJogador);
			
			//Criando Jogo
			Jogo jogo =new Jogo(jogador, raiz);
			System.out.println(jogo);
			
			while(true){

			    //CAPITULO
			    Capitulo cap = jogo.getCapituloAtual();

			    //MENSAGEM DO CAPITULO ATUAL
			    System.out.println(cap.getContexto());

			    //CAMINHOS
			    if(cap.continuar()){
			        //EXIBE OS DOIS CAMINHO
			        System.out.println("CAMINHO 0 - "+cap.getProximosCapitulos().get(0));
			        System.out.println("CAMINHO 1 - "+cap.getProximosCapitulos().get(1));

			        //PEGA A OPÇÃO DO USUÁRIO
			        System.out.print("Escolha um Caminho: ");
			        int opcaoCapitulo = consoleInput.nextInt();

			        //AVANÇA AO PRÓXIMO NÍVEL
			        int retorno = jogo.proximoNivel(opcaoCapitulo);
			        
			        if(retorno == 1)
			        {
			        	System.out.println("Sua energia acabou.");
			        	break;
			        }
			        else if(retorno == 2)
			        {
			        	System.out.println("Você chegou o fim.");
			        	break;
			        }
			        

			    }else{
			        System.out.println("VOCÊ CHEGOU AO FINAL DO JOGO");
			        break;
			    }

			}
			
			//Condição de parada
			System.out.println("Deseja Continuar. 0-SIM 1-NÃO: ");
			
			int nexlineInput = consoleInput.nextInt();
			if (nexlineInput == 1)
				break;
			
			
		}
		
		
		
		
=======
		jogo = new Jogo(jogador, capitulo2);
        resultado = jogo.proximoNivel(0);
		
		System.out.println(jogo);
		System.out.println(resultado);
>>>>>>> 0d8383dc1d381c25136e24f87b0f4877e1fbe9c8

	}

}
