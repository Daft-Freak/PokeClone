package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;
import bot.pokemon.PokemonMain;

public class PokemonMove041WaterPulse extends PokemonMoveGenericAttack
{
	public PokemonMove041WaterPulse()
	{
		super(41);
	}
	@Override
	public boolean highCrit() {
		return false;
	}
	@Override
	public int performMove(PokemonMonster source, PokemonMonster target,
			int repeatCount, boolean wentFirst, PokemonMove opponentMove,
			PokemonBattle battle)
	{
		int result = super.performMove(source, target, repeatCount, wentFirst, opponentMove, battle);
		if(result > 0 && target.curHealth() > 0 && target.majorAilment == null && PokemonMain.rand.nextInt(10) < 2)
		{
			target.confused = true;
			battle.tellTrainers(target.nickname+" became confused!");
		}
		return result;
	}
	@Override
	public String getName()
	{
		return "Water Pulse";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.water;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.special;
	}
	@Override
	public int movePower()
	{
		return 60;
	}
	@Override
	public int moveAccuracy()
	{
		return 100;
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
		return "The user attacks the target with a pulsing blast of Water. It may also confuse the target.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove041WaterPulse();
	}
}