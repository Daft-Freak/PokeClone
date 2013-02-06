package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;

public class PokemonMove043SkullBash extends PokemonMoveGenericAttack
{
	public PokemonMove043SkullBash()
	{
		super(43);
	}
	@Override
	public String getName()
	{
		return "Skull Bash";
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
		return 100;
	}
	@Override
	public int moveAccuracy()
	{
		return 100;
	}
	@Override
	public int moveMaxUses()
	{
		return 30;
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
		if(repeatCount == 1)
		{
			source.statMod(1, 1, false, true, battle);
			return 0;
		}
		else
		{
			return super.performMove(source, target, repeatCount, wentFirst, opponentMove, battle);
		}
	}
	@Override
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String info()
	{
		return "The user tucks in its head to raise its Defense in the first turn, then rams the foe on the next turn.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove043SkullBash();
	}
}