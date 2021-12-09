package classes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
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
		System.out.println(jogo);
		
		int resultado = jogo.proximoNivel(1);
		
		System.out.println(jogo);
		System.out.println(resultado);
		
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
		
		//Criação do Capitulo raiz Primeira altura
		Capitulo raiz = new Capitulo("Você está iniciando hoje sua jornada pokemon, parabéns por ter escolhido charmander. O mundo lá fora está cheio de aventuras e perigos, cuidado onde pisa e boa jornada!!\r\n Pra qual caminho você deseja percorrer? 1 - floresta de veridian 2 - pegar atalho para cidade de cerulean", "home", 0);
		//Criação do capitulos filhos da raiz .
		Capitulo capitulo1 = new Capitulo("Você chegou com seu charmander na floresta de viridian e tentou capturar seu primeiro pokemon, ele era um Bedrill, e você o derrotou, mas ele fugiu e chamou os amigos. Corra!!\r\n Charmander está sendo atacado por diversos Bedrill's. (Você Perdeu 20 pontos).\r\n O que você deseja fazer?\r\n"
				+ "3 - Seguir caminho para cidade de viridian e desafiar geovanni\r\n"
				+ "4 - Seguir para cidade de viridian, e não visitar o ginásio", "Floresta de Viridian", -20);
		Capitulo capitulo2 = new Capitulo("Você e seu charmander tomaram um atalho para cidade de cerulean, encontrando uma nova companheira no caminho, o nome dela é Misty. \r\nChegando na cidade de cerulean, vocês dois juntos batalharam contra as irmãs de misty e venceram, ganhando sua primeira insígnia, a insígnia de cascata. (energia +40).", "Atalho para cerulian", 40);
		
		
		// Criação Capitulos 2º Altura 1º Sub Arvore
		Capitulo capitulo3 = new Capitulo("Você chegou na cidade de viridian, e se achou no direito de desafiar Giovanni. Péssima notícia, os pokémons dele estão no último nível, você não conseguiu nem passar pelo seu Rhyhorn. \r\nSeu pokémon ficou decepcionado.\r\nO que você deseja fazer? \r\n"
				+ "7 -Seguir para cidade de pewter\r\n"
				+ "8 - Seguir para vermilion", "Desafiar Giovani", -40);
		
		Capitulo capitulo4 = new Capitulo("Você chegou na cidade de viridian, visitou o centro pokémon e curou seu charmander. Aproveitou para capturar uns pokemons novos e conhecer mais a cidade. (Energia +20).\r\n O que deseja fazer agora\r\n"
				+ "9 -Seguir para lavendere Town\r\n"
				+ "10 -Seguir para cidade de celadon", "Não Visitar ginasio", +20);
		
		      // Criação Capitulos 2º Altura  2º Sub Arvore
		
		Capitulo capitulo5 = new Capitulo("Oh não, seguindo sua jornada pokemon para fuschia, você caiu num buraco, de repente você escuta \"prepare-se para encrenca, encrenca em dobro...\", são os famosos ladrões de pokemon, jesse e james da equipe rocket,\r\n você está em desvantagem, seu charmander se machucou ao cair no buraco e eles tem 1 pokémon cada para te enfrentar (energia -60).O que você deseja fazer? \r\n"
				+ "11 - Batalhar contra os rockets\r\n"
				+ "12- Escalar o buraco e na hora de batalhar, fugir","Seguir para fuschia", -60);		
		
		Capitulo capitulo6 = new Capitulo("Chegando na ilha de cinnabar, você não consegue achar o ginásio local. e você descobriu que houve um grande incêndio na ilha, e que Blaine, o líder do ginásio, mudou sua localidade para as ilhas seafom.\n\r Fazendo com que você tenha que decidir se irá buscar as outras insignias ou seguir para as ilhas.(energia +30).O que você deseja fazer? \r\n"
					+ "13 - Seguir para ilhas seafom\r\n"
					+ "14 - Seguir jornada pokémon", "Seguir para cinnabar", 30);
		
		
		
		
		
		// Criação Capitulos 3º Altura 1º Sub Arvore
		Capitulo capitulo7 = new Capitulo("Você chegou na cidade de pewter, foi até o centro pokemon e ouviu falar sobre o líder do ginásio local, o Brock e seu temível onix, um pokemon imenso. \r\nSeu charmander está com medo de batalhar devido a última derrota para giovanni (energia +10).\r\n O que você deseja fazer? \r\n"
				+ "15 - Batalhar com brock mesmo assim\r\n"
				+ "16 - Seguir para cidade de vermilion", "Seguir para cidade de pewter", +10);
		
		Capitulo capitulo8 = new Capitulo("Você agora chegou na cidade de vermilion, e ouviu boatos da equipe rocket estar na cidade. Enquanto caminhava, você foi parado por duas moças e recebeu o convite para o SS. \r\nANE, um navio luxuoso que está repleto de treinadores.\r\n Oque você deseja fazer? \r\n"
				+ "17 - Entrar no SS ANE e fazer novos amigos\r\n"
				+ "18- Seguir para batalhar com sargente Surge, líder do ginásio local", "Seguir para vermilion", 0);
		Capitulo capitulo9 = new Capitulo("Lavander é conhecida por ser uma cidade mal assombrada, você arriscou enfrentar os pokemons fantasmas sem o Slipth Scope, dispositivo que permite que você visualize os fantasmas. (energia -50).\r\n Após esse erro, você conseguiu a ferramenta com MR fuji e capturou seu primeiro pokemon fantasma.\r\n O que você deseja fazer? \r\n"
				+ "19 - Seguir para Saffron\r\n"
				+ "18 - Seguir para safari zone", "Seguir para lavander", -50);
		Capitulo capitulo10 = new Capitulo("Você chegou na cidade de celadon, famosa por seus perfumes maravilhosos, criados no próprio ginásio da cidade pela líder erica e também conhecida por ter o maior departamento de lojas e seu próprio cassino. \r\nO que você deseja fazer? \r\n"
				+ "21 - Seguir para o ginásio\r\n"
				+ "22 - Seguir para o cassino", "Seguir para Celadon", 0);
		
		      // Criação Capitulos 3º Altura 2º Sub Arvore
		Capitulo capitulo11 = new Capitulo("Após sair do buraco, você bravamente irá enfrentar Jesse e James, após perseverar muito você vence e seu charmander acaba evoluindo, e fazendo com que a equipe rocket decole. (Energia +80).\n\r Agora com seu pokémon evoluído, seguindo sua jornada pokemon. \r\nO que você deseja fazer? \r\n"
				+ "23 - Seguir para fuschia e enfrentar Koga\r\n"
				+ "24 - Visitar a safari zone, que fica próxima a fuschia", "Batalhar", +80);
		Capitulo capitulo12 = new Capitulo("Com seu pokémon ferido da queda na armadilha da equipe rocket, você corre bastante para fugir de Jesse e James e acaba se desviando da rota da cidade de Fuschia.\r\n Você acaba se deparando com Bill, um pesquisador porkémon, que vive em seu farol, aguardando a chegada de um pokemon que ele diz nunca ter sido visto antes. (energia -30 por ter fugido)\r\nO que você deseja fazer? \r\n"
				+ "25 - Aguardar junto com bill a aparição desse pokemon\r\n"
				+ "26- Seguir jornada pokemon", "Fugir", -30);
		Capitulo capitulo13 = new Capitulo("Após chegar nas ilhas seafom, ao procurar blaine, você descobriu que havia um pokemon raro na colina próxima ao ginásio. Era o lendário pokemon moltres, uma das três aves lendárias da região de kanto, do tipo fogo. (energia +30)\r\nO que você deseja fazer? \r\n"
				+ " 28 - Seguir para batalha com moltres\r\n"
				+ "29- Seguir bara batalha com Blaine", "Ir apara as ilhas Seafon", +30);
		Capitulo capitulo14 = new Capitulo("Você chegou na cidade de celadon, famosa por seus perfumes maravilhosos, criados no próprio ginásio da cidade pela líder erica e também conhecida por ter o maior departamento de lojas e seu próprio cassino.\r\nO que você deseja fazer? \r\n"
				+ " 30 - Seguir para o ginásio\r\n"
				+ "31- Seguir para o cassino", "Seguir Jornada Pokemon", 0);		
		
		
		
		
		
		// Criação Capitulos 4º Altura 1º Sub Arvore
		Capitulo capitulo15 =new Capitulo("Você e brock tiveram uma dura batalha, mas após perserverar, você e seu charmander conseguiram derrotá-lo. Parabéns, apesar dos desafios iniciais, você agora tem sua primeira insignia pokémon, a jornada continua...", "Batalhar com Brock", 0);
		Capitulo capitulo16 = new Capitulo("Chegando em vermillion você se deparou com o sargento Surge e seu Raichu, líder do ginásio local e agora você não tem para onde correr, seu pokémon está com medo de batalhar devido a última luta com giovanni e agora terão de batalhar.\r\n Boa sorte nesta batalha e na busca pela sua primeira insígnia.", "Seguir para vermillion", 0);
		Capitulo capitulo17 = new Capitulo("NÂÂÂÂO, era uma armadilha, dentre os tripulantes do navio, vários eram rockets disfarçados. Infelizmente por seus pokémons estarem na fase inicial, vocÊ foi roubado. (Energia -100) Game over", "Optou por entrar no SS ANE", -100);		
		Capitulo capitulo18 = new Capitulo("Chegando em vermillion você se deparou com o sargento Surge e seu Raichu, líder do ginásio local e agora você não tem para onde correr, seu pokémon está com medo de batalhar devido a última luta com giovanni e agora terão de batalhar.\r\n Boa sorte nesta batalha e na busca pela sua primeira insígnia.", "Batalhar contra Surge", 0);
		
		Capitulo capitulo19 = new Capitulo("Chegando em Saffron, a lider Sabrina é meio louca, e muito poderosa com seu Kadabra, mas você fez certo, se previniu e tinha um pokémon fantasma no seu time, a batalha irá se iniciar e você tem grande vantagem no tipo. Boa sorte treinador!!", "Seguir para Saffron", 0);
		Capitulo capitulo20 = new Capitulo("Chegando na zona safari você fica admirado, vários e vários pokemons selvagens correndo livremente, Você captura alguns e fica muito feliz (energia +40). \r\nVocê nota algo estranho, um menino na bolsa de um kangaskhan, o que será aquilo ?! vamos dar uma olhada...", "Seguir para safari zone", 40);
		Capitulo capitulo21 = new Capitulo("Ao chegar no ginásio, você descobriu que a equipe rocket havia invadido para roubar a fórmula secreta dos perfumes e acabou provocando um incêndio no local, Gloom, o pokémon da líder erica ainda está dentro do ginásio,\r\n e só você poderá salvá-lo das chamas...(energia +40)", "Ir ao ginásio", 40);
		Capitulo capitulo22 = new Capitulo("Você optou por ir ao cassino, chegando lá você perdeu todas as suas economias e queria recuperar a todo custo. Você teve a péssima ideia de apostar seu charmander e perdeu mais uma vez. (energia -100) Game Over", "Ir ao Cassino", -100);
		    // Criação Capitulos 4º Altura 2º Sub Arvore
		Capitulo capitulo23 = new Capitulo("Chegando na cidade de fuschia, você irá ao encontro de Koga, o líder de ginásio do tipo venenoso, famoso por suas habilidades ninjas em batalha, você terá uma dura batalha, boa sorte treinador, seu pokémon recém evoluído está bastante confiante. (energia +30)", "Ir a fuschia", +30);
		Capitulo capitulo24 = new Capitulo("Chegando na zona safari você fica admirado, vários e vários pokemons selvagens correndo livremente, Você captura alguns e fica muito feliz (energia +40).\r\nVocê nota algo estranho, um menino na bolsa de um kangaskhan, o que será aquilo ?! vamos dar uma olhada...", "Ir a safari zone", +40);
		Capitulo capitulo25 = new Capitulo("A espera de vocês foi recompensada, o pokémon raro e gigante é na verdade um dragonite, porém a equipe rocket aparece e acaba espantando o pokémon raro.\r\nApós vocês batalharem e vencerem, bill diz que continuará esperando o dragonite retornar algum dia e você seguirá sua jornada pokemon. (energia +40) ", "Zona De Safari", 40);

		Capitulo capitulo26 = new Capitulo("Seguindo sua jornada pokémon, você chega num festival, numa cidade conhecida como pico da donzela. Onde você conhece a lenda urbana do pico da donzela e descobre que na verdade era um gastly em seu lugar.\r\n Seguindo assim para buscar novas batalhas e novas insígnias. (energia +20)", "Seguir jornada", 20);
		Capitulo capitulo27 = new Capitulo("chegando no topo da colina, estav a lendária ave de kanto, a fenix, moltres, você a desafia para uma batalha, na tentativa de capturar um pokémon lendário.\r\nInfelizmente você não é pareo, e a ave sai vitoriosa, mas você nunca se esquecerá dessa batalha, e jura pra si mesmo que na próxima irá captura-lo. (Energia -100 pois perdeu a batalha)", "Optou por batalhar contra moltres", -100);
		
		Capitulo capitulo28 = new Capitulo("Chegou a hora da batalha contra blaine e seu poderoso magmar, você fica surpreso quando descobre que o ginásio fica dentro de um vulcão, e de início se assusta com o desafio.\r\n Porém, você cria coragem e parte para a batalha derradeira, confiante de sua vitória, boa sorte treinador. (energia +30)", "Btalhar com Blaine", 30);
		Capitulo capitulo29 = new Capitulo("Ao chegar no ginásio, você descobriu que a equipe rocket havia invadido para roubar a fórmula secreta dos perfumes e acabou provocando um incêndio no local, Gloom, o pokémon da líder erica ainda está dentro do ginásio, e só você poderá salvá-lo das chamas...(energia +40)", "Ir proginazio", 40);
		Capitulo capitulo30 = new Capitulo("Você optou por ir ao cassino, chegando lá você perdeu todas as suas economias e queria recuperar a todo custo. Você teve a péssima ideia de apostar seu charmander e perdeu mais uma vez. (energia -100) Game Over", "Ir ao cassino", -100);
		
		
		
		
		
		
		//Adcionado os capitulos filhos ao raiz
		raiz.adicionarCapitulo(capitulo1);
		raiz.adicionarCapitulo(capitulo2);
		
		//Adcionado os capitulos filhos da 1º altura Sub Arvore.
		capitulo1.adicionarCapitulo(capitulo3); 
		capitulo1.adicionarCapitulo(capitulo4);
		       //Add 1º altura 2ºSub Arvore.
		capitulo2.adicionarCapitulo(capitulo5);
		capitulo2.adicionarCapitulo(capitulo6);
		
		
		//Adcionado os capitulos filhos da 3º altura Sub Arvore.
		capitulo3.adicionarCapitulo(capitulo7);
		capitulo3.adicionarCapitulo(capitulo8);
		
		capitulo4.adicionarCapitulo(capitulo9);
		capitulo4.adicionarCapitulo(capitulo10);
		      //Add 3º altura 2ºSub Arvore.
		capitulo5.adicionarCapitulo(capitulo11);
		capitulo5.adicionarCapitulo(capitulo12);
		
		capitulo6.adicionarCapitulo(capitulo13);
		capitulo6.adicionarCapitulo(capitulo14);
		
		
		
		
		
		//Adcionado os capitulos filhos da 4º altura Sub Arvore.
		         // finais 1º ramo
		capitulo7.adicionarCapitulo(capitulo15);
		capitulo7.adicionarCapitulo(capitulo16);		
		capitulo8.adicionarCapitulo(capitulo17);
		capitulo8.adicionarCapitulo(capitulo18);
		       
		capitulo9.adicionarCapitulo(capitulo19);
		capitulo9.adicionarCapitulo(capitulo20);
		capitulo10.adicionarCapitulo(capitulo21);
		capitulo10.adicionarCapitulo(capitulo22);
		
		//Adcionado os capitulos filhos da 4º altura Sub Arvore.
              // finais 2º subarvore 
		capitulo11.adicionarCapitulo(capitulo23);
		capitulo11.adicionarCapitulo(capitulo24);		
		capitulo12.adicionarCapitulo(capitulo25);
		capitulo12.adicionarCapitulo(capitulo26);
		       
		capitulo13.adicionarCapitulo(capitulo27);
		capitulo13.adicionarCapitulo(capitulo28);
		capitulo14.adicionarCapitulo(capitulo29);
		capitulo14.adicionarCapitulo(capitulo30);
		
		
		
		
		
		
		
		
		
		while(true)
		{	
			//			
			System.out.println("Escolha qual pokemon você deseja: ");
			System.out.println(" 0 - "+ listaPokemon[0]);
			System.out.println(" 1 - "+ listaPokemon[1]);
			System.out.println(" 2 - "+ listaPokemon[2]);
			
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
				System.out.println("Fim de jogo! ");
				break;
			
			
		}
		
		
		
		

	}

}
