package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove053Gust extends PokemonMoveGenericAttack
{
	public PokemonMove053Gust()
	{
		super(53);
	}
	@Override
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String getName()
	{
		return "Gust";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.flying;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.special;
	}
	@Override
	public int movePower()
	{
		return 40;
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
	public String info()
	{
		return "A gust of wind is whipped up by wings and launched at the target to inflict damage.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove053Gust();
	}
}