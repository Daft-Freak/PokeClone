package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterMajorAilment;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove005Poisonpowder extends PokemonMove
{
	public PokemonMove005Poisonpowder()
	{
		super(5);
	}
	@Override
	public String getName()
	{
		return "Poisonpowder";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.poison;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.other;
	}
	@Override
	public int movePower()
	{
		return 0;
	}
	@Override
	public int moveAccuracy()
	{
		return 75;
	}
	@Override
	public int moveMaxUses()
	{
		return 35;
	}
	@Override
	public boolean moveDamaging()
	{
		return false;
	}
	@Override
	public int getMovePriority()
	{
		return 0;
	}
	@Override
	public boolean highCrit() {
		return false;
	}
	@Override
	public int performMove(PokemonMonster source, PokemonMonster target,
			int repeatCount, boolean wentFirst, PokemonMove opponentMove)
	{
		if(target.isType(PokemonMonsterType.poison) || target.isType(PokemonMonsterType.steel) || target.majorAilment != null || target.safeguard > 0)
		{
			int abc = 0; //TODO: tell trainers useless
			return 0;
		}
		target.majorAilment = PokemonMonsterMajorAilment.poison;
		int abc = 0; //TODO: tell trainers poisoned
		return 0;
	}
	@Override
	public String info()
	{
		return "A cloud of poisonous dust is scattered on the foe. It may poison the target.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove005Poisonpowder();
	}
}