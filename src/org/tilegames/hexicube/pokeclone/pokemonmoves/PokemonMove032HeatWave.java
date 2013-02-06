package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.hexicube.pokeclone.main.Game;
import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterMajorAilment;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove032HeatWave extends PokemonMoveGenericAttack
{
	public PokemonMove032HeatWave()
	{
		super(32);
	}
	@Override
	public String getName()
	{
		return "Heat Wave";
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
		return 100;
	}
	@Override
	public int moveAccuracy()
	{
		return 90;
	}
	@Override
	public int moveMaxUses()
	{
		return 10;
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
		if(amount > 0 && target.curHealth() > 0 && !target.isType(PokemonMonsterType.fire) && target.majorAilment == null && target.safeguard <= 0 && Game.rand.nextInt(10) == 0)
		{
			target.majorAilment = PokemonMonsterMajorAilment.burn;
			int abc = 0; //TODO: tell trainers burned
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
		return "The user attacks by exhaling hot breath on the opposing team. It may also leave targets with a burn.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove032HeatWave();
	}
}