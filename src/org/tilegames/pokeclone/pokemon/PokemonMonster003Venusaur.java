package org.tilegames.pokeclone.pokemon;

import org.tilegames.hexicube.pokeclone.pokemonmoves.PokemonMove;

public class PokemonMonster003Venusaur extends PokemonMonsterBase
{
	public PokemonMonster003Venusaur()
	{
		super(3);
	}
	@Override
	public String name()
	{
		return "Venusaur";
	}
	@Override
	public int health()
	{
		return 80;
	}
	@Override
	public int attack()
	{
		return 82;
	}
	@Override
	public int defence()
	{
		return 83;
	}
	@Override
	public int specialAttack()
	{
		return 100;
	}
	@Override
	public int specialDefence()
	{
		return 100;
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
		return 236;
	}
	@Override
	public int captureRate()
	{
		return 45;
	}
	@Override
	public PokemonMonsterType primaryType()
	{
		return PokemonMonsterType.grass;
	}
	@Override
	public PokemonMonsterType secondaryType()
	{
		return PokemonMonsterType.poison;
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
		new PokemonMonsterLearnableMove(PokemonMove.moveList[1], 1),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[2], 3),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[3], 7),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[4], 9),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[5], 13),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[6], 13),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[7], 15),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[8], 20),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[9], 23),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[10], 28),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[11], 31),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[16], 33),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[12], 39),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[13], 45),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[15], 53)
	};
}