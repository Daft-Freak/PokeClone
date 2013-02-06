package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove031WingAttack extends PokemonMoveGenericAttack
{
	public PokemonMove031WingAttack()
	{
		super(31);
	}
	@Override
	public String getName()
	{
		return "Wing Attack";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.flying;
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
		return 35;
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
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String info()
	{
		return "The target is struck with large, imposing wings spread wide to inflict damage.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove031WingAttack();
	}
}