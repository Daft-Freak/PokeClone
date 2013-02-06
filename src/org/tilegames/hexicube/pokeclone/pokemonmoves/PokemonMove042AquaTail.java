package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove042AquaTail extends PokemonMoveGenericAttack
{
	public PokemonMove042AquaTail()
	{
		super(24);
	}
	@Override
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String getName()
	{
		return "Aqua Tail";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.water;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.physical;
	}
	@Override
	public int movePower()
	{
		return 90;
	}
	@Override
	public int moveAccuracy()
	{
		return 90;
	}
	@Override
	public int moveMaxUses()
	{
		return 10;
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
	public String info()
	{
		return "The user attacks by swinging its tail as if it were a vicious wave in a raging storm.";
	}

	@Override
	public PokemonMove copy()
	{
		return new PokemonMove042AquaTail();
	}
}