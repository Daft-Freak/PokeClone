package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove014SeedBomb extends PokemonMoveGenericAttack
{
	public PokemonMove014SeedBomb()
	{
		super(14);
	}
	@Override
	public String getName()
	{
		return "Seed Bomb";
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
		return 80;
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
		return "The user slams a barrage of hard-shelled seeds down on the foe from above.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove014SeedBomb();
	}
}