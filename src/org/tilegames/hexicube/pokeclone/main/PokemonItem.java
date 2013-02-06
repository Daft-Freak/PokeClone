package org.tilegames.hexicube.pokeclone.main;

public class PokemonItem
{
	public int ID, count;
	
	public PokemonItem(int ID, int count)
	{
		this.ID = ID;
		this.count = count;
	}
	
	public static final String[] names = new String[]{
		"No Item (how did you get this?)",
		
		"Poke-Ball",
		"Great-Ball",
		"Ultra-Ball",
		"Master-Ball",
		"Examine-Ball"
	};
	
	public static final String[] useText = new String[]{
		"the lack of an item! (WHAT!?)",
		
		"a Poke-Ball!",
		"a Great Ball!",
		"an Ultra Ball!",
		"a Master Ball!",
		"an Examine Ball!"
	};
	
	public static final long[] itemCost = new long[]{
		0,
		
		1000,
		3500,
		10000,
		200000,
		200
	};
	
	public static final int[] itemTypes = new int[]{
		0,
		
		1,
		1,
		1,
		1,
		1
	};
	
	public static final String[] itemTypeNames = new String[]{
		"No type (how did you get this?)",
		"Poke-Ball",
		"Cures"
	};
}