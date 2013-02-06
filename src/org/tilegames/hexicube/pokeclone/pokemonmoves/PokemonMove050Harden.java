package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;

public class PokemonMove050Harden extends PokemonMove
{
	public PokemonMove050Harden()
	{
		super(50);
	}
	@Override
	public String getName()
	{
		return "Harden";
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
		return 30;
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
		source.statMod(1, 1, false, false, battle);
		return 0;
	}
	@Override
	public String info()
	{
		return "The user stiffens all the muscles in its body to raise its Defense stat.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove050Harden();
	}
	@Override
	public boolean moveDamaging()
	{
		return false;
	}
}