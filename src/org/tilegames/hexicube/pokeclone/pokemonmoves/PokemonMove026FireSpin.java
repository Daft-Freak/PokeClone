package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.hexicube.pokeclone.main.Game;
import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove026FireSpin extends PokemonMoveGenericAttack
{
	public PokemonMove026FireSpin()
	{
		super(26);
	}
	@Override
	public String getName()
	{
		return "Fire Spin";
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
		return 15;
	}
	@Override
	public int moveAccuracy()
	{
		return 70;
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
	public int performMove(PokemonMonster source, PokemonMonster target,
			int repeatCount, boolean wentFirst, PokemonMove opponentMove) {
		int amount = super.performMove(source, target, repeatCount, wentFirst, opponentMove);
		if(amount > 0 && target.curHealth() > 0)
		{
			int abc = 0; //TODO: tell trainers trapped in vortex
			int timer = Game.rand.nextInt(8);
			if(timer < 3) target.fireSpinTimer = 2;
			else if(timer < 6) target.fireSpinTimer = 3;
			else if(timer < 7) target.fireSpinTimer = 4;
			else target.fireSpinTimer = 5;
		}
		return amount;
	}
	@Override
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String info()
	{
		return "The target becomes trapped within a fierce vortex of Fire that rages for four to five turns.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove026FireSpin();
	}
}