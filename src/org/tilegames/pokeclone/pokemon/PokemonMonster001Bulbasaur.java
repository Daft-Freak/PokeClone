package org.tilegames.pokeclone.pokemon;

import org.tilegames.hexicube.pokeclone.pokemonmoves.PokemonMove;

public class PokemonMonster001Bulbasaur extends PokemonMonsterBase
{
	public PokemonMonster001Bulbasaur()
	{
		super(1);
	}
	@Override
	public String name()
	{
		return "Bulbasaur";
	}
	@Override
	public int health()
	{
		return 45;
	}
	@Override
	public int attack()
	{
		return 49;
	}
	@Override
	public int defence()
	{
		return 49;
	}
	@Override
	public int specialAttack()
	{
		return 65;
	}
	@Override
	public int specialDefence()
	{
		return 65;
	}
	@Override
	public int speed()
	{
		return 45;
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
		return 0;
	}
	@Override
	public int expGain()
	{
		return 64;
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
		return 16;
	}
	@Override
	public PokemonMonsterBase evolveSpecies()
	{
		return PokemonMonsterBase.pokemonList[2];
	}
	
	private static final PokemonMonsterLearnableMove[] moves = new PokemonMonsterLearnableMove[]{
		new PokemonMonsterLearnableMove(PokemonMove.moveList[1], 1),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[2], 3),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[3], 7),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[4], 9),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[5], 13),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[6], 13),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[7], 15),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[8], 19),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[9], 21),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[10], 25),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[11], 27),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[12], 31),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[13], 33),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[14], 37)
	};
}