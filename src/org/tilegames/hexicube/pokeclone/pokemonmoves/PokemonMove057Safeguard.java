package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;

public class PokemonMove057Safeguard extends PokemonMove
{
	public PokemonMove057Safeguard()
	{
		super(57);
	}
	@Override
	public String getName()
	{
		return "Safeguard";
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
		return 100;
	}
	@Override
	public int moveMaxUses()
	{
		return 25;
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
			int repeatCount, boolean wentFirst, PokemonMove opponentMove,
			PokemonBattle battle) {
		if(source.safeguard == 0)
		{
			battle.tellTrainers(source.nickname+" protected itself!");
			source.safeguard = 5;
		}
		else battle.tellTrainers("The move failed...");
		return 0;
	}
	@Override
	public String info()
	{
		return "The user creates a protective field that prevents status problems for five turns.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove057Safeguard();
	}
}