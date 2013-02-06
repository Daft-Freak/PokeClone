package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterMajorAilment;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;
import bot.pokemon.PokemonMain;

public class PokemonMove018Ember extends PokemonMoveGenericAttack
{
	public PokemonMove018Ember()
	{
		super(18);
	}
	@Override
	public String getName()
	{
		return "Ember";
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
		return 25;
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
			int repeatCount, boolean wentFirst, PokemonMove opponentMove,
			PokemonBattle battle) {
		int amount = super.performMove(source, target, repeatCount, wentFirst, opponentMove, battle);
		if(amount > 0 && target.curHealth() > 0 && !target.isType(PokemonMonsterType.fire) && target.majorAilment == null && target.safeguard <= 0 && PokemonMain.rand.nextInt(10) == 0) //mundane hit check
		{
			target.majorAilment = PokemonMonsterMajorAilment.burn;
			battle.tellTrainers(target.nickname+" was burned!");
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
		return "The target is attacked with small flames. It may also leave the target with a burn.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove018Ember();
	}
}