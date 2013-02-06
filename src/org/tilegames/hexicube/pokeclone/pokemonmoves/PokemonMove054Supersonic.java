package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;

public class PokemonMove054Supersonic extends PokemonMove
{
	public PokemonMove054Supersonic()
	{
		super(54);
	}
	@Override
	public String getName()
	{
		return "Supersonic";
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
		return 55;
	}
	@Override
	public int moveMaxUses()
	{
		return 20;
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
			PokemonBattle battle)
	{
		if(!target.confused && target.safeguard <= 0)
		{
			target.confused = true;
			battle.tellTrainers(target.nickname+" became confused!");
		}
		else
		{
			battle.tellTrainers("The move has no effect...");
			return 0;
		}
		return 0;
	}
	@Override
	public String info()
	{
		return "The user generates odd sound waves from its body. It may confuse the target.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove054Supersonic();
	}
}