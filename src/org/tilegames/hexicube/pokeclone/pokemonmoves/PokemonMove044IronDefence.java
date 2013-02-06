package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;

public class PokemonMove044IronDefence extends PokemonMove
{
	public PokemonMove044IronDefence()
	{
		super(44);
	}
	@Override
	public String getName()
	{
		return "Iron Defence";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.steel;
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
		return 15;
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
		source.statMod(1, 2, false, false, battle);
		return 0;
	}
	@Override
	public String info()
	{
		return "The user hardens its body's surface like iron, sharply raising its Defense stat.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove044IronDefence();
	}
	@Override
	public boolean moveDamaging()
	{
		return false;
	}
}