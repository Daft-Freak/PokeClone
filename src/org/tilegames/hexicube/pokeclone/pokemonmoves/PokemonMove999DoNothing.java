package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove999DoNothing extends PokemonMove {
	public PokemonMove999DoNothing() {
		super(999);
	}
	@Override
	public String getName() {
		return null;
	}
	@Override
	public PokemonMonsterType getDamageType() {
		return null;
	}
	@Override
	public PokemonMoveType getMoveType() {
		return null;
	}
	@Override
	public int movePower() {
		return 0;
	}
	@Override
	public int moveAccuracy() {
		return 0;
	}
	@Override
	public int moveMaxUses() {
		return 0;
	}
	@Override
	public boolean moveDamaging() {
		return false;
	}
	@Override
	public int getMovePriority(){
		return 0;
	}
	@Override
	public boolean highCrit() {
		return false;
	}
	@Override
	public int performMove(PokemonMonster source, PokemonMonster target,
			int repeatCount, boolean wentFirst, PokemonMove opponentMove) {
		return 0;
	}
	@Override
	public String info() {
		return null;
	}
	@Override
	public PokemonMove copy() {
		return new PokemonMove999DoNothing();
	}
}