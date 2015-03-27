package de.l_infotech.adventure.controller;

import java.io.Console;
import java.util.Scanner;

import de.l_infotech.adventure.model.GameLogic;
import de.l_infotech.adventure.model.Hero;
import de.l_infotech.adventure.view.TextOut;

public class GameEngine {

	private static final int PLAYER_HEALTH = 50;
	private static final int PLAYER_ATTACK = 10;
	
	private Hero player;
	private GameLogic logic;
	private TextOut out;

	private Scanner reader = new Scanner(System.in);
	
	public GameEngine(){
		
		System.out.print("Enter your name: ");
		String name = reader.nextLine();
		System.out.print("\n");
		
		player = new Hero(name, PLAYER_HEALTH, PLAYER_ATTACK);
		logic = new GameLogic();
		out = new TextOut();
	}
	
	public void run(){
		
		out.println("Hi Player " + player.getName());
		
		while(true){
		
				out.printList(logic.getListOfPossibilities());
				

				System.out.print("Enter your Number of choice: ");
				int cmd = reader.nextInt();
				System.out.print("\n");
				
				out.println(logic.doCommand(cmd));
				
				
		}
		
	}
	
}
