package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;
import bot.pokemon.PokemonMain;

public class PokemonMove040Protect extends PokemonMove
{
	public PokemonMove040Protect()
	{
		super(40);
	}
	@Override
	public String getName()
	{
		return "Protect";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.normal;
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
		return 0;
	}
	@Override
	public int moveMaxUses()
	{
		return 10;
	}
	@Override
	public boolean moveDamaging()
	{
		return false;
	}
	@Override
	public int getMovePriority()
	{
		return 1;
	}
	@Override
	public boolean highCrit()
	{
		return false;
	}
	@Override
	public int performMove(PokemonMonster source, PokemonMonster target,
			int repeatCount, boolean wentFirst, PokemonMove opponentMove,
			PokemonBattle battle) {
		boolean worked = true;
		for(int a = 1; a < repeatCount && worked; a++)
		{
			worked = worked && PokemonMain.rand.nextBoolean();
		}
		if(worked)
		{
			battle.tellTrainers(source.nickname+" protected itself!");
			source.protect = true;
		}
		else battle.tellTrainers("The move failed...");
		return 0;
	}
	@Override
	public String info()
	{
		return "It enables the user to evade all attacks. Its chance of failing rises if it is used in succession.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove040Protect();
	}
}