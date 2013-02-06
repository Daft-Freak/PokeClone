package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove039RapidSpin extends PokemonMoveGenericAttack
{
	public PokemonMove039RapidSpin()
	{
		super(39);
	}
	@Override
	public String getName()
	{
		return "Rapid Spin";
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
		return 20;
	}
	@Override
	public int moveAccuracy()
	{
		return 100;
	}
	@Override
	public int moveMaxUses()
	{
		return 40;
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
		if(amount > 0)
		{
			if(source.leechSeeded)
			{
				int abc = 0; //TODO: tell trainers no longer seeded
				source.leechSeeded = false;
			}
			if(source.fireSpinTimer > 0)
			{
				int abc = 0; //TODO: tell trainers no longer in vortex
				source.fireSpinTimer = 0;
			}
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
		return "A spin attack that can also eliminate such moves as Bind, Wrap, Leech Seed, and Spikes.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove039RapidSpin();
	}
}