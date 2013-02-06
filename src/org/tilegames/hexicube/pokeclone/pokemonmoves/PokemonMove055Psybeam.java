package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.hexicube.pokeclone.main.Game;
import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove055Psybeam extends PokemonMoveGenericAttack
{
	public PokemonMove055Psybeam()
	{
		super(55);
	}
	@Override
	public String getName()
	{
		return "Psybeam";
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
		return 65;
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
		int amount = super.performMove(source, target, repeatCount, wentFirst, opponentMove);
		if(amount > 0 && target.curHealth() > 0 && !target.confused && target.safeguard <= 0 && Game.rand.nextInt(10) == 0)
		{
			target.confused = true;
			int abc = 0; //TODO: tell trainers confused
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
		return "The target is attacked with a peculiar ray. It may also cause confusion.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove055Psybeam();
	}
}