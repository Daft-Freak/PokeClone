package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.hexicube.pokeclone.main.Game;
import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public class PokemonMove056SilverWind extends PokemonMoveGenericAttack
{
	public PokemonMove056SilverWind()
	{
		super(56);
	}
	@Override
	public String getName()
	{
		return "Silver Wind";
	}
	@Override
	public PokemonMonsterType getDamageType()
	{
		return PokemonMonsterType.bug;
	}
	@Override
	public PokemonMoveType getMoveType()
	{
		return PokemonMoveType.special;
	}
	@Override
	public int movePower()
	{
		return 60;
	}
	@Override
	public int moveAccuracy()
	{
		return 100;
	}
	@Override
	public int moveMaxUses()
	{
		return 5;
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
		if(amount > 0 && source.curHealth() > 0 && Game.rand.nextInt(10) == 4)
		{
			source.statMod(0, 1, false, true);
			source.statMod(1, 1, false, true);
			source.statMod(2, 1, false, true);
			source.statMod(3, 1, false, true);
			source.statMod(4, 1, false, true);
			source.statMod(5, 1, false, true);
			source.statMod(6, 1, false, true);
		}
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
		return "The target is attacked with powdery scales blown by wind. It may also raise all the user's stats.";
	}
	@Override
	public PokemonMove copy()
	{
		return new PokemonMove056SilverWind();
	}
}