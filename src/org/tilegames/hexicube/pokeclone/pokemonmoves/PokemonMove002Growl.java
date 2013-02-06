package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove002Growl extends PokemonMove
{
	public PokemonMove002Growl() {
		super(2);
	}
	@Override
	public String getName() {
		return "Growl";
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
			int repeatCount, boolean wentFirst, PokemonMove opponentMove) {
		target.statMod(0, -1, true, false);
		return 0;
	}
	@Override
	public String info() {
		return "The user growls in an endearing way, making the foe less wary. The target's Attack stat is lowered.";
	}
	@Override
	public PokemonMove copy() {
		return new PokemonMove002Growl();
	}
}