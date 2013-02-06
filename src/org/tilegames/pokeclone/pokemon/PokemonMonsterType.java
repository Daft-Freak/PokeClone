package org.tilegames.pokeclone.pokemon;

public enum PokemonMonsterType
{
	normal, fire, water, electric, grass,
	ice, fighting, poison, ground, flying,
	psychic, bug, rock, ghost, dragon,
	dark, steel;
	
	public static double getEffectiveness(PokemonMonsterType damageType, PokemonMonsterType targetType)
	{
		if(damageType == null) return 0;
		if(targetType == null) return 1;
		if(damageType == normal)
		{
			if(targetType == ghost) return 0;
			else if(targetType == rock || targetType == steel) return 0.5;
			return 1;
		}
		if(damageType == fire)
		{
			if(targetType == fire || targetType == water ||
			   targetType == rock || targetType == dragon)
				return 0.5;
			if(targetType == grass || targetType == ice) return 2;
			return 1;
		}
		if(damageType == water)
		{
			if(targetType == water || targetType == grass ||
			   targetType == dragon) return 0.5;
			if(targetType == fire || targetType == ground ||
			   targetType == rock) return 2;
			return 1;
		}
		if(damageType == electric)
		{
			if(targetType == ground) return 0;
			if(targetType == electric || targetType == grass ||
			   targetType == dragon) return 0.5;
			if(targetType == water || targetType == flying)
				return 2;
			return 1;
		}
		if(damageType == grass)
		{
			if(targetType == fire || targetType == grass ||
			   targetType == poison || targetType == flying ||
			   targetType == bug || targetType == dragon ||
			   targetType == steel) return 0.5;
			if(targetType == water || targetType == ground ||
			   targetType == rock) return 2;
			return 1;
		}
		if(damageType == ice)
		{
			if(targetType == fire || targetType == water ||
			   targetType == ice || targetType == steel)
				return 0.5;
			if(targetType == grass || targetType == ground ||
			   targetType == flying || targetType == dragon)
				return 2;
			return 1;
		}
		if(damageType == fighting)
		{
			if(targetType == ghost) return 0;
			if(targetType == poison || targetType == flying ||
			   targetType == psychic || targetType == bug)
				return 0.5;
			if(targetType == normal || targetType == ice ||
			   targetType == rock || targetType == dragon ||
			   targetType == steel) return 2;
			return 1;
		}
		if(damageType == poison)
		{
			if(targetType == steel) return 0;
			if(targetType == poison || targetType == ground ||
			   targetType == rock || targetType == ghost)
				return 0.5;
			if(targetType == grass) return 2;
			return 1;
		}
		if(damageType == ground)
		{
			if(targetType == flying) return 0;
			if(targetType == grass || targetType == bug)
				return 0.5;
			if(targetType == fire || targetType == electric ||
			   targetType == poison || targetType == rock ||
			   targetType == steel) return 2;
			return 1;
		}
		if(damageType == flying)
		{
			if(targetType == electric || targetType == rock ||
			   targetType == steel) return 0.5;
			if(targetType == grass || targetType == fighting ||
			   targetType == bug) return 2;
			return 1;
		}
		if(damageType == psychic)
		{
			if(targetType == dark) return 0;
			if(targetType == psychic || targetType == steel)
				return 0.5;
			if(targetType == fighting || targetType == poison)
				return 2;
			return 1;
		}
		if(damageType == bug)
		{
			if(targetType == fire || targetType == fighting ||
			   targetType == poison || targetType == flying ||
			   targetType == ghost) return 0.5;
			if(targetType == grass || targetType == psychic ||
			   targetType == dark) return 2;
			return 1;
		}
		if(damageType == rock)
		{
			if(targetType == fighting || targetType == ground ||
			   targetType == steel) return 0.5;
			if(targetType == fire || targetType == ice ||
			   targetType == flying || targetType == bug)
				return 2;
			return 1;
		}
		if(damageType == ghost)
		{
			if(targetType == normal) return 0;
			if(targetType == dark || targetType == steel)
				return 0.5;
			if(targetType == psychic || targetType == ghost)
				return 2;
			return 1;
		}
		if(damageType == dragon)
		{
			if(targetType == steel) return 0.5;
			if(targetType == steel) return 2;
			return 1;
		}
		if(damageType == dark)
		{
			if(targetType == fighting || targetType == dark ||
			   targetType == steel) return 0.5;
			if(targetType == psychic || targetType == ghost)
				return 2;
			return 1;
		}
		if(damageType == steel)
		{
			if(targetType == fire || targetType == water ||
			   targetType == electric || targetType == steel)
				return 0.5;
			if(targetType == ice || targetType == rock)
				return 2;
			return 1;
		}
		System.out.println("FATAL ERROR: Missing damage type!");
		System.exit(0);
		return -1;
	}
}