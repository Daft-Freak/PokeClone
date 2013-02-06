package org.tilegames.pokeclone.pokemon;

import org.tilegames.hexicube.pokeclone.pokemonmoves.PokemonMove;

public class PokemonMonster014Kakuna extends PokemonMonsterBase
{
	public PokemonMonster014Kakuna()
	{
		super(14);
	}
	@Override
	public String name()
	{
		return "Kakuna";
	}
	@Override
	public int health()
	{
		return 40;
	}
	@Override
	public int attack()
	{
		return 35;
	}
	@Override
	public int defence()
	{
		return 30;
	}
	@Override
	public int specialAttack()
	{
		return 20;
	}
	@Override
	public int specialDefence()
	{
		return 20;
	}
	@Override
	public int speed()
	{
		return 50;
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
		return 2;
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
		return 39;
	}
	@Override
	public int captureRate()
	{
		return 120;
	}
	@Override
	public PokemonMonsterType primaryType()
	{
		return PokemonMonsterType.bug;
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
		return 10;
	}
	@Override
	public PokemonMonsterBase evolveSpecies()
	{
		return new PokemonMonster015Beedrill();
	}
	
	private static final PokemonMonsterLearnableMove[] moves = new PokemonMonsterLearnableMove[]{
		new PokemonMonsterLearnableMove(PokemonMove.moveList[50], 7)
	};
}