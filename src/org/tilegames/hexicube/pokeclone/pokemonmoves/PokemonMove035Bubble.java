package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove035Bubble extends PokemonMoveGenericAttack
{
	public PokemonMove035Bubble()
	{
		super(35);
	}
	@Override
	public String getName()
	{
		return "Bubble";
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
			int repeatCount, boolean wentFirst, PokemonMove opponentMove) {
		int amount = super.performMove(source, target, repeatCount, wentFirst, opponentMove);
		if(amount > 0 && target.curHealth() > 0)
		{
			target.statMod(6, -1, true, true);
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
		return "A spray of countless bubbles is jetted at the opposing team. It may also lower the targets' Speed stats.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove035Bubble();
	}
}