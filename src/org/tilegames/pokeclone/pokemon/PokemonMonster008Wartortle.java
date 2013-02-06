package org.tilegames.pokeclone.pokemon;

import org.tilegames.hexicube.pokeclone.pokemonmoves.PokemonMove;

public class PokemonMonster008Wartortle extends PokemonMonsterBase
{
	public PokemonMonster008Wartortle()
	{
		super(8);
	}
	@Override
	public String name()
	{
		return "Wartortle";
	}
	@Override
	public int health()
	{
		return 59;
	}
	@Override
	public int attack()
	{
		return 63;
	}
	@Override
	public int defence()
	{
		return 80;
	}
	@Override
	public int specialAttack()
	{
		return 65;
	}
	@Override
	public int specialDefence()
	{
		return 80;
	}
	@Override
	public int speed()
	{
		return 58;
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
		return 36;
	}
	@Override
	public PokemonMonsterBase evolveSpecies()
	{
		return PokemonMonsterBase.pokemonList[9];
	}
	
	private static final PokemonMonsterLearnableMove[] moves = new PokemonMonsterLearnableMove[]{
		new PokemonMonsterLearnableMove(PokemonMove.moveList[1], 1),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[34], 4),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[35], 7),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[36], 10),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[37], 13),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[38], 16),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[39], 20),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[40], 24),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[41], 28),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[42], 32),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[43], 36),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[44], 40),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[45], 44),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[46], 48)
	};
}