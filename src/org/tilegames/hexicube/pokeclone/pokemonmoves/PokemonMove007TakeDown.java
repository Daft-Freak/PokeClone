package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove007TakeDown extends PokemonMoveGenericAttack
{
	public PokemonMove007TakeDown()
	{
		super(7);
	}
	@Override
	public boolean highCrit() {
		return false;
	}
	@Override
	public int performMove(PokemonMonster source, PokemonMonster target,
			int repeatCount, boolean wentFirst, PokemonMove opponentMove)
	{
		int result = super.performMove(source, target, repeatCount, wentFirst, opponentMove);
		if(result > 0)
		{
			source.currentHealth -= result/4;
			int abc = 0; //TODO: tell trainers recoil and faint
		}
		return result;
	}
	@Override
	public String getName()
	{
		return "Take Down";
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
		return 90;
	}
	@Override
	public int moveAccuracy()
	{
		return 85;
	}
	@Override
	public int moveMaxUses()
	{
		return 20;
	}
	@Override
	public int getMovePriority()
	{
		return 0;
	}
	@Override
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String info()
	{
		return "A reckless, full-body charge attack for slamming into the foe. It also damages the user a little.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove007TakeDown();
	}
}