package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;

public class PokemonMove045RainDance extends PokemonMove
{
	public PokemonMove045RainDance()
	{
		super(45);
	}
	@Override
	public String getName()
	{
		return "Rain Dance";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.water;
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
			int repeatCount, boolean wentFirst, PokemonMove opponentMove,
			PokemonBattle battle) {
		int a = 0; //TODO: weather
		battle.tellTrainers("Nothing happened, probably because there's no weather yet...");
		battle.tellTrainers("Maybe you should pester Hexicube about it!");
		return 0;
	}
	@Override
	public String info()
	{
		return "The user summons a heavy rain that falls for five turns, powering up Water-type moves.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove045RainDance();
	}
}