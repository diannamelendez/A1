package com.mycompany.a1;

import java.util.Random;

import com.codename1.ui.geom.Point2D;

public abstract class MoveableGameObject extends GameObject implements IMoveable{
	
	private Random r;
	private int speed;
	private int direction;
	
	public MoveableGameObject() {
		r = new Random();
		speed = (r.nextInt(11));
		
		direction = (r.nextInt(360));
		
	}


	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	public void move() {
		Point2D currentLocation = getLocation();
		double x = currentLocation.getX();
		double y = currentLocation.getY();
		int angle = 90 - getDirection();
		double deltaX = Math.cos(Math.toRadians(angle)) * getSpeed();
		double deltaY= Math.sin(Math.toRadians(angle)) * getSpeed();
		x = x + deltaX;
		y = y + deltaY;
		setLocation(new Point2D(x,y));
	}
	
	
	
}
