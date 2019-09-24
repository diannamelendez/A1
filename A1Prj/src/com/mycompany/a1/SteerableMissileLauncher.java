package com.mycompany.a1;

import com.codename1.ui.geom.Point2D;

public class SteerableMissileLauncher extends MissileLauncher implements ISteerable {
	
	public SteerableMissileLauncher() {
		
	}

	public SteerableMissileLauncher(Point2D location, int color, int speed, int direction, int fuelLevel) {
		super(location, color, speed, direction, fuelLevel); 
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}
	
	public void turnMissileLauncher(int heading) {
		setDirection(getDirection() - heading);
		
	}
	
	public void fireMissile() {
		
	}


		
	

	@Override
	public void steer(boolean direction, int amount) {
		// TODO Auto-generated method stub
		if (!direction) { //right
			turnMissileLauncher(amount);	
		}
		
		
	}

	public void sameLSD(int speed, Point2D location) {
		// TODO Auto-generated method stub
		
	}

}
