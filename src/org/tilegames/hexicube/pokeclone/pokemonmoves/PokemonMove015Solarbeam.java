package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;

public class PokemonMove015Solarbeam extends PokemonMoveGenericAttack
{
	public PokemonMove015Solarbeam()
	{
		super(15);
	}
	@Override
	public String getName()
	{
		return "Solarbeam";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.grass;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.special;
	}
	@Override
	public int movePower()
	{
		return 120;
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
	public boolean highCrit()
	{
		return false;
	}
	@Override
	public int performMove(PokemonMonster source, PokemonMonster target,
			int repeatCount, boolean wentFirst, PokemonMove opponentMove) {
		if(repeatCount == 1)
		{
			int abc = 0; //TODO: tell trainers storing energy
			return 0;
		}
		else return super.performMove(source, target, repeatCount, wentFirst, opponentMove);
	}
	@Override
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String info()
	{
		return "A two-turn attack. The user gathers light, then blasts a bundled beam on the second turn.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove015Solarbeam();
	}
}