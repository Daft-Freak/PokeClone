package org.tilegames.pokeclone.pokemon;

public class PokemonMonster015Beedrill extends PokemonMonsterBase
{
	public PokemonMonster015Beedrill()
	{
		super(15);
	}
	@Override
	public String name()
	{
		return "Beedrill";
	}
	@Override
	public int health()
	{
		return 65;
	}
	@Override
	public int attack()
	{
		return 80;
	}
	@Override
	public int defence()
	{
		return 40;
	}
	@Override
	public int specialAttack()
	{
		return 45;
	}
	@Override
	public int specialDefence()
	{
		return 80;
	}
	@Override
	public int speed()
	{
		return 75;
	}
	@Override
	public int healthEVGain()
	{
		return 0;
	}
	@Override
	public int attackEVGain()
	{
		return 2;
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
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, ),
		new PokemonMonsterLearnableMove(, )
	};
}