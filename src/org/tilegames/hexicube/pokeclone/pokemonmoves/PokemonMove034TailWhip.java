package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove034TailWhip extends PokemonMove
{
	public PokemonMove034TailWhip() {
		super(34);
	}
	@Override
	public String getName() {
		return "Tail Whip";
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
		return 30;
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
		target.statMod(1, -2, true, false);
		return 0;
	}
	@Override
	public String info() {
		return "The user wags its tail cutely, making opposing Pokémon less wary and lowering their Defense stat.";
	}
	@Override
	public PokemonMove copy() {
		return new PokemonMove034TailWhip();
	}
}