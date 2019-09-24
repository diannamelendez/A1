package com.mycompany.a1;

import java.util.Random;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.geom.Point2D;

public class NonPlayerShip extends Ship{
	
	private Random r;
	private int size;
	private MissileLauncher launcher;
	
	
	public NonPlayerShip() {
		r = new Random();
		size = (r.nextInt(25) + 6); //range of ship size is between 25 and 30
		
	}
	
	public NonPlayerShip(Point2D location, int color, int speed, int direction, int missileCount, int lifeCount, int size, MissileLauncher launcher) {
		super(location, color, speed, direction, missileCount, lifeCount);
		this.setSize();
		this.setLauncher(launcher);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setMissileCount() {
		super.setMissile(2); //nps has two missiles
		
	}

	@Override
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
		// TODO Auto-generated method stub
		
	}

	public MissileLauncher getLauncher() {
		return launcher;
	}

	public void setLauncher(MissileLauncher launcher) {
		this.launcher = launcher;
	}

	public int getSize() {
		return size;
	}

	public void setSize() {
		this.size = size;
		
	}
	
	public String toString() {
		//String parentDesc = super.toString();
		double x = getLocation().getX();
		double y = getLocation().getY();
		y = (Math.round(y*10.0)/10.0);
		x = (Math.round(x*10.0)/10.0);
		String string = "Non-Player Ship: location = " + x + "," + y + "color: " + "[" + ColorUtil.red(128) + ", "
																		   + ColorUtil.green(128) + ","
																		   + ColorUtil.blue(128) + "]"
			+ " speed = " + getSpeed() + " dir = " + getDirection() + " size="+ getSize();
		return string;
		
	}

	@Override
	public int getMissileCount() {
		return getMissiles();
		// TODO Auto-generated method stub
		
	}


}
