package com.mycompany.a1;

import com.codename1.ui.geom.Point2D;

public class MissileLauncher extends MoveableGameObject{
	
	private int fuelLevel;
	
	public MissileLauncher() {
		
	}

	public MissileLauncher(Point2D location, int color, int speed, int direction, int fuelLevel) { //constructor
		//super(location, color, speed, direction); 
		this.fuelLevel = fuelLevel;
		// TODO Auto-generated constructor stub
	}
	
	public void sameLSD(Point2D location, int speed, int direction) {
		
	}
	
	public int getFuelLevel(int fuelLevel) {
		return fuelLevel;
	}
	
	public void setFuelLevel(int fuelLevel) {
		
		this.fuelLevel = fuelLevel;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

}
