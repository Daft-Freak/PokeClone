package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.hexicube.pokeclone.main.Game;
import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterMajorAilment;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove022FireFang extends PokemonMoveGenericAttack
{
	public PokemonMove022FireFang()
	{
		super(22);
	}
	@Override
	public String getName()
	{
		return "Fire Fang";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.fire;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.physical;
	}
	@Override
	public int movePower()
	{
		return 65;
	}
	@Override
	public int moveAccuracy()
	{
		return 95;
	}
	@Override
	public int moveMaxUses()
	{
		return 15;
	}
	@Override
	public int getMovePriority()
	{
		return 0;
	}
	@Override
	public boolean highCrit()
	{
		return false;
	}
	@Override
	public int performMove(PokemonMonster source, PokemonMonster target,
			int repeatCount, boolean wentFirst, PokemonMove opponentMove) {
		int amount = super.performMove(source, target, repeatCount, wentFirst, opponentMove);
		if(amount > 0 && target.curHealth() > 0 && !target.isType(PokemonMonsterType.fire) && target.majorAilment == null && target.safeguard <= 0 && Game.rand.nextInt(10) == 0) //mundane hit check
		{
			target.majorAilment = PokemonMonsterMajorAilment.burn;
			int abc = 0; //TODO: tell trainers burned
		}
		if(Game.rand.nextInt(10) == 0 && wentFirst) target.flinched = true;
		return amount;
	}
	@Override
	public boolean breakThroughProtect()
	{
		return false;
	}
	@Override
	public String info()
	{
		return "The user bites with flame-cloaked fangs. It may also make the foe flinch or sustain a burn.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove022FireFang();
	}
}