package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.hexicube.pokeclone.main.Game;
import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterMajorAilment;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove060PoisonSting extends PokemonMoveGenericAttack
{
	public PokemonMove060PoisonSting()
	{
		super(60);
	}
	@Override
	public String getName()
	{
		return "Poison Sting";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.poison;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.physical;
	}
	@Override
	public int movePower()
	{
		return 15;
	}
	@Override
	public int moveAccuracy()
	{
		return 100;
	}
	@Override
	public int moveMaxUses()
	{
		return 35;
	}
	@Override
	public boolean moveDamaging()
	{
		return true;
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
			int repeatCount, boolean wentFirst, PokemonMove opponentMove)
	{
		int amount = super.performMove(source, target, repeatCount, wentFirst, opponentMove);
		if(amount > 0 && Game.rand.nextInt(10) < 3 && target.majorAilment == null && target.safeguard <= 0)
		{
			target.majorAilment = PokemonMonsterMajorAilment.poison;
			int abc = 0; //TODO: tell trainers poisoned
		}
		return amount;
	}
	@Override
	public String info()
	{
		return "The user stabs the target with a poisonous stinger. This may also poison the target.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove060PoisonSting();
	}
	@Override
	public boolean breakThroughProtect()
	{
		return false;
	}
}