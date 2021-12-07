package classes;

public class Pokemon {
	
	private String name;
	private String type;
	private int atack, defense, speed, specialAtack, specialDefense ;
	private float life;
	
	public Pokemon (String name, String type, float life, 
			int atack, int defense, int speed, 
			int specialAtack, int specialDefense) 
	{

		this.name = name;
		this.type = type;
		this.life = life;
		this.atack = atack;
		this.defense = defense;
		this.speed = speed;
		this.specialAtack = specialAtack;
		this.specialDefense = specialDefense;
	}
	
	private float damageTakenBy(Pokemon pokemon)
	{
		//O objeto ataca e a várivel pokemon toma.
		
		int stringIndex = 0;
		float damageTaken = 0;
		float damageMultiplier = 0;
		
		String[] damage = new String[] {};
		String atackedPokemonType = pokemon.type;
		
		if(this.type == "Fogo")
		{
			damage = new String[] {"Fogo", "0.5", "Elétrico", "1", "Planta", "2", "Normal", "1"};
		}
		else if(this.type == "Elétrico")
		{
			damage = new String[] {"Fogo", "1", "Elétrico", "0.5", "Planta", "0.5", "Normal", "1"};
		}
		else if(this.type == "Planta")
		{
			damage = new String[] {"Fogo", "0.5", "Elétrico", "1", "Planta", "0.5", "Normal", "1"};
		}
		else if(this.type == "Normal")
		{
			damage = new String[] {"Fogo", "1", "Elétrico", "1", "Planta", "1", "Normal", "1"};
		}
		
		for(int i = 0; i < damage.length; i++)
		{
			String aux = new String();
			aux = damage[i];
			if(atackedPokemonType == aux)
			{
				stringIndex = i + 1;
				break;
			}
		}
		
		damageMultiplier = Float.valueOf(damage[stringIndex]).floatValue();
		damageTaken = (this.atack * damageMultiplier);
		return damageTaken;
	}
	
	public void atackPokemon(Pokemon pokemon)
	{
		pokemon.life -= damageTakenBy(pokemon);
	}

}
