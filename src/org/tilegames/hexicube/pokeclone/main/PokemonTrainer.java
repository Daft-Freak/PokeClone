package org.tilegames.hexicube.pokeclone.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.tilegames.hexicube.pokeclone.pokemonmoves.PokemonMove;
import org.tilegames.pokeclone.pokemon.PokemonMonster;
import org.tilegames.pokeclone.pokemon.PokemonMonsterBase;

public class PokemonTrainer
{
	public PokemonTrainer(String name, long pass)
	{
		this.name = name;
		password = pass;
		currentPokemon = new PokemonMonster[6];
		storedPokemon = new PokemonMonster[50];
		inventory = new ArrayList<PokemonItem>();
	}
	
	public String name;
	private long password;
	
	private PokemonMonster[] currentPokemon;
	private PokemonMonster[] storedPokemon;
	public int selectedPokemon;
	public boolean newTrainer, pokemonLearningMove, pokemonEvolving;
	
	public PokemonBattle battle;
	
	public long money;
	
	public ArrayList<PokemonItem> inventory;
	
	public PokemonMonster getSelectedPokemon()
	{
		return getCurrentPokemon(selectedPokemon);
	}
	
	public PokemonMonster getCurrentPokemon(int ID)
	{
		if(ID < 0) return null;
		if(ID >= currentPokemon.length) return null;
		return currentPokemon[ID];
	}
	
	public boolean setCurrentPokemon(int ID, PokemonMonster pokemon)
	{
		if(ID < 0) return false;
		if(ID >= currentPokemon.length) return false;
		currentPokemon[ID] = pokemon;
		return true;
	}
	
	public int getFirstEmptyCurrent()
	{
		for(int a = 0; a < currentPokemon.length; a++)
		{
			if(currentPokemon[a] == null) return a;
		}
		return -1;
	}
	
	public PokemonMonster getStoredPokemon(int ID)
	{
		if(ID < 0) return null;
		if(ID >= storedPokemon.length) return null;
		return storedPokemon[ID];
	}
	
	public boolean setStoredPokemon(int ID, PokemonMonster pokemon)
	{
		if(ID < 0) return false;
		if(ID >= storedPokemon.length) return false;
		storedPokemon[ID] = pokemon;
		return true;
	}
	
	public int getFirstEmptyStored()
	{
		for(int a = 0; a < storedPokemon.length; a++)
		{
			if(storedPokemon[a] == null) return a;
		}
		return -1;
	}
	
	public PokemonMonster getFirstAlivePokemon()
	{
		for(int a = 0; a < currentPokemon.length; a++)
		{
			PokemonMonster p = currentPokemon[a];
			if(p != null)
			{
				if(p.curHealth() > 0) return p;
			}
		}
		return null;
	}
	
	public boolean swapWithStored(int held, int stored)
	{
		PokemonMonster p1 = getCurrentPokemon(held);
		PokemonMonster p2 = getStoredPokemon(stored);
		if(!setCurrentPokemon(held, p2)) return false;
		if(!setStoredPokemon(stored, p1))
		{
			setCurrentPokemon(held, p1);
			return false;
		}
		return true;
	}
	
	public void reviveAll()
	{
		for(int a = 0; a < 6; a++)
		{
			if(currentPokemon[a] != null)
			{
				currentPokemon[a].resetStatMods();
				currentPokemon[a].resetMoveUses();
				currentPokemon[a].currentHealth = currentPokemon[a].maxHealth();
				currentPokemon[a].majorAilment = null;
			}
		}
	}
	
	public long getPassHash()
	{
		return password;
	}
	
	public static PokemonTrainer loadFromFile(String name)
	{
		try
		{
			File f = Game.loadFile(name, "trainers");
			if(!f.exists() || !f.isFile()) return null;
			BufferedReader in = new BufferedReader(new FileReader(f));
			PokemonTrainer trainer = new PokemonTrainer(name, Long.parseLong(in.readLine()));
			trainer.money = Long.parseLong(in.readLine());
			for(int a = 0; a < 56; a++)
			{
				int pokemonID = Integer.parseInt(in.readLine());
				if(pokemonID > 0)
				{
					PokemonMonster pokemon = new PokemonMonster(PokemonMonsterBase.pokemonList[pokemonID], 0);
					pokemon.nickname = in.readLine();
					pokemon.level = Integer.parseInt(in.readLine());
					pokemon.experience = Integer.parseInt(in.readLine());
					pokemon.healthIV = Integer.parseInt(in.readLine());
					pokemon.attackIV = Integer.parseInt(in.readLine());
					pokemon.defenceIV = Integer.parseInt(in.readLine());
					pokemon.specialAttackIV = Integer.parseInt(in.readLine());
					pokemon.specialDefenceIV = Integer.parseInt(in.readLine());
					pokemon.speedIV = Integer.parseInt(in.readLine());
					pokemon.healthEV = Integer.parseInt(in.readLine());
					pokemon.attackEV = Integer.parseInt(in.readLine());
					pokemon.defenceEV = Integer.parseInt(in.readLine());
					pokemon.specialAttackEV = Integer.parseInt(in.readLine());
					pokemon.specialDefenceEV = Integer.parseInt(in.readLine());
					pokemon.speedEV = Integer.parseInt(in.readLine());
					pokemon.currentHealth = Integer.parseInt(in.readLine());
					int moveID = Integer.parseInt(in.readLine());
					if(moveID != 0)
					{
						pokemon.move1 = PokemonMove.moveList[moveID].copy();
						pokemon.move1.uses = Integer.parseInt(in.readLine());
					}
					moveID = Integer.parseInt(in.readLine());
					if(moveID != 0)
					{
						pokemon.move2 = PokemonMove.moveList[moveID].copy();
						pokemon.move2.uses = Integer.parseInt(in.readLine());
					}
					moveID = Integer.parseInt(in.readLine());
					if(moveID != 0)
					{
						pokemon.move3 = PokemonMove.moveList[moveID].copy();
						pokemon.move3.uses = Integer.parseInt(in.readLine());
					}
					moveID = Integer.parseInt(in.readLine());
					if(moveID != 0)
					{
						pokemon.move4 = PokemonMove.moveList[moveID].copy();
						pokemon.move4.uses = Integer.parseInt(in.readLine());
					}
					if(a < 6) trainer.currentPokemon[a] = pokemon;
					else trainer.storedPokemon[a-6] = pokemon;
				}
			}
			trainer.inventory = new ArrayList<PokemonItem>();
			while(in.ready())
			{
				int itemID = Integer.parseInt(in.readLine());
				int itemCount = Integer.parseInt(in.readLine());
				boolean found = false;
				for(int a = 0; a < trainer.inventory.size() && !found; a++)
				{
					if(trainer.inventory.get(a).ID == itemID)
					{
						trainer.inventory.get(a).count += itemCount;
						found = true;
					}
				}
				if(!found) trainer.inventory.add(new PokemonItem(itemID, itemCount));
			}
			in.close();
			return trainer;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	public void writeToFile()
	{
		try
		{
			File f = Game.loadFile(name, "trainers");
			if(f.exists() && f.isFile()) f.delete();
			f.createNewFile();
			PrintWriter out = new PrintWriter(new FileOutputStream(f));
			out.println(String.valueOf(password));
			out.println(String.valueOf(money));
			for(int a = 0; a < 56; a++)
			{
				PokemonMonster pokemon= null;
				if(a < 6) pokemon = currentPokemon[a];
				else pokemon = storedPokemon[a-6];
				if(pokemon == null) out.println("0");
				else
				{
					out.println(String.valueOf(pokemon.base.ID));
					out.println(pokemon.nickname);
					out.println(String.valueOf(pokemon.level));
					out.println(String.valueOf(pokemon.experience));
					out.println(String.valueOf(pokemon.healthIV));
					out.println(String.valueOf(pokemon.attackIV));
					out.println(String.valueOf(pokemon.defenceIV));
					out.println(String.valueOf(pokemon.specialAttackIV));
					out.println(String.valueOf(pokemon.specialDefenceIV));
					out.println(String.valueOf(pokemon.speedIV));
					out.println(String.valueOf(pokemon.healthEV));
					out.println(String.valueOf(pokemon.attackEV));
					out.println(String.valueOf(pokemon.defenceEV));
					out.println(String.valueOf(pokemon.specialAttackEV));
					out.println(String.valueOf(pokemon.specialDefenceEV));
					out.println(String.valueOf(pokemon.speedEV));
					out.println(String.valueOf(pokemon.curHealth()));
					if(pokemon.move1 == null) out.println("0");
					else
					{
						out.println(String.valueOf(pokemon.move1.getID()));
						out.println(String.valueOf(pokemon.move1.uses));
					}
					if(pokemon.move2 == null) out.println("0");
					else
					{
						out.println(String.valueOf(pokemon.move2.getID()));
						out.println(String.valueOf(pokemon.move2.uses));
					}
					if(pokemon.move3 == null) out.println("0");
					else
					{
						out.println(String.valueOf(pokemon.move3.getID()));
						out.println(String.valueOf(pokemon.move3.uses));
					}
					if(pokemon.move4 == null) out.println("0");
					else
					{
						out.println(String.valueOf(pokemon.move4.getID()));
						out.println(String.valueOf(pokemon.move4.uses));
					}
				}
			}
			for(int a = 0; a < inventory.size(); a++)
			{
				out.println(String.valueOf(inventory.get(a).ID));
				out.println(String.valueOf(inventory.get(a).count));
			}
			out.flush();
			out.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}