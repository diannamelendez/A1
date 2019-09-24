package com.mycompany.a1;

import java.util.Random;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.geom.Point2D;

public class Astroid extends MoveableGameObject{
	
	private Random r;
	private int size;
	
	
	public Astroid() {
		r = new Random(); 
		setColor(ColorUtil.rgb(169, 169, 169));
		setColor
		size = (r.nextInt(25) + 6); //range of size of asteroid is between 25 and 30

	}
	
	

	public int getSize() {
		return size;
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
		//System.out.println("x moved by " + deltaX + "\ny moved by " + deltaY);
		
		
		// TODO Auto-generated method stub
		
	}
	
	
	public String toString() {
		double x = getLocation().getX();
		double y = getLocation().getY();
		y = (Math.round(y*10.0)/10.0); //doing these things in order to cut off excess decimal points for location
		x = (Math.round(x*10.0)/10.0);
		
		//String parentDesc = super.toString();
		String string = "Asteroid: loc = " + x + "," + y + " color: " + "[" + ColorUtil.red(169) + ", "
																		   + ColorUtil.green(169) + ", "
																		   + ColorUtil.blue(169) + "]"
			+ " speed = " + getSpeed() + " dir = " + getDirection() + " size="+ getSize();
		return string;
		
	}

	
}
