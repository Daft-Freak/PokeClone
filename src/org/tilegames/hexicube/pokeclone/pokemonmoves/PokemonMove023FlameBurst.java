package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove023FlameBurst extends PokemonMoveGenericAttack
{
	public PokemonMove023FlameBurst()
	{
		super(23);
	}
	@Override
	public String getName()
	{
		return "Flame Burst";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.fire;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.special;
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
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String info()
	{
		return "The user attacks the target with a bursting flame.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove023FlameBurst();
	}
}