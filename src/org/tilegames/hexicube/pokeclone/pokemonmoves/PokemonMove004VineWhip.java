package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove004VineWhip extends PokemonMoveGenericAttack
{
	public PokemonMove004VineWhip()
	{
		super(4);
	}
	@Override
	public String getName()
	{
		return "Vine Whip";
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
		return 35;
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
	public boolean highCrit() {
		return false;
	}
	@Override
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String info()
	{
		return "The foe is struck with slender, whiplike vines to inflict damage.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove004VineWhip();
	}
}