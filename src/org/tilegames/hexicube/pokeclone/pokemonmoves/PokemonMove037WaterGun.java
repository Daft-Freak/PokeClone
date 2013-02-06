package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove037WaterGun extends PokemonMoveGenericAttack
{
	public PokemonMove037WaterGun()
	{
		super(37);
	}
	@Override
	public String getName()
	{
		return "Water Gun";
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
		return "The target is blasted with aforceful shot of Water.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove037WaterGun();
	}
}