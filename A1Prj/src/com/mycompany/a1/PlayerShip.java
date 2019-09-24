package com.mycompany.a1;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.geom.Point2D;

public class PlayerShip extends Ship implements ISteerable{

	private int score;
	private SteerableMissileLauncher launcher;
	
	public PlayerShip() {
		setLocation(new Point2D(512,384));
		
	}
	
	public PlayerShip(Point2D location, int color, int speed, int direction, int missileCount, int lifeCount, int score, SteerableMissileLauncher launcher) {
		super(location, color, speed, direction, missileCount, lifeCount);
		this.score = score;
		this.setLauncher(launcher);
		setLocation(new Point2D(512,384));
		setSpeed(0);
		setDirection(0);
		//setColor(ColorUtil
	}
	
	
		
	@Override
	public void setMissileCount() {
		setMissile(10);
	}
	
	@Override
	public int getMissileCount() {
		return getMissiles();
	}
	
	

	public void increaseSpeed(int amount) {
		setSpeed(getSpeed() + 1);
		
		
		
	}
	
	public void decreaseSpeed(int amount) {
		setSpeed(getSpeed() - 1);
		
	}
	
	public void turnLeft(int heading) {
		setDirection(getDirection() - heading);
		
	}
	
	public void turnRight(int heading) {
		setDirection(getDirection() + heading);
		
	}
	
	
	
	public int fireMissile(int missileCount) {
		missileCount--;
		return missileCount;
	}
	
	public void centerShip() {
		setLocation(new Point2D(512,384));
	}
	
	public int getScore() {
		return score;
	}
	
	
	public void setScore(int score) {
		this.score = score;
	}
	public void incrementScore() {
		setScore((getScore() + 1));
		
	}
	
	public void decrementScore() {
		setScore((getScore() - 1));
		
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
		System.out.println("x moved by " + deltaX + "\ny moved by " + deltaY);
		//launcher.sameLSD(getSpeed(), getLocation());
		
	}

	@Override
	public void steer(boolean direction, int amount) {
		if (direction) { //right
			turnRight(amount);	
		}
		
		else if (!direction) {
			turnLeft(amount);
		}
		
		
		// TODO Auto-generated method stub
		
	}

	public SteerableMissileLauncher getLauncher() {
		return launcher;
	}

	public void setLauncher(SteerableMissileLauncher launcher) {
		this.launcher = launcher;
	}
	
	public String toString() {
		//String parentDesc = super.toString();
		String string = "Player Ship: location = " + getLocation() + " color: " + "[" + ColorUtil.red(255) + ", "
																		   + ColorUtil.green(0) + ","
																		   + ColorUtil.blue(0) + "]"
			+ " speed = " + getSpeed() + " dir = " + getDirection() + " missiles =" + getMissileCount() + " Missile launcher dir = " + getDirection();
		return string;
		
	}
	
	
	

		
	


}
