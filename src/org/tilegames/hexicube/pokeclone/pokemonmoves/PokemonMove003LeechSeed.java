package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove003LeechSeed extends PokemonMove
{
	public PokemonMove003LeechSeed()
	{
		super(3);
	}
	@Override
	public String getName()
	{
		return "Leech Seed";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.grass;
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
		return 90;
	}
	@Override
	public int moveMaxUses()
	{
		return 10;
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
			int repeatCount, boolean wentFirst, PokemonMove opponentMove) {
		if(!target.leechSeeded)
		{
			int abc = 0; //TODO: tell trainers seeded
			target.leechSeeded = true;
		}
		else
		{
			int abc = 0; //TODO: tell trainers failed
		}
		return 0;
	}
	@Override
	public String info()
	{
		return "A seed is planted on the foe. It steals some HP from the foe to heal the user on every turn.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove003LeechSeed();
	}
}