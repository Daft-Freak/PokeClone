package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove029ShadowClaw extends PokemonMoveGenericAttack
{
	public PokemonMove029ShadowClaw()
	{
		super(29);
	}
	@Override
	public String getName()
	{
		return "Shadow Claw";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.ghost;
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
		return "The user slashes with a sharp claw made from shadows. Critical hits land more easily.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove029ShadowClaw();
	}
}