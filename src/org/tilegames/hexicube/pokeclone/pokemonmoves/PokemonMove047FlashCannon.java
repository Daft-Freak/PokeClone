package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;
import bot.pokemon.PokemonMain;

public class PokemonMove047FlashCannon extends PokemonMoveGenericAttack
{
	public PokemonMove047FlashCannon()
	{
		super(47);
	}
	@Override
	public String getName()
	{
		return "Flash Cannon";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.steel;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.special;
	}
	@Override
	public int movePower()
	{
		return 80;
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
		if(PokemonMain.rand.nextInt(10) == 0) target.statMod(3, -1, true, true, battle);
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
		return "The user gathers all its light energy and releases it at once. It may also lower the target's Sp. Def stat.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove047FlashCannon();
	}
}