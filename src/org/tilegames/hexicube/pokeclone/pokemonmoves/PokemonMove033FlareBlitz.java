package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.hexicube.pokeclone.main.Game;
import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterMajorAilment;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove033FlareBlitz extends PokemonMoveGenericAttack
{
	public PokemonMove033FlareBlitz()
	{
		super(33);
	}
	@Override
	public boolean highCrit() {
		return false;
	}
	@Override
	public int performMove(PokemonMonster source, PokemonMonster target,
			int repeatCount, boolean wentFirst, PokemonMove opponentMove)
	{
		int result = super.performMove(source, target, repeatCount, wentFirst, opponentMove);
		if(result > 0 && target.curHealth() > 0 && !target.isType(PokemonMonsterType.fire) && target.majorAilment == null && target.safeguard <= 0 && Game.rand.nextInt(10) == 0)
		{
			target.majorAilment = PokemonMonsterMajorAilment.burn;
			int abc = 0; //TODO: tell trainers burned
		}
		if(result > 0)
		{
			source.currentHealth -= result/3;
			int abc = 0; //TODO: tell trainers recoil and faint
		}
		return result;
	}
	@Override
	public String getName()
	{
		return "Flare Blitz";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.fire;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.physical;
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
		return 15;
	}
	@Override
	public int getMovePriority()
	{
		return 0;
	}
	@Override
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String info()
	{
		return "The user cloaks itself in Fire and charges at the target. The user sustains serious damage and may leave the target burned.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove033FlareBlitz();
	}
}