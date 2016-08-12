package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class gameEntity {
	
	Texture img;
	float x;
	float y;
	float z = 1;
	Rectangle hitbox;

	public gameEntity(Texture img, float x, float y, float z)
	{
		this.img = img;
		this.x = x;
		this.y = y;
		this.z = z;
		hitbox = new Rectangle(x, y, 67*2*z, 39*2*z);
	}
	public void draw(SpriteBatch batch)
	{
		batch.draw(img, x, y, 67*2*z, 39*2*z);
	}
	
	public static float getDistance(gameEntity entity1, gameEntity entity2)
	{
		return (float)Math.sqrt((entity1.x - entity2.x)*(entity1.x - entity2.x) + (entity1.y - entity2.y)*(entity1.y - entity2.y));
	}

}
