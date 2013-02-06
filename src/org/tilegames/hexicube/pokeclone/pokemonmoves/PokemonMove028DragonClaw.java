package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove028DragonClaw extends PokemonMoveGenericAttack
{
	public PokemonMove028DragonClaw()
	{
		super(28);
	}
	@Override
	public String getName()
	{
		return "Dragon Claw";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.dragon;
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
		return "The user slashes the target with huge, sharp claws.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove028DragonClaw();
	}
}