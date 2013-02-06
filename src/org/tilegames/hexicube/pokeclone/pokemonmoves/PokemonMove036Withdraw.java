package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

import bot.pokemon.PokemonBattle;

public class PokemonMove036Withdraw extends PokemonMove
{
	public PokemonMove036Withdraw() {
		super(36);
	}
	@Override
	public String getName() {
		return "Withdraw";
	}
	@Override
	public PokemonMonsterType getDamageType() {
		return PokemonMonsterType.water;
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
			int repeatCount, boolean wentFirst, PokemonMove opponentMove,
			PokemonBattle battle) {
		source.statMod(1, 1, false, false, battle);
		return 0;
	}
	@Override
	public String info() {
		return "The user withdraws its body into its hard shell, raising its Defense stat.";
	}
	@Override
	public PokemonMove copy() {
		return new PokemonMove036Withdraw();
	}
}