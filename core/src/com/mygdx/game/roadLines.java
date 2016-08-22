package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class roadLines extends gameEntity {
	float startY;
	public roadLines(Texture img, float x, float y, float z) {
		super(img, x, y, z);
		startY = y;
		// TODO Auto-generated constructor stub
	}

	public void draw(SpriteBatch batch, roadLines other)
	{
		//also updates logically
		y-=img.getHeight() / 40;
		if (y < img.getHeight()*-2)
		y = other.y + 725;
		batch.draw(img, x, y, img.getWidth(), img.getHeight()*2);
	}

}
