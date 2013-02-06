package org.tilegames.pokeclone.pokemon;

import org.tilegames.hexicube.pokeclone.pokemonmoves.PokemonMove;

public class PokemonMonster004Charmander extends PokemonMonsterBase
{
	public PokemonMonster004Charmander()
	{
		super(4);
	}
	@Override
	public String name()
	{
		return "Charmander";
	}
	@Override
	public int health()
	{
		return 39;
	}
	@Override
	public int attack()
	{
		return 52;
	}
	@Override
	public int defence()
	{
		return 43;
	}
	@Override
	public int specialAttack()
	{
		return 60;
	}
	@Override
	public int specialDefence()
	{
		return 60;
	}
	@Override
	public int speed()
	{
		return 65;
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
		return 0;
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
		return 62;
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
		return 16;
	}
	@Override
	public PokemonMonsterBase evolveSpecies()
	{
		return PokemonMonsterBase.pokemonList[5];
	}

	private static final PokemonMonsterLearnableMove[] moves = new PokemonMonsterLearnableMove[]{
		new PokemonMonsterLearnableMove(PokemonMove.moveList[17], 1),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[2], 1),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[18], 3),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[19], 10),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[20], 16),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[21], 19),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[22], 25),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[23], 28),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[24], 34),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[25], 37),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[26], 43),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[27], 46)
	};
}