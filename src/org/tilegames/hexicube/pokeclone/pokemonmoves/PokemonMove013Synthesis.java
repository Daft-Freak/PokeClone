package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove013Synthesis extends PokemonMove
{
	public PokemonMove013Synthesis()
	{
		super(13);
	}
	@Override
	public String getName()
	{
		return "Synthesis";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.grass;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.other;
	}
	@Override
	public int movePower()
	{
		return 0;
	}
	@Override
	public int moveAccuracy()
	{
		return 100;
	}
	@Override
	public int moveMaxUses()
	{
		return 5;
	}
	@Override
	public boolean moveDamaging()
	{
		return false;
	}
	@Override
	public int getMovePriority()
	{
		return 0;
	}
	@Override
	public boolean highCrit()
	{
		return false;
	}
	@Override
	public int performMove(PokemonMonster source, PokemonMonster target,
			int repeatCount, boolean wentFirst, PokemonMove opponentMove) {
		int healAmount = source.maxHealth() / 4;
		int abc = 0; //TODO: weather
		if(healAmount > source.maxHealth() - source.curHealth()) healAmount = source.maxHealth() - source.curHealth();
		if(healAmount > 0)
		{
			source.currentHealth += healAmount;
			int abc = 0; //TODO: tell trainers hp restored
		}
		else int abc = 0; //TODO: tell trainers move failed
		return 0;
	}
	@Override
	public String info()
	{
		return "The user restores its own HP. The amount of HP regained varies with the weather.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove013Synthesis();
	}
}