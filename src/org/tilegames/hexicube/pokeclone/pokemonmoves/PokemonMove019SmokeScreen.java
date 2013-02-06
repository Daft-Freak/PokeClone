package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove019SmokeScreen extends PokemonMove
{
	public PokemonMove019SmokeScreen() {
		super(19);
	}
	@Override
	public String getName() {
		return "Smoke Screen";
	}
	@Override
	public PokemonMonsterType getDamageType() {
		return PokemonMonsterType.normal;
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
		return 100;
	}
	@Override
	public int moveMaxUses() {
		return 20;
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
			int repeatCount, boolean wentFirst, PokemonMove opponentMove) {
		target.statMod(4, -1, true, false);
		return 0;
	}
	@Override
	public String info() {
		return "The user releases an obscuring cloud of smoke or ink. It reduces the target's accuracy.";
	}
	@Override
	public PokemonMove copy() {
		return new PokemonMove019SmokeScreen();
	}
}