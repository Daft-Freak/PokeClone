package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.hexicube.pokeclone.main.Game;
import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove038Bite extends PokemonMoveGenericAttack
{
	public PokemonMove038Bite()
	{
		super(38);
	}
	@Override
	public String getName()
	{
		return "Bite";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.dark;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.physical;
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
			int repeatCount, boolean wentFirst, PokemonMove opponentMove) {
		int amount = super.performMove(source, target, repeatCount, wentFirst, opponentMove);
		if(Game.rand.nextInt(10) == 0 && wentFirst) target.flinched = true;
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
		return "The target is bitten with viciously sharp fangs. It may make the target flinch.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove038Bite();
	}
}