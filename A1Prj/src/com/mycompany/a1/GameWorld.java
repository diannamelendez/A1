package com.mycompany.a1;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Random;


public class GameWorld {
	Random random = new Random();
	
	private ArrayList<GameObject> store = new ArrayList<GameObject>();
	int lives;
	int gameTime;
	int playerScore;
	
	public void init() {
		store = new ArrayList<>();
		lives = 3;
		
			
		
	}
	
	//'a'
	public void createAstroid() {
		//create an asteroid object
		Astroid astroid = new Astroid();
		//add astroid to storage vector
		store.add(astroid);
		//tell user you created an astroid
		System.out.println("A new ASTEROID has been created.");
	}
	
	//'y'
	public void createNPS() {
		//created nps object
		NonPlayerShip nps = new NonPlayerShip();
		//add it to storage vector
		store.add(nps);
		//tell user you made an nps
		System.out.println("A new Non Player Ship has been created.");
		
	}

	//'b'
	public void createSpaceStation() {
		SpaceStation spaceStation = new SpaceStation();
		store.add(spaceStation);
		System.out.println("A new Space Station has been created.");
	}
	
	//'s'
	public void createPlayerShip() {
		PlayerShip playerShip = new PlayerShip();
		store.add(playerShip);
		playerShip.setMissile(10);
		System.out.println("A new Player Ship has been created.");
		SteerableMissileLauncher mL = new SteerableMissileLauncher();
		store.add(mL);
	}
	
	//e'
	public void eliminateNPS() { //a player ship has hit a non player ship. Remove a non player ship from array as well as a missile
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof NonPlayerShip) {
				store.remove(i);
			}
			
			if (store.get(i) instanceof Missile) {
				store.remove(i);
			}
				
				//mObj.toString();
		
		}
	}
	
	//'i'
	public void increasePSpeed() { //Increase speed of player ship
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)store.get(i);
				ps.increaseSpeed(5);
			}
		
		 }
	}

	//'d'
	public void decreasePSpeed() { //decrease speeed of player ship
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)store.get(i);
				ps.decreaseSpeed(5);
			}
		
		 }
		
	}
	
	//'l'
	public void turnLeft() { //tells ship to steer left
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)store.get(i);
				ps.steer(false, 10);
			}
		
			
		}
	}
	
	//'r'
	public void turnRight() {
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)store.get(i);
				ps.steer(true, 10);
			}
		}
	}
	
	
	
	//'<'
	public void turnMissileLauncher() {
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof SteerableMissileLauncher) {
				SteerableMissileLauncher mL = (SteerableMissileLauncher)store.get(i);
				mL.steer(false, 10);
			}
		}
		
	}
	
	//'f'
	public void firePSMissile() {
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)store.get(i);
				if (ps.getMissileCount() > 0) {
					Missile missile = new Missile();
					store.add(missile);
				}
			}
				
		}
		
	}
	
	//'L'
	public void fireNPSMissile() {
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof NonPlayerShip) {
				NonPlayerShip nps = (NonPlayerShip)store.get(i);
				if (nps.getMissileCount() == 0) {
					System.out.println("no more missiles");
				}
				else {
					Missile missile = new Missile();
					store.add(missile);
				}
			}
			else {
				System.out.println("no more missiles");
			}
		}
	}

	//'j'
	public void centerShip() {
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)store.get(i);
				ps.centerShip();
			}
		}
		
	}
	
	//'n'
	public void resupplyPS() { //resupply player ship missiesl to 10
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)store.get(i);
				ps.setMissileCount();
			}
		}
		
	}
	
	//'k'
	public void killedAstroid() { //player ship has killed an asteroid, remove missile and astroid from array/world
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof Astroid) {
				store.remove(i);
				PlayerShip ps = new PlayerShip();
				playerScore++;
				ps.setMissile(ps.getMissiles() - 1);
			}
		}
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof Missile) {
				store.remove(i);
			}
		}
	}
	
	//'e'
	public void eliminatedNPS() { //player ship has killed an non player ship; remove missile and non player ship from array and world
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof Missile) {
				store.remove(i);
				
			}
		}
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof NonPlayerShip) {
				store.remove(i);
			}
		}
		PlayerShip ps = new PlayerShip(); //increase the players score
		playerScore++;
		ps.setMissile(ps.getMissiles() - 1);
	}
	
	//'E'
	public void explodedPS() {
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof Missile) {
				store.remove(i);		
			}
		}
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof PlayerShip) {
				store.remove(i);
			}
		}
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof NonPlayerShip) {
				NonPlayerShip nps = new NonPlayerShip();
				nps.setMissile(nps.getMissiles() - 1);
			}
		}
		
		lives--;
		
		
	}
	
	//'c'
	public void crashedAstroid() {
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof PlayerShip) {
				store.remove(i);		
			}
		}
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof Astroid) {
				store.remove(i);		
			}
		}
		lives --;
		if (lives == 0) {
			System.out.println("Game is over");
			System.exit(0);
		}
	}
	
	//'h'
	public void hitNPS() {
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof NonPlayerShip) {
				store.remove(i);		
			}
		}
		//decremetn lives
		lives --;
		if (lives == 0) {
			System.out.println("Game is over");
			System.exit(0);
		}
		
	}
	
	//'x'
	public void exterminatedAstroid() {
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof Astroid) {
				store.remove(i);		
			}
		}
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof Astroid) {
				store.remove(i);		
			}
		}
		
	}
	
	//'I'
	public void impactedNPS() {
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof NonPlayerShip) {
				store.remove(i);		
			}
		}
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof Astroid) {
				store.remove(i);		
			}
		}
		
	}
	
	//'t'
	public void gameClock() {
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof MoveableGameObject) {
				MoveableGameObject mObj = (MoveableGameObject)store.get(i);
				mObj.move();
			}
		}
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof Missile) {
				Missile missile = (Missile)store.get(i);
				if (missile.getFuel() == 10) {
					store.remove(missile);
				}
				else {
					missile.setFuelLevel(missile.getFuel() - 1);
					
						
				}
			}
		}
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof SpaceStation) {
				SpaceStation station = (SpaceStation)store.get(i);
				if (gameTime % station.getBlinkRate() == 0) {
					station.toggleBlinkLight();
				}
			}
		}
		
		gameTime++;
		
		
	}
	
	//'p'
	public void printGameStatus() {
		for (int i = 0; i<store.size(); i++) {
			if (store.get(i) instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)store.get(i);
				//int score = ps.getScore();
				System.out.println("Player score is " + playerScore);
				int missiles = ps.getMissiles();
				System.out.println("Number of missiles in ship: " + missiles);
				System.out.println("Current Elapsed Time: " + gameTime);
			}
		}
		
		
		
	}
	
	//'m'
	public void printWorldStatus() {
		//ArrayList<gameObjects> = GameObject.getObjects();
		for (int i = 0; i<store.size(); i++) {
			if ( store.get(i) instanceof Astroid) {
				Astroid astroid = (Astroid) store.get(i);
				String string = astroid.toString();
				System.out.println(string);
			}
						
			else if (store.get(i) instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)store.get(i);
				String string = ps.toString();
				System.out.println(string);
			}
			else if (store.get(i) instanceof Missile) {
				Missile missile = (Missile)store.get(i);
				String string = missile.toString();
				System.out.println(string);
			}
			else if (store.get(i) instanceof NonPlayerShip) {
				NonPlayerShip nps = (NonPlayerShip)store.get(i);
				String string = nps.toString();
				System.out.println(string);
			}
			else if (store.get(i) instanceof SpaceStation) {
				SpaceStation station = (SpaceStation)store.get(i);
				String string = station.toString();
				System.out.println(string);
			}	
					
		}	
	}
	
	//'q'
	public void quit() {
		
		System.exit(0);
		
	}
}
	
	
	
	
	
	
	
