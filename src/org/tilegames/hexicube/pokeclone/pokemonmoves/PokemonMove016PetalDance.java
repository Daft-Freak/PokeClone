package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;

public class PokemonMove016PetalDance extends PokemonMoveGenericAttack
{
	public PokemonMove016PetalDance()
	{
		super(16);
	}
	@Override
	public String getName()
	{
		return "Petal Dance";
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
		return 90;
	}
	@Override
	public int moveAccuracy()
	{
		return 100;
	}
	@Override
	public int moveMaxUses()
	{
		return 60;
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
			int repeatCount, boolean wentFirst, PokemonMove opponentMove,
			PokemonBattle battle) {
		int amount = super.performMove(source, target, repeatCount, wentFirst, opponentMove, battle);
		if(repeatCount == 3 && source.majorAilment == null && target.safeguard <= 0)
		{
			battle.tellTrainers(source.nickname+" became confused!");
			source.confused = true;
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
		return "The user attacks by scattering petals for three turns. The user then becomes confused.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove016PetalDance();
	}
}