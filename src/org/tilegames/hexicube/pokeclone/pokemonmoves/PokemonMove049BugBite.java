package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove049BugBite extends PokemonMoveGenericAttack
{
	public PokemonMove049BugBite()
	{
		super(49);
	}
	@Override
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String getName()
	{
		return "Bug Bite";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.bug;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.physical;
	}
	@Override
	public int movePower()
	{
		return 60;
	}
	@Override
	public int moveAccuracy()
	{
		return 100;
	}
	@Override
	public int moveMaxUses()
	{
		return 20;
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
		return "The user bites the target.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove049BugBite();
	}
}