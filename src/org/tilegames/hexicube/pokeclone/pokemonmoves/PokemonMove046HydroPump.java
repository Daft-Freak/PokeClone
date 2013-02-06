package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove046HydroPump extends PokemonMoveGenericAttack
{
	public PokemonMove046HydroPump()
	{
		super(46);
	}
	@Override
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String getName()
	{
		return "Hydro Pump";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.water;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.special;
	}
	@Override
	public int movePower()
	{
		return 120;
	}
	@Override
	public int moveAccuracy()
	{
		return 80;
	}
	@Override
	public int moveMaxUses()
	{
		return 5;
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
		return "The target is blasted by a huge volume of Water launched under great pressure.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove046HydroPump();
	}
}