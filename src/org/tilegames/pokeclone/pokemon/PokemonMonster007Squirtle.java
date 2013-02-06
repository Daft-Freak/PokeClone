package org.tilegames.pokeclone.pokemon;

import org.tilegames.hexicube.pokeclone.pokemonmoves.PokemonMove;

public class PokemonMonster007Squirtle extends PokemonMonsterBase
{
	public PokemonMonster007Squirtle()
	{
		super(7);
	}
	@Override
	public String name()
	{
		return "Squirtle";
	}
	@Override
	public int health()
	{
		return 44;
	}
	@Override
	public int attack()
	{
		return 48;
	}
	@Override
	public int defence()
	{
		return 65;
	}
	@Override
	public int specialAttack()
	{
		return 50;
	}
	@Override
	public int specialDefence()
	{
		return 64;
	}
	@Override
	public int speed()
	{
		return 43;
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
		return 1;
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
		return 0;
	}
	@Override
	public int expGain()
	{
		return 63;
	}
	@Override
	public int captureRate()
	{
		return 45;
	}
	@Override
	public PokemonMonsterType primaryType()
	{
		return PokemonMonsterType.water;
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
		return PokemonMonsterBase.pokemonList[8];
	}
	
	private static final PokemonMonsterLearnableMove[] moves = new PokemonMonsterLearnableMove[]{
		new PokemonMonsterLearnableMove(PokemonMove.moveList[1], 1),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[34], 4),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[35], 7),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[36], 10),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[37], 13),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[38], 16),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[39], 19),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[40], 22),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[41], 25),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[42], 28),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[43], 31),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[44], 34),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[45], 37),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[46], 40)
	};
}