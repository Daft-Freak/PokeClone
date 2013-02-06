package org.tilegames.hexicube.pokeclone.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

import com.badlogic.gdx.InputProcessor;

public class Game implements ApplicationListener, InputProcessor
{
	public static Random rand;
	
	@Override
	public void create()
	{
	}
	
	@Override
	public void dispose()
	{
	}
	
	@Override
	public void pause()
	{
	}
	
	@Override
	public void render()
	{
	}
	
	@Override
	public void resize(int width, int height)
	{
	}
	
	@Override
	public void resume()
	{
	}
	
	@Override
	public boolean keyDown(int key)
	{
		return false;
	}
	
	@Override
	public boolean keyTyped(char character)
	{
		return false;
	}

	@Override
	public boolean keyUp(int key)
	{
		return false;
	}

	@Override
	public boolean touchUp(int x, int y, int poniter, int button)
	{
		return false;
	}

	@Override
	public boolean touchDown(int x, int y, int poniter, int button)
	{
		return false;
	}

	@Override
	public boolean touchDragged(int x, int y, int pointer)
	{
		return false;
	}
	
	@Override
	public boolean touchMoved(int x, int y)
	{
		return false;
	}
	
	@Override
	public boolean scrolled(int amount)
	{
		return false;
	}
	
	public static Texture loadImage(String name)
	{
		return new Texture(Gdx.files.internal("images" + File.separator + name + ".png"));
	}
	
	public static Sound loadSound(String name)
	{
		return Gdx.audio.newSound(Gdx.files.internal("sounds" + File.separator + name + ".mp3"));
	}
	
	public static Music loadMusic(String name)
	{
		return Gdx.audio.newMusic(Gdx.files.internal("sounds" + File.separator + name + ".mp3"));
	}
	
	public static BufferedReader loadTextFile(String name, String folder)
	{
		return getFileReader(loadFile(name, folder));
	}
	
	public static File loadFile(String name, String folder)
	{
		File f = new File(folder+File.separator+name);
		if(!f.exists())
		{
			System.out.println(folder+File.separator+name+" doesn't exist, creating...");
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return f;
	}
	
	public static BufferedReader getFileReader(File f)
	{
		try {
			return new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}