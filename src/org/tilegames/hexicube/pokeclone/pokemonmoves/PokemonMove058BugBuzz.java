package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.hexicube.pokeclone.main.Game;
import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove058BugBuzz extends PokemonMoveGenericAttack
{
	public PokemonMove058BugBuzz()
	{
		super(58);
	}
	@Override
	public String getName()
	{
		return "Bug Buzz";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.bug;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.special;
	}
	@Override
	public int movePower()
	{
		return 90;
	}
	@Override
	public int moveAccuracy()
	{
		return 100;
	}
	@Override
	public int moveMaxUses()
	{
		return 10;
	}
	@Override
	public boolean moveDamaging()
	{
		return true;
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
	public int performMove(PokemonMonster source, PokemonMonster target,
			int repeatCount, boolean wentFirst, PokemonMove opponentMove)
	{
		int amount = super.performMove(source, target, repeatCount, wentFirst, opponentMove);
		if(amount > 0 && Game.rand.nextInt(10) == 4)
		{
			target.statMod(3, -1, true, true);
		}
		return amount;
	}
	@Override
	public String info()
	{
		return "The user generates odd sound waves from its body. It may confuse the target.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove058BugBuzz();
	}
	@Override
	public boolean breakThroughProtect()
	{
		return false;
	}
}