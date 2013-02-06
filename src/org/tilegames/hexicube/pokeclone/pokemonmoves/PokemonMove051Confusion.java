package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;
import bot.pokemon.PokemonMain;

public class PokemonMove051Confusion extends PokemonMoveGenericAttack
{
	public PokemonMove051Confusion()
	{
		super(51);
	}
	@Override
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String getName()
	{
		return "Confusion";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.psychic;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.special;
	}
	@Override
	public int movePower()
	{
		return 50;
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
		if(amount > 0 && target.curHealth() > 0 && !target.confused && target.safeguard <= 0 && PokemonMain.rand.nextInt(10) == 0)
		{
			battle.tellTrainers(target.nickname+" became confused!");
			target.confused = true;
		}
		return amount;
	}
	@Override
	public String info()
	{
		return "The target is hit by a weak telekinetic force. It may also leave the target confused.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove051Confusion();
	}
}