package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.hexicube.pokeclone.main.Game;
import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove030AirSlash extends PokemonMoveGenericAttack
{
	public PokemonMove030AirSlash()
	{
		super(30);
	}
	@Override
	public String getName()
	{
		return "Air Slash";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.flying;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.special;
	}
	@Override
	public int movePower()
	{
		return 75;
	}
	@Override
	public int moveAccuracy()
	{
		return 95;
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
	public boolean highCrit()
	{
		return false;
	}
	@Override
	public int performMove(PokemonMonster source, PokemonMonster target,
			int repeatCount, boolean wentFirst, PokemonMove opponentMove) {
		int amount = super.performMove(source, target, repeatCount, wentFirst, opponentMove);
		if(Game.rand.nextInt(10) < 3 && wentFirst) target.flinched = true;
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
		return "The user attacks with a blade of air that slices even the sky. It may also make the target flinch.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove030AirSlash();
	}
}