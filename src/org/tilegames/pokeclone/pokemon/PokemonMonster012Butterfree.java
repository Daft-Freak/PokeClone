package org.tilegames.pokeclone.pokemon;

import org.tilegames.hexicube.pokeclone.pokemonmoves.PokemonMove;

public class PokemonMonster012Butterfree extends PokemonMonsterBase
{
	public PokemonMonster012Butterfree()
	{
		super(12);
	}
	@Override
	public String name()
	{
		return "Butterfree";
	}
	@Override
	public int health()
	{
		return 60;
	}
	@Override
	public int attack()
	{
		return 45;
	}
	@Override
	public int defence()
	{
		return 50;
	}
	@Override
	public int specialAttack()
	{
		return 80;
	}
	@Override
	public int specialDefence()
	{
		return 80;
	}
	@Override
	public int speed()
	{
		return 70;
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
		return 2;
	}
	@Override
	public int specialDefenceEVGain()
	{
		return 1;
	}
	@Override
	public int speedEVGain()
	{
		return 0;
	}
	@Override
	public int expGain()
	{
		return 173;
	}
	@Override
	public int captureRate()
	{
		return 45;
	}
	@Override
	public PokemonMonsterType primaryType()
	{
		return PokemonMonsterType.bug;
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
		new PokemonMonsterLearnableMove(PokemonMove.moveList[51], 11),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[5], 12),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[52], 12),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[6], 12),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[53], 16),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[54], 18),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[55], 24),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[56], 28),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[57], 36),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[58], 42),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[59], 46)
	};
}