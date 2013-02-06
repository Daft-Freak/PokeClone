package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove008RazorLeaf extends PokemonMoveGenericAttack
{
	public PokemonMove008RazorLeaf()
	{
		super(8);
	}
	@Override
	public String getName()
	{
		return "Razor Leaf";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.grass;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.physical;
	}
	@Override
	public int movePower()
	{
		return 55;
	}
	@Override
	public int moveAccuracy()
	{
		return 95;
	}
	@Override
	public int moveMaxUses()
	{
		return 25;
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
		return "A sharp-edged leaf is launched to slash at the foe. It has a higher critical-hit ratio.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove008RazorLeaf();
	}
}