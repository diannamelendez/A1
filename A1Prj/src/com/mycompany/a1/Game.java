#package com.mycompany.a1;

import com.codename1.ui.Form;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import java.lang.String;
import com.codename1.ui.Label;


public class Game extends Form{
	private GameWorld gw;
	
	public Game() {
		gw = new GameWorld();
		gw.init();
		play();
	}
	
	private void play() {
		Label myLabel = new Label("Enter a Command: ");
		this.addComponent(myLabel);
		final TextField myTextField = new TextField();
		this.add(myTextField);
		this.show();
		myTextField.addActionListener(new ActionListener<ActionEvent>() {
			
			public void actionPerformed(ActionEvent evt) {
				String sCommand = myTextField.getText().toString();
				myTextField.clear();
				switch (sCommand.charAt(0)){
				case 'e':
					gw.eliminateNPS();
					break;
				case 'a':
					gw.createAstroid(); //made 
					break;
				case 'y':
					gw.createNPS(); // made
					break;
				case 'b':
					gw.createSpaceStation(); //made
					break;
				case 's':
					gw.createPlayerShip(); //made
					break;
				case 'i':
					gw.increasePSpeed();
					break;
				case 'd':
					gw.decreasePSpeed();
					break;
				case 'l':
					gw.turnLeft();
					break;
				case 'r':
					gw.turnRight();
					break;
				case '<':
					gw.turnMissileLauncher();
					break;
				case 'f':
					gw.firePSMissile(); //
					break;
				case 'L':
					gw.fireNPSMissile();
					break;
				case 'j':
					gw.centerShip();
					break;
				case 'n':
					gw.resupplyPS();
					break;
				case 'k':
					gw.killedAstroid();
					break;
				case 'E':
					gw.explodedPS();
					break;
				case 'c':
					gw.crashedAstroid();
					break;
				case 'h':
					gw.hitNPS();
					break;
				case 'x':
					gw.exterminatedAstroid();
					break;
				case 'I':
					gw.impactedNPS();
					break;
				case 't':
					gw.gameClock();
					break;
				case 'p':
					gw.printGameStatus();
					break;
				case 'm':
					gw.printWorldStatus();
					break;
				case 'q':
					gw.quit();
					break;
				default:
					System.out.print("st00pid");

					
					//add code to handle rest of the commands
					
				}
			}
		});	
	}

}
