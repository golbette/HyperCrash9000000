package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HyperCrash extends ApplicationAdapter {
	SpriteBatch batch;
	Texture roadImg;
	Texture skyImg;
	Texture roadLines;
	gameEntity player;
	EnemyCar enemyTest;
	ArrayList<gameEntity> enemies = new ArrayList<gameEntity>();
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		roadImg = new Texture("bg.png");
		skyImg = new Texture("sky.png");
		Texture playerImg = new Texture("car_00.png");
		Texture enemyImg = new Texture("car_01.png");
		player =  new gameEntity(playerImg, 400, 10, 1);
		enemyTest = new EnemyCar(enemyImg, 400, 480, .01f);
		
	}

	@Override
	public void render (){
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		handleInput();
		batch.begin();
		batch.draw(roadImg, 0, 0, 800, 600);
		batch.draw(skyImg, 1, 0, 800, 600);
		player.draw(batch);
		enemyTest.move(player);
		enemyTest.draw(batch);
		batch.end();
	}
	
	public void handleInput()
	{
		if (Gdx.input.isKeyPressed(Input.Keys.A))
		{
			player.x -= 5;
			player.hitbox.setX(player.x);
		}
		else if (Gdx.input.isKeyPressed(Input.Keys.D))
		{
			player.x += 5;
			player.hitbox.setX(player.x);
		}
	}
	
	public void update_enemies()
	{
		
	}
	
	public void spawn_enemies()
	{
		
	}
}
