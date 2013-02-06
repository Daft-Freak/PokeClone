package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterMajorAilment;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;

public class PokemonMove027Inferno extends PokemonMoveGenericAttack
{
	public PokemonMove027Inferno()
	{
		super(27);
	}
	@Override
	public String getName()
	{
		return "Inferno";
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
		return 50;
	}
	@Override
	public int moveMaxUses()
	{
		return 5;
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
		if(amount > 0 && target.curHealth() > 0 && !target.isType(PokemonMonsterType.fire) && target.majorAilment == null && target.safeguard <= 0) //mundane hit check
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
		return "The user attacks by engulfing the target in an intense Fire. It leaves the target with a burn.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove027Inferno();
	}
}