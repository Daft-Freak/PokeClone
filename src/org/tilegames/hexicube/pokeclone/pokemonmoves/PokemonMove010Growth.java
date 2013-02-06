package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove010Growth extends PokemonMove
{
	public PokemonMove010Growth()
	{
		super(10);
	}
	@Override
	public String getName()
	{
		return "Growth";
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
		return 40;
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
		source.statMod(0, 1, false, false);
		source.statMod(2, 1, false, false);
		return 0;
	}
	@Override
	public String info()
	{
		return "The user's body is forced to grow all at once. It raises the attack and special attack stats.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove010Growth();
	}
}