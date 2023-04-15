package test;

import types.FactoryGame;
import types.games;

public class test {
	public static void main (String[]args) {
		games sw = FactoryGame.readGame("data/Dataset final.csv");
		System.out.println(sw.getGames());

	
	}
}
