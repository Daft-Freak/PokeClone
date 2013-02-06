package org.tilegames.pokeclone.pokemon;

import org.tilegames.hexicube.pokeclone.pokemonmoves.PokemonMove;

public class PokemonMonster005Charmeleon extends PokemonMonsterBase
{
	public PokemonMonster005Charmeleon()
	{
		super(5);
	}
	@Override
	public String name()
	{
		return "Charmeleon";
	}
	@Override
	public int health()
	{
		return 58;
	}
	@Override
	public int attack()
	{
		return 64;
	}
	@Override
	public int defence()
	{
		return 58;
	}
	@Override
	public int specialAttack()
	{
		return 80;
	}
	@Override
	public int specialDefence()
	{
		return 65;
	}
	@Override
	public int speed()
	{
		return 80;
	}
	@Override
	public int healthEVGain()
	{
		return 0;
	}
	@Override
	public int attackEVGain()
	{
		return 0;
	}
	@Override
	public int defenceEVGain()
	{
		return 0;
	}
	@Override
	public int specialAttackEVGain()
	{
		return 1;
	}
	@Override
	public int specialDefenceEVGain()
	{
		return 0;
	}
	@Override
	public int speedEVGain()
	{
		return 1;
	}
	@Override
	public int expGain()
	{
		return 142;
	}
	@Override
	public int captureRate()
	{
		return 45;
	}
	@Override
	public PokemonMonsterType primaryType()
	{
		return PokemonMonsterType.fire;
	}
	@Override
	public PokemonMonsterType secondaryType()
	{
		return null;
	}
	@Override
	public PokemonMonsterLearnableMove[] learnableMoves()
	{
		return moves;
	}
	@Override
	public int evolveLevel()
	{
		return 36;
	}
	@Override
	public PokemonMonsterBase evolveSpecies()
	{
		return PokemonMonsterBase.pokemonList[6];
	}

	private static final PokemonMonsterLearnableMove[] moves = new PokemonMonsterLearnableMove[]{
		new PokemonMonsterLearnableMove(PokemonMove.moveList[17], 1),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[2], 1),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[18], 7),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[19], 10),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[20], 15),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[21], 21),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[22], 28),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[23], 32),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[24], 39),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[25], 43),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[26], 50),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[27], 54)
	};
}