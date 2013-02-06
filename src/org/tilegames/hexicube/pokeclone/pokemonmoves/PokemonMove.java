package org.tilegames.hexicube.pokeclone.pokemonmoves;

import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterType;

public abstract class PokemonMove
{
	public PokemonMove(int ID)
	{
		this.ID = ID;
		this.uses = moveMaxUses();
	}
	
	private int ID;
	
	public int uses;
	
	public int getID()
	{
		return ID;
	}
	
	public abstract String getName();
	
	public abstract PokemonMonsterType getDamageType();
	public abstract PokemonMoveType getMoveType();
	public abstract int movePower();
	public abstract int moveAccuracy();
	public abstract int moveMaxUses();
	public abstract boolean moveDamaging();
	public abstract int getMovePriority();
	public abstract boolean highCrit();
	public abstract int performMove(PokemonMonster source, PokemonMonster target,
			int repeatCount, boolean wentFirst, PokemonMove opponentMove);
	public abstract String info();
	public abstract PokemonMove copy();
	
	public static final PokemonMove[] moveList = new PokemonMove[]{
		null,
		new PokemonMove001Tackle(),
		new PokemonMove002Growl(),
		new PokemonMove003LeechSeed(),
		new PokemonMove004VineWhip(),
		new PokemonMove005Poisonpowder(),
		new PokemonMove006SleepPowder(),
		new PokemonMove007TakeDown(),
		new PokemonMove008RazorLeaf(),
		new PokemonMove009SweetScent(),
		new PokemonMove010Growth(),
		new PokemonMove011DoubleEdge(),
		new PokemonMove012WorrySeed(),
		new PokemonMove013Synthesis(),
		new PokemonMove014SeedBomb(),
		new PokemonMove015Solarbeam(),
		new PokemonMove016PetalDance(),
		new PokemonMove017Scratch(),
		new PokemonMove018Ember(),
		new PokemonMove019SmokeScreen(),
		new PokemonMove020DragonRage(),
		new PokemonMove021ScaryFace(),
		new PokemonMove022FireFang(),
		new PokemonMove023FlameBurst(),
		new PokemonMove024Slash(),
		new PokemonMove025Flamethrower(),
		new PokemonMove026FireSpin(),
		new PokemonMove027Inferno(),
		new PokemonMove028DragonClaw(),
		new PokemonMove029ShadowClaw(),
		new PokemonMove030AirSlash(),
		new PokemonMove031WingAttack(),
		new PokemonMove032HeatWave(),
		new PokemonMove033FlareBlitz(),
		new PokemonMove034TailWhip(),
		new PokemonMove035Bubble(),
		new PokemonMove036Withdraw(),
		new PokemonMove037WaterGun(),
		new PokemonMove038Bite(),
		new PokemonMove039RapidSpin(),
		new PokemonMove040Protect(),
		new PokemonMove041WaterPulse(),
		new PokemonMove042AquaTail(),
		new PokemonMove043SkullBash(),
		new PokemonMove044IronDefence(),
		new PokemonMove045RainDance(),
		new PokemonMove046HydroPump(),
		new PokemonMove047FlashCannon(),
		new PokemonMove048StringShot(),
		new PokemonMove049BugBite(),
		new PokemonMove050Harden(),
		new PokemonMove051Confusion(),
		new PokemonMove052StunSpore(),
		new PokemonMove053Gust(),
		new PokemonMove054Supersonic(),
		new PokemonMove055Psybeam(),
		new PokemonMove056SilverWind(),
		new PokemonMove057Safeguard(),
		new PokemonMove058BugBuzz(),
		new PokemonMove059QuiverDance(),
		new PokemonMove060PoisonSting()
	};
}