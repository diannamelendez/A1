package com.mycompany.a1;

import com.codename1.ui.geom.Point2D;

public class FixedGameObject extends GameObject {
	private int id;
	
	public FixedGameObject() {
		
	}
	
	public FixedGameObject(Point2D location, int color, int id) { //constructor
		//super(location, color);
		this.id = id;
	}
	private int getID() {
		return id;
		
	}

}
