package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove001Tackle extends PokemonMoveGenericAttack
{
	public PokemonMove001Tackle() {
		super(1);
	}
	@Override
	public String getName() {
		return "Tackle";
	}
	@Override
	public PokemonMonsterType getDamageType() {
		return PokemonMonsterType.normal;
	}
	@Override
	public PokemonMoveType getMoveType() {
		return PokemonMoveType.physical;
	}
	@Override
	public int movePower() {
		return 35;
	}
	@Override
	public int moveAccuracy() {
		return 95;
	}
	@Override
	public int moveMaxUses() {
		return 35;
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
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String info() {
		return "A physical attack in which the user charges and slams into the foe with its whole body.";
	}
	@Override
	public PokemonMove copy() {
		return new PokemonMove001Tackle();
	}
}