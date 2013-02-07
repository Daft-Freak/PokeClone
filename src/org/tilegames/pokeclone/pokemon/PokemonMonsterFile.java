package org.tilegames.pokeclone.pokemon;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.tilegames.hexicube.pokeclone.pokemonmoves.PokemonMove;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class PokemonMonsterFile extends PokemonMonsterBase {

  public PokemonMonsterFile(int ID)
	{
		super(ID);
		try
		{
			File file = new File("pokemon" + File.separator + ID + ".xml");
			if(!file.exists())
			{
				System.out.println("No pokemon data for ID " + ID);
				return;
			}
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;
			
				dBuilder = dbFactory.newDocumentBuilder();
	
			Document doc = dBuilder.parse(file);
			
			Element root = doc.getDocumentElement();
			//read
			name = root.getAttribute("name");
			
			health = parseInt(root.getAttribute("health"));
			attack = parseInt(root.getAttribute("attack"));
			defence = parseInt(root.getAttribute("defence"));
			specialAttack = parseInt(root.getAttribute("specialAttack"));
			specialDefence = parseInt(root.getAttribute("specialDefence"));
			speed = parseInt(root.getAttribute("speed"));
			
			attackEVGain = parseInt(root.getAttribute("attackEVGain"));
			defenceEVGain = parseInt(root.getAttribute("defenceEVGain"));
			specialAttackEVGain = parseInt(root.getAttribute("specialAttackEVGain"));
			specialDefenceEVGain = parseInt(root.getAttribute("specialDefenceEVGain"));
			speedEVGain = parseInt(root.getAttribute("speedEVGain"));
			
			expGain = parseInt(root.getAttribute("expGain"));
			
			captureRate = parseInt(root.getAttribute("captureRate"));
			
			evolveLevel = parseInt(root.getAttribute("evolveLevel"));
			evolveSpeciesId = parseInt(root.getAttribute("evolveSpecies"));
			
			primaryType = typeFromString(root.getAttribute("primaryType"));
			secondaryType = typeFromString(root.getAttribute("secondaryType"));
			
			//read moves
			moves = new ArrayList<PokemonMonsterLearnableMove>();
			NodeList moveList = doc.getElementsByTagName("move");
			
			for(int i = 0; i < moveList.getLength(); i++)
			{
				Node n = moveList.item(i);
				if(n.getNodeType() == Node.ELEMENT_NODE)
				{
					Element moveElem = (Element)n;
					int id = parseInt(moveElem.getAttribute("id"));
					int level = parseInt(moveElem.getAttribute("level"));
					try
					{
						moves.add(new PokemonMonsterLearnableMove(PokemonMove.moveList[id], level));
					}
					catch(ArrayIndexOutOfBoundsException e)
					{
						//invalid move index
					}
					
				}
			}
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String name() {
		return name;
	}

	@Override
	public int health() {
		return health;
	}

	@Override
	public int attack() {
		return attack;
	}

	@Override
	public int defence() {
		return defence;
	}

	@Override
	public int specialAttack() {
		return specialAttack;
	}

	@Override
	public int specialDefence() {
		return specialDefence;
	}

	@Override
	public int speed() {
		return speed;
	}

	@Override
	public int healthEVGain() {
		return healthEVGain;
	}

	@Override
	public int attackEVGain() {
		return attackEVGain;
	}

	@Override
	public int defenceEVGain() {
		return defenceEVGain;
	}

	@Override
	public int specialAttackEVGain() {
		return specialAttackEVGain;
	}

	@Override
	public int specialDefenceEVGain() {
		return specialDefenceEVGain;
	}

	@Override
	public int speedEVGain() {
		return speedEVGain;
	}

	@Override
	public int expGain() {
		return expGain;
	}

	@Override
	public int captureRate() {
		return captureRate;
	}

	@Override
	public PokemonMonsterType primaryType() {
		return primaryType;
	}

	@Override
	public PokemonMonsterType secondaryType() {
		return secondaryType;
	}

	@Override
	public PokemonMonsterLearnableMove[] learnableMoves() {
		return (PokemonMonsterLearnableMove[]) moves.toArray();
	}

	@Override
	public int evolveLevel() {
		return evolveLevel;
	}

	@Override
	public PokemonMonsterBase evolveSpecies() {
		return PokemonMonsterBase.pokemonList[evolveSpeciesId];
	}
	
	private int parseInt(String val)
	{
		if(val == "")
			return 0;
		try
		{
			return Integer.parseInt(val);
		}
		catch(NumberFormatException e)
		{
			return 0;
		}
	}
	
	//convert string to type
	private PokemonMonsterType typeFromString(String type)
	{
		type = type.toLowerCase();
		if(type == "normal")
			return PokemonMonsterType.normal;
		else if(type == "fire")
			return PokemonMonsterType.fire;
		else if(type == "water")
			return PokemonMonsterType.water;
		else if(type == "electric")
			return PokemonMonsterType.electric;
		else if(type == "grass")
			return PokemonMonsterType.grass;
		else if(type == "ice")
			return PokemonMonsterType.ice;
		else if(type == "fighting")
			return PokemonMonsterType.fighting;
		else if(type == "poison")
			return PokemonMonsterType.poison;
		else if(type == "ground")
			return PokemonMonsterType.ground;
		else if(type == "flying")
			return PokemonMonsterType.flying;
		else if(type == "psychic")
			return PokemonMonsterType.psychic;
		else if(type == "bug")
			return PokemonMonsterType.bug;
		else if(type == "rock")
			return PokemonMonsterType.rock;
		else if(type == "ghost")
			return PokemonMonsterType.ghost;
		else if(type == "dragon")
			return PokemonMonsterType.dragon;
		else if(type == "dark")
			return PokemonMonsterType.dark;
		else if(type == "steel")
			return PokemonMonsterType.steel;
		
		return null;
	}

	private String name = "";
	private int health = 0, attack = 0, defence = 0, specialAttack = 0, specialDefence = 0, speed = 0;
	private int healthEVGain = 0, attackEVGain = 0, defenceEVGain = 0, specialAttackEVGain = 0, specialDefenceEVGain = 0, speedEVGain = 0;
	private int expGain = 0;
	private int captureRate = 0;
	private int evolveLevel = 0, evolveSpeciesId = 0;
	
	private PokemonMonsterType primaryType, secondaryType;
	
	private List<PokemonMonsterLearnableMove> moves;
}
