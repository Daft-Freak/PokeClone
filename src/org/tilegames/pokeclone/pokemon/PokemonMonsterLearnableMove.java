package org.tilegames.pokeclone.pokemon;

import org.tilegames.hexicube.pokeclone.pokemonmoves.PokemonMove;

public class PokemonMonsterLearnableMove
{
	public PokemonMove move;
	public int level;
	
	public PokemonMonsterLearnableMove(PokemonMove move, int level)
	{
		this.move = move;
		this.level = level;
	}
}