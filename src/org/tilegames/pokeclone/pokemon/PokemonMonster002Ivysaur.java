package org.tilegames.pokeclone.pokemon;

import org.tilegames.hexicube.pokeclone.pokemonmoves.PokemonMove;

public class PokemonMonster002Ivysaur extends PokemonMonsterBase
{
	public PokemonMonster002Ivysaur()
	{
		super(2);
	}
	@Override
	public String name()
	{
		return "Ivysaur";
	}
	@Override
	public int health()
	{
		return 60;
	}
	@Override
	public int attack()
	{
		return 62;
	}
	@Override
	public int defence()
	{
		return 63;
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
		return 60;
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
		return 32;
	}
	@Override
	public PokemonMonsterBase evolveSpecies()
	{
		return PokemonMonsterBase.pokemonList[3];
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
		new PokemonMonsterLearnableMove(PokemonMove.moveList[12], 36),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[13], 39),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[15], 44)
	};
}