package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterMajorAilment;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove052StunSpore extends PokemonMove
{
	public PokemonMove052StunSpore()
	{
		super(52);
	}
	@Override
	public String getName()
	{
		return "Stun Spore";
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
		return 75;
	}
	@Override
	public int moveMaxUses()
	{
		return 30;
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
		if(target.majorAilment != null || target.safeguard > 0)
		{
			int abc = 0; //TODO: tell trainers useless
			return 0;
		}
		target.majorAilment = PokemonMonsterMajorAilment.paralyze;
		int abc = 0; //TODO: tell trainers paralysed
		return 0;
	}
	@Override
	public String info()
	{
		return "The user scatters a big cloud of sleep-inducing dust around the foe.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove052StunSpore();
	}
}