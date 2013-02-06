package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove024Slash extends PokemonMoveGenericAttack
{
	public PokemonMove024Slash()
	{
		super(24);
	}
	@Override
	public String getName()
	{
		return "Slash";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.normal;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.physical;
	}
	@Override
	public int movePower()
	{
		return 70;
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
		return true;
	}
	@Override
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String info()
	{
		return "The target is attacked with a slash of claws or blades. Critical hits land more easily.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove024Slash();
	}
}