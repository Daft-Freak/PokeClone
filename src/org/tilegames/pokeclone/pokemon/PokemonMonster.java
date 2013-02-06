package org.tilegames.pokeclone.pokemon;

import java.util.ArrayList;

import org.tilegames.hexicube.pokeclone.main.Game;
import org.tilegames.hexicube.pokeclone.main.PokemonTrainer;
import org.tilegames.hexicube.pokeclone.pokemonmoves.PokemonMove;


public class PokemonMonster
{
	public PokemonMonsterBase base;
	
	public String nickname;
	
	public int healthIV, attackIV, defenceIV, specialAttackIV, specialDefenceIV, speedIV,
			   healthEV, attackEV, defenceEV, specialAttackEV, specialDefenceEV, speedEV,
			   attackMod, defenceMod, specialAttackMod, specialDefenceMod, accuracyMod, evasionMod, speedMod, critMod,
			   level, experience, currentHealth;
	
	public PokemonMonsterMajorAilment majorAilment;
	public int majorAilmentHelperValue;
	
	public boolean leechSeeded, worrySeeded, confused, flinched, protect; //list of minor ailments
	public int fireSpinTimer, safeguard;
	
	public ArrayList<PokemonMove> movesToLearn;
	
	public PokemonMove move1, move2, move3, move4;
	
	public PokemonMonster(PokemonMonsterBase base, int level)
	{
		this.base = base;
		this.level = level;
		this.nickname = base.name();
		currentHealth = maxHealth();
		healthIV = Game.rand.nextInt(32);
		attackIV = Game.rand.nextInt(32);
		defenceIV = Game.rand.nextInt(32);
		specialAttackIV = Game.rand.nextInt(32);
		specialDefenceIV = Game.rand.nextInt(32);
		speedIV = Game.rand.nextInt(32);
		healthEV = attackEV = defenceEV = specialAttackEV = specialDefenceEV = speedEV = level / 10;
		
		movesToLearn = new ArrayList<PokemonMove>();
	}
	
	public int maxHealth()
	{
		return (int)Math.floor((double)(2*base.health()+4*healthIV+healthEV)*(double)level/100+level+10);
	}
	public int curHealth()
	{
		if(currentHealth > maxHealth()) return maxHealth();
		if(currentHealth < 0) return 0;
		return currentHealth;
	}
	public int attack()
	{
		return (int)Math.floor((double)(2*base.attack()+4*attackIV+attackEV)*(double)level/100+5);
	}
	public int defence()
	{
		return (int)Math.floor((double)(2*base.defence()+4*defenceIV+defenceEV)*(double)level/100+5);
	}
	public int specialAttack()
	{
		return (int)Math.floor((double)(2*base.specialAttack()+4*specialAttackIV+specialAttackEV)*(double)level/100+5);
	}
	public int specialDefence()
	{
		return (int)Math.floor((double)(2*base.specialDefence()+4*specialDefenceIV+specialDefenceEV)*(double)level/100+5);
	}
	public int speed()
	{
		return (int)Math.floor((double)(2*base.speed()+4*speedIV+speedEV)*(double)level/100+5);
	}
	
	
	public void populateMoves()
	{
		PokemonMonsterLearnableMove[] moveList = base.learnableMoves();
		for(int a = 0; a < moveList.length; a++)
		{
			if(moveList[a].level > 0 && moveList[a].level <= level)
			{
				int slot = getEmptyMoveSlot();
				if(slot == 0)
				{
					if(Game.rand.nextInt(3) == 0)
					{
						int randSlot = Game.rand.nextInt(4);
						if(randSlot == 0) move1 = moveList[a].move;
						else if(randSlot == 1) move2 = moveList[a].move;
						else if(randSlot == 2) move3 = moveList[a].move;
						else if(randSlot == 3) move4 = moveList[a].move;
					}
				}
				else if(slot == 1) move1 = moveList[a].move;
				else if(slot == 2) move2 = moveList[a].move;
				else if(slot == 3) move3 = moveList[a].move;
				else if(slot == 4) move4 = moveList[a].move;
			}
		}
	}
	public int getEmptyMoveSlot()
	{
		if(move1 == null) return 1;
		if(move2 == null) return 2;
		if(move3 == null) return 3;
		if(move4 == null) return 4;
		return 0;
	}
	public void statMod(int modID, int amount, boolean fromOther, boolean silentFail)
	{
		if(modID == 0) //attack
		{
			if(amount < 0)
			{
				if(attackMod > -6)
				{
					attackMod += amount;
					if(attackMod < -6) attackMod = -6;
					int abc = 0; //TODO: tell trainers atk mod down
				}
				else if(!silentFail)
				{
					int abc = 0; //TODO: tell trainers atk mod cant go down
				}
			}
			else
			{
				if(attackMod < 6)
				{
					attackMod += amount;
					if(attackMod > 6) attackMod = 6;
					int abc = 0; //TODO: tell trainers atk mod up
				}
				else if(!silentFail)
				{
					int abc = 0; //TODO: tell trainers atk mod cant go up
				}
			}
		}
		else if(modID == 1) //defence
		{
			if(amount < 0)
			{
				if(defenceMod > -6)
				{
					defenceMod += amount;
					if(defenceMod < -6) defenceMod = -6;
					int abc = 0; //TODO: tell trainers def mod down
				}
				else if(!silentFail)
				{
					int abc = 0; //TODO: tell trainers def mod cant go down
				}
			}
			else
			{
				if(defenceMod < 6)
				{
					defenceMod += amount;
					if(defenceMod > 6) defenceMod = 6;
					int abc = 0; //TODO: tell trainers def mod up
				}
				else if(!silentFail)
				{
					int abc = 0; //TODO: tell trainers def mod cant go up
				}
			}
		}
		else if(modID == 2) //SPatk
		{
			if(amount < 0)
			{
				if(specialAttackMod > -6)
				{
					specialAttackMod += amount;
					if(specialAttackMod < -6) specialAttackMod = -6;
					int abc = 0; //TODO: tell trainers spatk mod down
				}
				else if(!silentFail)
				{
					int abc = 0; //TODO: tell trainers spatk mod cant go down
				}
			}
			else
			{
				if(specialAttackMod < 6)
				{
					specialAttackMod += amount;
					if(specialAttackMod > 6) specialAttackMod = 6;
					int abc = 0; //TODO: tell trainers spatk mod up
				}
				else if(!silentFail)
				{
					int abc = 0; //TODO: tell trainers spatk mod cant go up
				}
			}
		}
		else if(modID == 3) //SPdef
		{
			if(amount < 0)
			{
				if(specialDefenceMod > -6)
				{
					specialDefenceMod += amount;
					if(specialDefenceMod < -6) specialDefenceMod = -6;
					int abc = 0; //TODO: tell trainers spdef mod down
				}
				else if(!silentFail)
				{
					int abc = 0; //TODO: tell trainers spdef mod cant go down
				}
			}
			else
			{
				if(specialDefenceMod < 6)
				{
					specialDefenceMod += amount;
					if(specialDefenceMod > 6) specialDefenceMod = 6;
					int abc = 0; //TODO: tell trainers spdef mod up
				}
				else if(!silentFail)
				{
					int abc = 0; //TODO: tell trainers spdef cant go up
				}
			}
		}
		else if(modID == 4) //accuracy
		{
			if(amount < 0)
			{
				if(accuracyMod > -6)
				{
					accuracyMod += amount;
					if(accuracyMod < -6) accuracyMod = -6;
					int abc = 0; //TODO: tell trainers acc mod down
				}
				else if(!silentFail)
				{
					int abc = 0; //TODO: tell trainers acc mod cant go down
				}
			}
			else
			{
				if(accuracyMod < 6)
				{
					accuracyMod += amount;
					if(accuracyMod > 6) accuracyMod = 6;
					int abc = 0; //TODO: tell trainers acc mod up
				}
				else if(!silentFail)
				{
					int abc = 0; //TODO: tell trainers acc mod cant go up
				}
			}
		}
		else if(modID == 5) //evasiveness
		{
			if(amount < 0)
			{
				if(evasionMod > -6)
				{
					evasionMod += amount;
					if(evasionMod < -6) evasionMod = -6;
					int abc = 0; //TODO: tell trainers eva mod down
				}
				else if(!silentFail)
				{
					int abc = 0; //TODO: tell trainers eva mod cant go down
				}
			}
			else
			{
				if(evasionMod < 6)
				{
					evasionMod += amount;
					if(evasionMod > 6) evasionMod = 6;
					int abc = 0; //TODO: tell trainers eva mod up
				}
				else if(!silentFail)
				{
					int abc = 0; //TODO: tell trainers eva mod cant go up
				}
			}
		}
		else if(modID == 6) //speed
		{
			if(amount < 0)
			{
				if(speedMod > -6)
				{
					speedMod += amount;
					if(speedMod < -6) speedMod = -6;
					int abc = 0; //TODO: tell trainers spd mod down
				}
				else if(!silentFail)
				{
					int abc = 0; //TODO: tell trainers spd mod cant go down
				}
			}
			else
			{
				if(speedMod < 6)
				{
					speedMod += amount;
					if(speedMod > 6) speedMod = 6;
					int abc = 0; //TODO: tell trainers spd mod up
				}
				else if(!silentFail)
				{
					int abc = 0; //TODO: tell trainers spd mod cant go up
				}
			}
		}
		else if(modID == 7) //crit
		{
			if(amount < 0)
			{
				if(critMod > -6)
				{
					critMod += amount;
					if(critMod < -6) critMod = -6;
					int abc = 0; //TODO: tell trainers crit chance down
				}
				else if(!silentFail)
				{
					int abc = 0; //TODO: tell trainers crit chance cant go down
				}
			}
			else
			{
				if(critMod < 6)
				{
					critMod += amount;
					if(critMod > 6) critMod = 6;
					int abc = 0; //TODO: tell trainers crit chance up
				}
				else if(!silentFail)
				{
					int abc = 0; //TODO: tell trainers crit chance cant go up
				}
			}
		}
	}
	public void resetStatMods()
	{
		attackMod = 0;
		defenceMod = 0;
		specialAttackMod = 0;
		specialDefenceMod = 0;
		accuracyMod = 0;
		evasionMod = 0;
		speedMod = 0;
		leechSeeded = false;
		worrySeeded = false;
		confused = false;
		flinched = false;
		protect = false;
		fireSpinTimer = 0;
		safeguard = 0;
	}
	public void resetMoveUses()
	{
		if(move1 != null) move1.uses = move1.moveMaxUses();
		if(move2 != null) move2.uses = move2.moveMaxUses();
		if(move3 != null) move3.uses = move3.moveMaxUses();
		if(move4 != null) move4.uses = move4.moveMaxUses();
	}
	public boolean isType(PokemonMonsterType type)
	{
		if(type == null) return false;
		return (base.primaryType() == type || base.secondaryType() == type);
	}
	public boolean checkMajorAilment(boolean beforeMove, PokemonMonster opponent)
	{
		if(majorAilment == null) return true;
		if(majorAilment == PokemonMonsterMajorAilment.poison)
		{
			if(beforeMove) return true;
			else
			{
				int amount = maxHealth() / 8;
				currentHealth -= amount;
				int abc = 0; //TODO: tell trainers in battle (lose hp and maybe faint)
				return true;
			}
		}
		if(majorAilment == PokemonMonsterMajorAilment.sleep)
		{
			if(beforeMove)
			{
				if(majorAilmentHelperValue <= 0 || worrySeeded)
				{
					int abc = 0; //TODO: tell trainers in battle (woke up)
					majorAilment = null;
					return true;
				}
				else
				{
					int abc = 0; //TODO: tell trainers in battle (still asleep)
					majorAilmentHelperValue--;
					return false;
				}
			}
			else return true;
		}
		if(majorAilment == PokemonMonsterMajorAilment.burn)
		{
			if(beforeMove) return true;
			else
			{
				int amount = maxHealth() / 8;
				currentHealth -= amount;
				int abc = 0; //TODO: tell trainers in battle (lose hp and maybe faint)
				return true;
			}
		}
		if(majorAilment == PokemonMonsterMajorAilment.paralyze)
		{
			if(Game.rand.nextInt(4) == 0)
			{
				int abc = 0; //TODO: tell trainers in battle (no longer paralyzed)
				return false;
			}
			int abc = 0; //TODO: tell trainers in battle (still paralyzed)
			return true;
		}
		int a = 0; //TODO
		return true;
	}
	public boolean checkMinorAilments(boolean beforeMove, PokemonMonster opponent, boolean moveAllowed)
	{
		boolean canMove = true;
		if(beforeMove)
		{
			if(!moveAllowed) return false;
			if(confused)
			{
				int selected = Game.rand.nextInt(4);
				if(selected == 0)
				{
					int abc = 0; //TODO: tell trainers in battle (confused)
					int damage = maxHealth() / 16;
					int abcd = 0; //TODO: tell trainers in battle (hurt self and maybe faint)
					currentHealth -= damage;
					return false;
				}
				else if(selected == 1)
				{
					int abc = 0; //TODO: tell trainers in battle (no longer confused)
					confused = false;
				}
				else
				{
					int abc = 0; //TODO: tell trainers in battle (still confused)
				}
			}
			if(flinched)
			{
				int abc = 0; //TODO: tell trainers in battle (flinched)
				canMove = false;
				flinched = false;
			}
		}
		else
		{
			if(leechSeeded && curHealth() > 0 && opponent.curHealth() > 0)
			{
				int leechAmount = maxHealth() / 16;
				if(leechAmount > curHealth()) leechAmount = curHealth();
				currentHealth -= leechAmount;
				opponent.currentHealth += leechAmount;
				if(opponent.currentHealth > opponent.maxHealth()) opponent.currentHealth = opponent.maxHealth();
				int abc = 0; //TODO: tell trainers in battle (leech seed hp steal and maybe faint)
			}
			if(fireSpinTimer > 0 && curHealth() > 0)
			{
				int amount = maxHealth() / 16;
				currentHealth -= amount;
				int abc = 0; //TODO: tell trainers in battle (fiery vortex lose hp and maybe faint)
			}
			if(protect) protect = false;
		}
		int a = 0; //TODO: add more
		return canMove && curHealth() > 0;
	}
	public void gainExp(int amount, PokemonTrainer owner)
	{
		if(owner == null) return;
		String user = owner.name;
		if(level < 100)
		{
			int abc = 0; //TODO: tell trainer exp gain
			experience += amount;
			int required = level * level * level - (level-1) * (level-1) * (level-1);
			while(experience >= required)
			{
				experience -= required;
				level++;
				int abcd = 0; //TODO: tell trainer level up
				for(int a = 0; a < base.learnableMoves().length; a++)
				{
					PokemonMonsterLearnableMove m = base.learnableMoves()[a];
					if(m.level == level)
					{
						if(move1 == null)
						{
							move1 = m.move.copy();
							move1.uses = move1.moveMaxUses();
							int abcde = 0; //TODO: tell trainer move learned
						}
						else if(move2 == null)
						{
							move2 = m.move.copy();
							move2.uses = move2.moveMaxUses();
							int abcde = 0; //TODO: tell trainer move learned
						}
						else if(move3 == null)
						{
							move3 = m.move.copy();
							move3.uses = move3.moveMaxUses();
							int abcde = 0; //TODO: tell trainer move learned
						}
						else if(move4 == null)
						{
							move4 = m.move.copy();
							move4.uses = move4.moveMaxUses();
							int abcde = 0; //TODO: tell trainer move learned
						}
						else
						{
							movesToLearn.add(m.move);
							int abcde = 0; //TODO: tell trainer move needs learning
							owner.pokemonLearningMove = true;
						}
					}
				}
				if(level == base.evolveLevel())
				{
					int abcde = 0; //TODO: tell trainer evolving
					owner.pokemonEvolving = true;
				}
			}
		}
		else //level 100
		{
			experience = 0;
		}
	}
	public void gainEV(PokemonMonster target)
	{
		int available = 510 - (healthEV + attackEV + defenceEV + specialAttackEV + specialDefenceEV + speedEV);
		if(available <= 0) return;
		
		int gain = target.base.healthEVGain();
		if(gain > available) gain = available;
		if(gain > 255-healthEV) gain = 255-healthEV;
		if(gain > 0) healthEV += gain;
		available -= gain;
		if(available <= 0) return;
		
		gain = target.base.attackEVGain();
		if(gain > available) gain = available;
		if(gain > 255-attackEV) gain = 255-attackEV;
		attackEV += gain;
		available -= gain;
		if(available <= 0) return;
		
		gain = target.base.defenceEVGain();
		if(gain > available) gain = available;
		if(gain > 255-defenceEV) gain = 255-defenceEV;
		defenceEV += gain;
		available -= gain;
		if(available <= 0) return;
		
		gain = target.base.specialAttackEVGain();
		if(gain > available) gain = available;
		if(gain > 255-specialAttackEV) gain = 255-specialAttackEV;
		specialAttackEV += gain;
		available -= gain;
		if(available <= 0) return;
		
		gain = target.base.specialDefenceEVGain();
		if(gain > available) gain = available;
		if(gain > 255-specialDefenceEV) gain = 255-specialDefenceEV;
		specialDefenceEV += gain;
		available -= gain;
		if(available <= 0) return;
		
		gain = target.base.speedEVGain();
		if(gain > available) gain = available;
		if(gain > 255-speedEV) gain = 255-speedEV;
		speedEV += gain;
		available -= gain;
	}
}