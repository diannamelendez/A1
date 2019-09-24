package com.mycompany.a1;

import java.util.Random;

import com.codename1.ui.geom.Point2D;

public abstract class GameObject {
	private Point2D location;
	private int color;
	private Random r;
	
	public GameObject() {
		r = new Random();
		float x = r.nextFloat() * 1024.0f;
		float y = r.nextFloat() * 768.0f;
		location = new Point2D(x,y);
		
	}
	
	
	
	public Point2D getLocation() {	
		return location;
	}
	
	public void setLocation(Point2D newLocation) {
		location = newLocation;

	}
	
	public int getColor() {
		return color;
	}
		
	public void setColor(int color){
		this.color = color;
	}
	
	
	
	
	//public void randomLocation()
}
