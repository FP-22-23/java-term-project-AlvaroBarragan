package test;

import types.FactoryGame;
import types.League;
import types.games;

public class test {
	public static void main (String[]args) {
		games w = FactoryGame.readGame("data/Dataset final (1).csv");
		System.out.println(w.champofplayer("pbO"));
		System.out.println(w.freqofmatch());
		System.out.println(w.selectleague(League.CK));
		System.out.println(w.totaldmg());
		System.out.println(w.freqofmatchstr());
		System.out.println(w.bestgameofsup());
		System.out.println(w.fisrtmatches(2));
		System.out.println(w.lastgame());
		System.out.println(w.leaguesinpatch(10.1));
	}
}
