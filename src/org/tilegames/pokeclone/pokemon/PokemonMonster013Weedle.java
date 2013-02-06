package org.tilegames.pokeclone.pokemon;

import org.tilegames.hexicube.pokeclone.pokemonmoves.PokemonMove;

public class PokemonMonster013Weedle extends PokemonMonsterBase
{
	public PokemonMonster013Weedle()
	{
		super(13);
	}
	@Override
	public String name()
	{
		return "Weedle";
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
		return 39;
	}
	@Override
	public int captureRate()
	{
		return 255;
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
		return 7;
	}
	@Override
	public PokemonMonsterBase evolveSpecies()
	{
		return new PokemonMonster014Kakuna();
	}
	
	private static final PokemonMonsterLearnableMove[] moves = new PokemonMonsterLearnableMove[]{
		new PokemonMonsterLearnableMove(PokemonMove.moveList[60], 1),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[48], 1),
		new PokemonMonsterLearnableMove(PokemonMove.moveList[49], 15)
	};
}