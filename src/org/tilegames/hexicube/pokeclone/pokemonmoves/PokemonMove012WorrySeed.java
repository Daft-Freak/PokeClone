package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;

public class PokemonMove012WorrySeed extends PokemonMove
{
	public PokemonMove012WorrySeed()
	{
		super(12);
	}
	@Override
	public String getName()
	{
		return "Worry Seed";
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
		return 0;
	}
	@Override
	public boolean highCrit() {
		return false;
	}
	@Override
	public int performMove(PokemonMonster source, PokemonMonster target,
			int repeatCount, boolean wentFirst, PokemonMove opponentMove,
			PokemonBattle battle) {
		if(!target.worrySeeded)
		{
			battle.tellTrainers(target.nickname+" was seeded!");
			target.worrySeeded = true;
		}
		else
		{
			battle.tellTrainers("The move failed!");
		}
		return 0;
	}
	@Override
	public String info()
	{
		return "A seed that causes worry is planted on the foe. It prevents sleep.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove012WorrySeed();
	}
}