package org.tilegames.pokeclone.pokemon;

import org.tilegames.hexicube.pokeclone.pokemonmoves.PokemonMove;

public class PokemonMonster006Charizard extends PokemonMonsterBase
{
	public PokemonMonster006Charizard()
	{
		super(6);
	}
	@Override
	public String name()
	{
		return "Charizard";
	}
	@Override
	public int health()
	{
		return 78;
	}
	@Override
	public int attack()
	{
		return 84;
	}
	@Override
	public int defence()
	{
		return 78;
	}
	@Override
	public int specialAttack()
	{
		return 109;
	}
	@Override
	public int specialDefence()
	{
		return 85;
	}
	@Override
	public int speed()
	{
		return 100;
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
		return 3;
	}
	@Override
	public int specialDefenceEVGain()
	{
		return 0;
	}
	@Override
	public int speedEVGain()
	{
		return 0;
	}
	@Override
	public int expGain()
	{
		return 240;
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
		return PokemonMonsterType.flying;
	}
	@Override
	public PokemonMonsterLearnableMove[] learnableMoves()
	{
		return moves;
	}
	@Override
	public int evolveLevel()
	{
		return -1;
	}
	@Override
	public PokemonMonsterBase evolveSpecies()
	{
		return null;
	}

	private static final PokemonMonsterLearnableMove[] moves = new PokemonMonsterLearnableMove[]{
		new PokemonMonsterLearnableMove(PokemonMove.moveList[28], 1),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[29], 1),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[30], 1),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[17], 1),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[2], 1),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[18], 7),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[19], 10),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[20], 17),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[21], 21),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[22], 28),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[23], 32),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[31], 37),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[24], 41),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[25], 47),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[26], 56),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[27], 62),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[32], 71),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[33], 77)
	};
}