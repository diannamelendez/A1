package com.mycompany.a1;
import java.util.Random;

import com.codename1.charts.util.ColorUtil;
//import com.codename1.ui.geom.Point2D;

public class SpaceStation extends FixedGameObject{
	Random r;
	private int blinkRate;
	private boolean blinkLight;
	
	public SpaceStation() {
		r = new Random();
		blinkRate = r.nextInt(5);
		
	}
	
	public void toggleBlinkLight() {
		blinkLight = !blinkLight;
	}
	
	
	public int getBlinkRate() {
		return blinkRate;
	}
	
	public String toString() {
		//String parentDesc = super.toString();
		double x = getLocation().getX();
		double y = getLocation().getY();
		y = (Math.round(y*10.0)/10.0);
		x = (Math.round(x*10.0)/10.0);
		String string = "Space Station: loc = " + x + "," + y + "color: " + "[" + ColorUtil.red(250) + ", "
																		   + ColorUtil.green(250) + ","
																		   + ColorUtil.blue(0) + "]"
			+ " rate = " + getBlinkRate();
		return string;
		
	}

}
