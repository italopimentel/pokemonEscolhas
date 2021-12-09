package classes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*/ Cria��o do pokemom p/teste
		PokemonSimples lala = new PokemonSimples("Pikachu", "Eletrico");
		// Cria Jogador
		Jogador jogador = new Jogador(100,lala);
		
		Cria��o do Capitulo raiz
		Capitulo raiz = new Capitulo("Texto1", "home", 0);
		Cria��o do capitulos filhos da raiz.
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
				new PokemonSimples("Squirtle", "�gua")
				
		};		
		
		//Cria��o do Capitulo raiz Primeira altura
		Capitulo raiz = new Capitulo("Voc� est� iniciando hoje sua jornada pokemon, parab�ns por ter escolhido charmander. O mundo l� fora est� cheio de aventuras e perigos, cuidado onde pisa e boa jornada!!\r\n Pra qual caminho voc� deseja percorrer? 1 - floresta de veridian 2 - pegar atalho para cidade de cerulean", "home", 0);
		//Cria��o do capitulos filhos da raiz .
		Capitulo capitulo1 = new Capitulo("Voc� chegou com seu charmander na floresta de viridian e tentou capturar seu primeiro pokemon, ele era um Bedrill, e voc� o derrotou, mas ele fugiu e chamou os amigos. Corra!!\r\n Charmander est� sendo atacado por diversos Bedrill's. (Voc� Perdeu 20 pontos).\r\n O que voc� deseja fazer?\r\n"
				+ "3 - Seguir caminho para cidade de viridian e desafiar geovanni\r\n"
				+ "4 - Seguir para cidade de viridian, e n�o visitar o gin�sio", "Floresta de Viridian", -20);
		Capitulo capitulo2 = new Capitulo("Voc� e seu charmander tomaram um atalho para cidade de cerulean, encontrando uma nova companheira no caminho, o nome dela � Misty. \r\nChegando na cidade de cerulean, voc�s dois juntos batalharam contra as irm�s de misty e venceram, ganhando sua primeira ins�gnia, a ins�gnia de cascata. (energia +40).", "Atalho para cerulian", 40);
		
		
		// Cria��o Capitulos 2� Altura 1� Sub Arvore
		Capitulo capitulo3 = new Capitulo("Voc� chegou na cidade de viridian, e se achou no direito de desafiar Giovanni. P�ssima not�cia, os pok�mons dele est�o no �ltimo n�vel, voc� n�o conseguiu nem passar pelo seu Rhyhorn. \r\nSeu pok�mon ficou decepcionado.\r\nO que voc� deseja fazer? \r\n"
				+ "7 -Seguir para cidade de pewter\r\n"
				+ "8 - Seguir para vermilion", "Desafiar Giovani", -40);
		
		Capitulo capitulo4 = new Capitulo("Voc� chegou na cidade de viridian, visitou o centro pok�mon e curou seu charmander. Aproveitou para capturar uns pokemons novos e conhecer mais a cidade. (Energia +20).\r\n O que deseja fazer agora\r\n"
				+ "9 -Seguir para lavendere Town\r\n"
				+ "10 -Seguir para cidade de celadon", "N�o Visitar ginasio", +20);
		
		      // Cria��o Capitulos 2� Altura  2� Sub Arvore
		
		Capitulo capitulo5 = new Capitulo("Oh n�o, seguindo sua jornada pokemon para fuschia, voc� caiu num buraco, de repente voc� escuta \"prepare-se para encrenca, encrenca em dobro...\", s�o os famosos ladr�es de pokemon, jesse e james da equipe rocket,\r\n voc� est� em desvantagem, seu charmander se machucou ao cair no buraco e eles tem 1 pok�mon cada para te enfrentar (energia -60).O que voc� deseja fazer? \r\n"
				+ "11 - Batalhar contra os rockets\r\n"
				+ "12- Escalar o buraco e na hora de batalhar, fugir","Seguir para fuschia", -60);		
		
		Capitulo capitulo6 = new Capitulo("Chegando na ilha de cinnabar, voc� n�o consegue achar o gin�sio local. e voc� descobriu que houve um grande inc�ndio na ilha, e que Blaine, o l�der do gin�sio, mudou sua localidade para as ilhas seafom.\n\r Fazendo com que voc� tenha que decidir se ir� buscar as outras insignias ou seguir para as ilhas.(energia +30).O que voc� deseja fazer? \r\n"
					+ "13 - Seguir para ilhas seafom\r\n"
					+ "14 - Seguir jornada pok�mon", "Seguir para cinnabar", 30);
		
		
		
		
		
		// Cria��o Capitulos 3� Altura 1� Sub Arvore
		Capitulo capitulo7 = new Capitulo("Voc� chegou na cidade de pewter, foi at� o centro pokemon e ouviu falar sobre o l�der do gin�sio local, o Brock e seu tem�vel onix, um pokemon imenso. \r\nSeu charmander est� com medo de batalhar devido a �ltima derrota para giovanni (energia +10).\r\n O que voc� deseja fazer? \r\n"
				+ "15 - Batalhar com brock mesmo assim\r\n"
				+ "16 - Seguir para cidade de vermilion", "Seguir para cidade de pewter", +10);
		
		Capitulo capitulo8 = new Capitulo("Voc� agora chegou na cidade de vermilion, e ouviu boatos da equipe rocket estar na cidade. Enquanto caminhava, voc� foi parado por duas mo�as e recebeu o convite para o SS. \r\nANE, um navio luxuoso que est� repleto de treinadores.\r\n Oque voc� deseja fazer? \r\n"
				+ "17 - Entrar no SS ANE e fazer novos amigos\r\n"
				+ "18- Seguir para batalhar com sargente Surge, l�der do gin�sio local", "Seguir para vermilion", 0);
		Capitulo capitulo9 = new Capitulo("Lavander � conhecida por ser uma cidade mal assombrada, voc� arriscou enfrentar os pokemons fantasmas sem o Slipth Scope, dispositivo que permite que voc� visualize os fantasmas. (energia -50).\r\n Ap�s esse erro, voc� conseguiu a ferramenta com MR fuji e capturou seu primeiro pokemon fantasma.\r\n O que voc� deseja fazer? \r\n"
				+ "19 - Seguir para Saffron\r\n"
				+ "18 - Seguir para safari zone", "Seguir para lavander", -50);
		Capitulo capitulo10 = new Capitulo("Voc� chegou na cidade de celadon, famosa por seus perfumes maravilhosos, criados no pr�prio gin�sio da cidade pela l�der erica e tamb�m conhecida por ter o maior departamento de lojas e seu pr�prio cassino. \r\nO que voc� deseja fazer? \r\n"
				+ "21 - Seguir para o gin�sio\r\n"
				+ "22 - Seguir para o cassino", "Seguir para Celadon", 0);
		
		      // Cria��o Capitulos 3� Altura 2� Sub Arvore
		Capitulo capitulo11 = new Capitulo("Ap�s sair do buraco, voc� bravamente ir� enfrentar Jesse e James, ap�s perseverar muito voc� vence e seu charmander acaba evoluindo, e fazendo com que a equipe rocket decole. (Energia +80).\n\r Agora com seu pok�mon evolu�do, seguindo sua jornada pokemon. \r\nO que voc� deseja fazer? \r\n"
				+ "23 - Seguir para fuschia e enfrentar Koga\r\n"
				+ "24 - Visitar a safari zone, que fica pr�xima a fuschia", "Batalhar", +80);
		Capitulo capitulo12 = new Capitulo("Com seu pok�mon ferido da queda na armadilha da equipe rocket, voc� corre bastante para fugir de Jesse e James e acaba se desviando da rota da cidade de Fuschia.\r\n Voc� acaba se deparando com Bill, um pesquisador pork�mon, que vive em seu farol, aguardando a chegada de um pokemon que ele diz nunca ter sido visto antes. (energia -30 por ter fugido)\r\nO que voc� deseja fazer? \r\n"
				+ "25 - Aguardar junto com bill a apari��o desse pokemon\r\n"
				+ "26- Seguir jornada pokemon", "Fugir", -30);
		Capitulo capitulo13 = new Capitulo("Ap�s chegar nas ilhas seafom, ao procurar blaine, voc� descobriu que havia um pokemon raro na colina pr�xima ao gin�sio. Era o lend�rio pokemon moltres, uma das tr�s aves lend�rias da regi�o de kanto, do tipo fogo. (energia +30)\r\nO que voc� deseja fazer? \r\n"
				+ " 28 - Seguir para batalha com moltres\r\n"
				+ "29- Seguir bara batalha com Blaine", "Ir apara as ilhas Seafon", +30);
		Capitulo capitulo14 = new Capitulo("Voc� chegou na cidade de celadon, famosa por seus perfumes maravilhosos, criados no pr�prio gin�sio da cidade pela l�der erica e tamb�m conhecida por ter o maior departamento de lojas e seu pr�prio cassino.\r\nO que voc� deseja fazer? \r\n"
				+ " 30 - Seguir para o gin�sio\r\n"
				+ "31- Seguir para o cassino", "Seguir Jornada Pokemon", 0);		
		
		
		
		
		
		// Cria��o Capitulos 4� Altura 1� Sub Arvore
		Capitulo capitulo15 =new Capitulo("Voc� e brock tiveram uma dura batalha, mas ap�s perserverar, voc� e seu charmander conseguiram derrot�-lo. Parab�ns, apesar dos desafios iniciais, voc� agora tem sua primeira insignia pok�mon, a jornada continua...", "Batalhar com Brock", 0);
		Capitulo capitulo16 = new Capitulo("Chegando em vermillion voc� se deparou com o sargento Surge e seu Raichu, l�der do gin�sio local e agora voc� n�o tem para onde correr, seu pok�mon est� com medo de batalhar devido a �ltima luta com giovanni e agora ter�o de batalhar.\r\n Boa sorte nesta batalha e na busca pela sua primeira ins�gnia.", "Seguir para vermillion", 0);
		Capitulo capitulo17 = new Capitulo("N����O, era uma armadilha, dentre os tripulantes do navio, v�rios eram rockets disfar�ados. Infelizmente por seus pok�mons estarem na fase inicial, voc� foi roubado. (Energia -100) Game over", "Optou por entrar no SS ANE", -100);		
		Capitulo capitulo18 = new Capitulo("Chegando em vermillion voc� se deparou com o sargento Surge e seu Raichu, l�der do gin�sio local e agora voc� n�o tem para onde correr, seu pok�mon est� com medo de batalhar devido a �ltima luta com giovanni e agora ter�o de batalhar.\r\n Boa sorte nesta batalha e na busca pela sua primeira ins�gnia.", "Batalhar contra Surge", 0);
		
		Capitulo capitulo19 = new Capitulo("Chegando em Saffron, a lider Sabrina � meio louca, e muito poderosa com seu Kadabra, mas voc� fez certo, se previniu e tinha um pok�mon fantasma no seu time, a batalha ir� se iniciar e voc� tem grande vantagem no tipo. Boa sorte treinador!!", "Seguir para Saffron", 0);
		Capitulo capitulo20 = new Capitulo("Chegando na zona safari voc� fica admirado, v�rios e v�rios pokemons selvagens correndo livremente, Voc� captura alguns e fica muito feliz (energia +40). \r\nVoc� nota algo estranho, um menino na bolsa de um kangaskhan, o que ser� aquilo ?! vamos dar uma olhada...", "Seguir para safari zone", 40);
		Capitulo capitulo21 = new Capitulo("Ao chegar no gin�sio, voc� descobriu que a equipe rocket havia invadido para roubar a f�rmula secreta dos perfumes e acabou provocando um inc�ndio no local, Gloom, o pok�mon da l�der erica ainda est� dentro do gin�sio,\r\n e s� voc� poder� salv�-lo das chamas...(energia +40)", "Ir ao gin�sio", 40);
		Capitulo capitulo22 = new Capitulo("Voc� optou por ir ao cassino, chegando l� voc� perdeu todas as suas economias e queria recuperar a todo custo. Voc� teve a p�ssima ideia de apostar seu charmander e perdeu mais uma vez. (energia -100) Game Over", "Ir ao Cassino", -100);
		    // Cria��o Capitulos 4� Altura 2� Sub Arvore
		Capitulo capitulo23 = new Capitulo("Chegando na cidade de fuschia, voc� ir� ao encontro de Koga, o l�der de gin�sio do tipo venenoso, famoso por suas habilidades ninjas em batalha, voc� ter� uma dura batalha, boa sorte treinador, seu pok�mon rec�m evolu�do est� bastante confiante. (energia +30)", "Ir a fuschia", +30);
		Capitulo capitulo24 = new Capitulo("Chegando na zona safari voc� fica admirado, v�rios e v�rios pokemons selvagens correndo livremente, Voc� captura alguns e fica muito feliz (energia +40).\r\nVoc� nota algo estranho, um menino na bolsa de um kangaskhan, o que ser� aquilo ?! vamos dar uma olhada...", "Ir a safari zone", +40);
		Capitulo capitulo25 = new Capitulo("A espera de voc�s foi recompensada, o pok�mon raro e gigante � na verdade um dragonite, por�m a equipe rocket aparece e acaba espantando o pok�mon raro.\r\nAp�s voc�s batalharem e vencerem, bill diz que continuar� esperando o dragonite retornar algum dia e voc� seguir� sua jornada pokemon. (energia +40) ", "Zona De Safari", 40);

		Capitulo capitulo26 = new Capitulo("Seguindo sua jornada pok�mon, voc� chega num festival, numa cidade conhecida como pico da donzela. Onde voc� conhece a lenda urbana do pico da donzela e descobre que na verdade era um gastly em seu lugar.\r\n Seguindo assim para buscar novas batalhas e novas ins�gnias. (energia +20)", "Seguir jornada", 20);
		Capitulo capitulo27 = new Capitulo("chegando no topo da colina, estav a lend�ria ave de kanto, a fenix, moltres, voc� a desafia para uma batalha, na tentativa de capturar um pok�mon lend�rio.\r\nInfelizmente voc� n�o � pareo, e a ave sai vitoriosa, mas voc� nunca se esquecer� dessa batalha, e jura pra si mesmo que na pr�xima ir� captura-lo. (Energia -100 pois perdeu a batalha)", "Optou por batalhar contra moltres", -100);
		
		Capitulo capitulo28 = new Capitulo("Chegou a hora da batalha contra blaine e seu poderoso magmar, voc� fica surpreso quando descobre que o gin�sio fica dentro de um vulc�o, e de in�cio se assusta com o desafio.\r\n Por�m, voc� cria coragem e parte para a batalha derradeira, confiante de sua vit�ria, boa sorte treinador. (energia +30)", "Btalhar com Blaine", 30);
		Capitulo capitulo29 = new Capitulo("Ao chegar no gin�sio, voc� descobriu que a equipe rocket havia invadido para roubar a f�rmula secreta dos perfumes e acabou provocando um inc�ndio no local, Gloom, o pok�mon da l�der erica ainda est� dentro do gin�sio, e s� voc� poder� salv�-lo das chamas...(energia +40)", "Ir proginazio", 40);
		Capitulo capitulo30 = new Capitulo("Voc� optou por ir ao cassino, chegando l� voc� perdeu todas as suas economias e queria recuperar a todo custo. Voc� teve a p�ssima ideia de apostar seu charmander e perdeu mais uma vez. (energia -100) Game Over", "Ir ao cassino", -100);
		
		
		
		
		
		
		//Adcionado os capitulos filhos ao raiz
		raiz.adicionarCapitulo(capitulo1);
		raiz.adicionarCapitulo(capitulo2);
		
		//Adcionado os capitulos filhos da 1� altura Sub Arvore.
		capitulo1.adicionarCapitulo(capitulo3); 
		capitulo1.adicionarCapitulo(capitulo4);
		       //Add 1� altura 2�Sub Arvore.
		capitulo2.adicionarCapitulo(capitulo5);
		capitulo2.adicionarCapitulo(capitulo6);
		
		
		//Adcionado os capitulos filhos da 3� altura Sub Arvore.
		capitulo3.adicionarCapitulo(capitulo7);
		capitulo3.adicionarCapitulo(capitulo8);
		
		capitulo4.adicionarCapitulo(capitulo9);
		capitulo4.adicionarCapitulo(capitulo10);
		      //Add 3� altura 2�Sub Arvore.
		capitulo5.adicionarCapitulo(capitulo11);
		capitulo5.adicionarCapitulo(capitulo12);
		
		capitulo6.adicionarCapitulo(capitulo13);
		capitulo6.adicionarCapitulo(capitulo14);
		
		
		
		
		
		//Adcionado os capitulos filhos da 4� altura Sub Arvore.
		         // finais 1� ramo
		capitulo7.adicionarCapitulo(capitulo15);
		capitulo7.adicionarCapitulo(capitulo16);		
		capitulo8.adicionarCapitulo(capitulo17);
		capitulo8.adicionarCapitulo(capitulo18);
		       
		capitulo9.adicionarCapitulo(capitulo19);
		capitulo9.adicionarCapitulo(capitulo20);
		capitulo10.adicionarCapitulo(capitulo21);
		capitulo10.adicionarCapitulo(capitulo22);
		
		//Adcionado os capitulos filhos da 4� altura Sub Arvore.
              // finais 2� subarvore 
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
			System.out.println("Escolha qual pokemon voc� deseja: ");
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

			        //PEGA A OP��O DO USU�RIO
			        System.out.print("Escolha um Caminho: ");
			        int opcaoCapitulo = consoleInput.nextInt();

			        //AVAN�A AO PR�XIMO N�VEL
			        int retorno = jogo.proximoNivel(opcaoCapitulo);
			        
			        if(retorno == 1)
			        {
			        	System.out.println("Sua energia acabou.");
			        	break;
			        }
			        else if(retorno == 2)
			        {
			        	System.out.println("Voc� chegou o fim.");
			        	break;
			        }
			        

			    }else{
			        System.out.println("VOC� CHEGOU AO FINAL DO JOGO");
			        break;
			    }

			}
			
			//Condi��o de parada
			System.out.println("Deseja Continuar. 0-SIM 1-N�O: ");
			
			int nexlineInput = consoleInput.nextInt();
			if (nexlineInput == 1)
				System.out.println("Fim de jogo! ");
				break;
			
			
		}
		
		
		
		

	}

}
