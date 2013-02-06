package org.tilegames.pokeclone.pokemon;

public abstract class PokemonMonsterBase
{
	public int ID;
	
	public PokemonMonsterBase(int ID)
	{
		try
		{
			if(pokemonList[ID] != null)
			{
				System.err.println("DUPLICATE POKEMON BASE ID: "+String.valueOf(ID));
				System.exit(1);
			}
		}
		catch (IndexOutOfBoundsException e)
		{
			System.err.println("INVALID POKEMON BASE ID: "+String.valueOf(ID));
			System.exit(1);
		}
		pokemonList[ID] = this;
		this.ID = ID;
	}
	
	public abstract String name();
	public abstract int health();
	public abstract int attack();
	public abstract int defence();
	public abstract int specialAttack();
	public abstract int specialDefence();
	public abstract int speed();
	public abstract int healthEVGain();
	public abstract int attackEVGain();
	public abstract int defenceEVGain();
	public abstract int specialAttackEVGain();
	public abstract int specialDefenceEVGain();
	public abstract int speedEVGain();
	public abstract int expGain();
	public abstract int captureRate();
	public abstract PokemonMonsterType primaryType();
	public abstract PokemonMonsterType secondaryType();
	public abstract PokemonMonsterLearnableMove[] learnableMoves();
	public abstract int evolveLevel();
	public abstract PokemonMonsterBase evolveSpecies();
	
	public static final PokemonMonsterBase[] pokemonList = new PokemonMonsterBase[256];
}