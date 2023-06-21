 package com.in36minutes.learningspringframework;

import com.in36minutes.learningspringframework.game.GameRunner;
import com.in36minutes.learningspringframework.game.MarioGame;
import com.in36minutes.learningspringframework.game.PacmanGame;
import com.in36minutes.learningspringframework.game.SuperCountra;

public class AppGamingBasicjava {

	public static void main(String[] args) {
//1		var marioGame=new MarioGame();
//1		var gameRunner=new GameRunner(marioGame);
		
//2		var superCountra=new SuperCountra();
//2		var gameRunner=new GameRunner(superCountra);
	
		//var game=new SuperCountra();
		//var game=new MarioGame();
		var game=new PacmanGame();
		var gameRunner=new GameRunner(game);
		gameRunner.run(); 

	}

}
