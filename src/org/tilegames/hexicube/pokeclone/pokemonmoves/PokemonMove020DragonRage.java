package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;

public class PokemonMove020DragonRage extends PokemonMove
{
	public PokemonMove020DragonRage()
	{
		super(20);
	}
	@Override
	public String getName()
	{
		return "Dragon Rage";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.dragon;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.special;
	}
	@Override
	public int movePower()
	{
		return 1;
	}
	@Override
	public int moveAccuracy()
	{
		return 100;
	}
	@Override
	public int moveMaxUses()
	{
		return 10;
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
			int repeatCount, boolean wentFirst, PokemonMove opponentMove,
			PokemonBattle battle) {
		target.currentHealth -= 40;
		battle.tellTrainers(target.nickname+" took 40 damage!");
		if(target.curHealth() == 0) battle.tellTrainers(target.nickname+" fainted!");
		return 40;
	}
	@Override
	public String info()
	{
		return "This attack hits the target with a shock wave of pure rage. This attack always inflicts 40 HP damage.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove020DragonRage();
	}
}