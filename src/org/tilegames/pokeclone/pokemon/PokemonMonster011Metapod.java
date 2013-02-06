package org.tilegames.pokeclone.pokemon;

import org.tilegames.hexicube.pokeclone.pokemonmoves.PokemonMove;

public class PokemonMonster011Metapod extends PokemonMonsterBase
{
	public PokemonMonster011Metapod()
	{
		super(11);
	}
	@Override
	public String name()
	{
		return "Metapod";
	}
	@Override
	public int health()
	{
		return 45;
	}
	@Override
	public int attack()
	{
		return 30;
	}
	@Override
	public int defence()
	{
		return 35;
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
		return 72;
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
		return 7;
	}
	@Override
	public PokemonMonsterBase evolveSpecies()
	{
		return PokemonMonsterBase.pokemonList[11];
	}
	
	private static final PokemonMonsterLearnableMove[] moves = new PokemonMonsterLearnableMove[]{
		new PokemonMonsterLearnableMove(PokemonMove.moveList[50], 8)
	};
}