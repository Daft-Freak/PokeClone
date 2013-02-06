package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove011DoubleEdge extends PokemonMoveGenericAttack
{
	public PokemonMove011DoubleEdge()
	{
		super(11);
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
			source.currentHealth -= result/3;
			int abc = 0; //TODO; tell trainers recoil and faint
		}
		return result;
	}
	@Override
	public String getName()
	{
		return "Double-Edge";
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
		return 120;
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
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String info()
	{
		return "A reckless, life-risking tackle.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove011DoubleEdge();
	}
}