package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove017Scratch extends PokemonMoveGenericAttack
{
	public PokemonMove017Scratch()
	{
		super(17);
	}
	@Override
	public String getName()
	{
		return "Scratch";
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
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String info()
	{
		return "Hard, pointed, and sharp claws rake the foe to inflict damage.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove017Scratch();
	}
}