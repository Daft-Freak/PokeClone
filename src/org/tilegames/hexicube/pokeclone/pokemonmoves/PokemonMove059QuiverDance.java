package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;

public class PokemonMove059QuiverDance extends PokemonMove
{
	public PokemonMove059QuiverDance() {
		super(59);
	}
	@Override
	public String getName() {
		return "Quiver Dance";
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
		return 0;
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
			int repeatCount, boolean wentFirst, PokemonMove opponentMove,
			PokemonBattle battle) {
		source.statMod(2, 1, false, false, battle);
		source.statMod(3, 1, false, false, battle);
		source.statMod(6, 1, false, false, battle);
		return 0;
	}
	@Override
	public String info() {
		return "The user lightly performs a beautiful, mystic dance. It boosts the user's Sp. Atk, Sp. Def, and Speed stats.";
	}
	@Override
	public PokemonMove copy() {
		return new PokemonMove059QuiverDance();
	}
}