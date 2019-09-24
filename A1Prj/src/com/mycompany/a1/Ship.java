
package com.mycompany.a1;
//import java.util.Random;

import com.codename1.ui.geom.Point2D;

public abstract class Ship extends MoveableGameObject{
	private int missileCount;
	private int lifeCount;
	
	public Ship() {
		
	}
	
	public Ship(Point2D location, int color, int speed, int direction, int missileCount, int lifeCount) { //constructor
		//super(location, color, speed, direction);
		this.missileCount = missileCount;
		this.lifeCount = lifeCount;
	}
	
	public abstract int getMissileCount();
	
	public int getMissiles() {
		return missileCount;
	}
	
	public abstract void setMissileCount();
		

	public void setMissile(int count) {
		missileCount = count;
	}
	
	
	
	
	public int getLifeCount() {
		return lifeCount;
	}
	
	public void setLifeCount(int lifeCount) {
		this.lifeCount = lifeCount;
	}
	
	//@override
	public int fireMissile(int missileCount) {
		missileCount--;
		return missileCount;
		
	}
	
	
}
