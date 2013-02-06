package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;

public class PokemonMove048StringShot extends PokemonMove
{
	public PokemonMove048StringShot() {
		super(48);
	}
	@Override
	public String getName() {
		return "String Shot";
	}
	@Override
	public PokemonMonsterType getDamageType() {
		return PokemonMonsterType.bug;
	}
	@Override
	public PokemonMoveType getMoveType() {
		return PokemonMoveType.other;
	}
	@Override
	public int movePower() {
		return 0;
	}
	@Override
	public int moveAccuracy() {
		return 95;
	}
	@Override
	public int moveMaxUses() {
		return 40;
	}
	@Override
	public boolean moveDamaging() {
		return false;
	}
	@Override
	public int getMovePriority() {
		return 0;
	}
	@Override
	public boolean highCrit() {
		return false;
	}
	@Override
	public int performMove(PokemonMonster source, PokemonMonster target,
			int repeatCount, boolean wentFirst, PokemonMove opponentMove,
			PokemonBattle battle) {
		target.statMod(6, -1, true, false, battle);
		return 0;
	}
	@Override
	public String info() {
		return "The targets are bound with silk blown from the user's mouth. This silk reduces the targets' Speed stat.";
	}
	@Override
	public PokemonMove copy() {
		return new PokemonMove048StringShot();
	}
}