package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.hexicube.pokeclone.main.Game;
import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterMajorAilment;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public abstract class PokemonMoveGenericAttack extends PokemonMove
{
	public PokemonMoveGenericAttack(int ID)
	{
		super(ID);
	}
	@Override
	public boolean moveDamaging()
	{
		return true;
	}
	@Override
	public int performMove(PokemonMonster source, PokemonMonster target,
			int repeatCount, boolean wentFirst, PokemonMove opponentMove)
	{
		if(target.protect && !breakThroughProtect())
		{
			int abc = 0; //TODO: tell trainers protect used
			return 0;
		}
		
		int C = source.critMod;
		if(highCrit()) C++;
		boolean crit = false;
		if(C == 0) crit = Game.rand.nextInt(16)==0;
		else if(C == 1) crit = Game.rand.nextInt(8)==0;
		else if(C == 2) crit = Game.rand.nextInt(4)==0;
		else if(C == 3) crit = Game.rand.nextInt(3)==0;
		else if(C > 3) crit = Game.rand.nextInt(2)==0;
		
		double typeEffectiveness = 1;
		typeEffectiveness *= PokemonMonsterType.getEffectiveness(getDamageType(), target.base.primaryType());
		if(target.base.secondaryType() != null) typeEffectiveness *= PokemonMonsterType.getEffectiveness(getDamageType(), target.base.secondaryType());
		
		if(typeEffectiveness == 0)
		{
			int abc = 0; //TODO: tell trainers move useless (types)
			return 0;
		}
		
		int level = source.level;
		int movePower = movePower();
		int offensive = source.attack();
		int offensiveMod = source.attackMod;
		if(getMoveType() == PokemonMoveType.special)
		{
			offensive = source.specialAttack();
			offensiveMod = source.specialAttackMod;
		}
		if(crit && offensiveMod < 0) offensiveMod = 0;
		offensive *= (double)Math.max(2, 2+offensiveMod)/(double)Math.max(2, 2-offensiveMod);
		int defensive = target.defence();
		int defensiveMod = target.defenceMod;
		if(getMoveType() == PokemonMoveType.special)
		{
			defensive = target.specialDefence();
			defensiveMod = target.specialDefenceMod;
		}
		if(crit && defensiveMod > 0) defensiveMod = 0;
		defensive *= (double)Math.max(2, 2+defensiveMod)/(double)Math.max(2, 2-defensiveMod);
		if(crit) offensive *= 2;
		if(source.majorAilment == PokemonMonsterMajorAilment.burn) offensive /= 2; 
		if(source.isType(getDamageType())) offensive *= 1.5;
		int result = (int)Math.floor(Math.floor(Math.floor(2 * level / 5 + 2) * offensive * movePower * typeEffectiveness / defensive) / 50);
		result *= Game.rand.nextInt(16)+85;
		result /= 100;
		result += 2;
		
		target.currentHealth -= result;
		if(typeEffectiveness < 1) int abc = 0; //TODO: tell trainers ineffective
		else if(typeEffectiveness > 2) int abc = 0; //TODO: tell trainers super effective
		else if(typeEffectiveness > 1) int abc = 0; //TODO: tell trainers fairly effective
		if(crit) int abc = 0; //TODO: tell trainers crit
		int abc = 0; //TODO: tell trainers damage
		if(target.curHealth() == 0) int abc = 0; //tell trainers fainted
		
		return result;
	}
	public abstract boolean breakThroughProtect();
}