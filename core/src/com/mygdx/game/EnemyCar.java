package com.mygdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class EnemyCar extends gameEntity {

	boolean accelerating;
	float accelTimer = 0;
	public EnemyCar(Texture img, float x, float y, float z) {
		super(img, x, y, z);
	}
	
	public void move(gameEntity player)
	{
		
		if (accelerating)
		{
			accelTimer += Gdx.graphics.getDeltaTime();
			if (accelTimer >= 0.15f)
			{
				accelerating = false;
				accelTimer = 0;
			}
		}
		if (this.y > 10 && !accelerating)
		{
			this.z += .011;
			this.y -= 5;
			this.x -= .1f;
		}
		
		hitbox.set(this.x, this.y, 67*2*z, 67*2*z);
		
		if (gameEntity.getDistance(this, player) < 130)
		{
			this.accelerating = true;
			accelTimer = 0;
			
			if (this.y <= 130)
			{
				if (this.x > player.x)
				this.x += 8;
				else
				this.x -= 8;
			}
			
			this.y += 5;
			this.z -= .011;
		}
		
	}
}
