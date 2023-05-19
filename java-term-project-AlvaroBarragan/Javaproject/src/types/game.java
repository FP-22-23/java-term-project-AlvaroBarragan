package types;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import auxiliary.Player;

public class game { 
private Integer gameId;
private League league;
private Boolean playoff;
private Double patch;
private LocalDate date;
private String T1id;
private String T2id;
private List<String> Bant1;
private Boolean Wint1;
private List<String> Bant2;
private Player player1t1;
private Player player2t1;
private Player player3t1;
private Player player4t1;
private Player player5t1;
private Player player1t2;
private Player player2t2;
private Player player3t2;
private Player player4t2;
private Player player5t2;


public boolean equals(Object game) {
	if (this.gameId == getGameId()) {
		return true;
	}else {
		return false;

	}
}
public boolean Wint2 (Boolean Wint1){
	boolean Wint2= true;
	if( Wint1 == true){
		Wint2= false;
	}else {
		Wint2 = true;
	}
	return Wint2;
}

public void incorporatingbant1(String s ) {
	Checkers.check("No more champs allowed", Bant1.size()<5);
	getBant1().add(s);
	
}

public void incorporatingbant2(String s ) {
	Checkers.check("No more champs allowed", Bant2.size()<5);
	getBant2().add(s);

}



public String getT1id() {
	return T1id;
}

public void setT1id(String t1id) {
	T1id = t1id;
}

public String getT2id() {
	return T2id;
}

public void setT2id(String t2id) {
	T2id = t2id;
}

public Player getPlayer1t1() {
	return player1t1;
}
public void setPlayer1t1(Player player1t1) {
	this.player1t1 = player1t1;
}
public Player getPlayer2t1() {
	return player2t1;
}
public void setPlayer2t1(Player player2t1) {
	this.player2t1 = player2t1;
}
public Player getPlayer3t1() {
	return player3t1;
}
public void setPlayer3t1(Player player3t1) {
	this.player3t1 = player3t1;
}
public Player getPlayer4t1() {
	return player4t1;
}
public void setPlayer4t1(Player player4t1) {
	this.player4t1 = player4t1;
}
public Player getPlayer5t1() {
	return player5t1;
}
public void setPlayer5t1(Player player5t1) {
	this.player5t1 = player5t1;
}
public Player getPlayer1t2() {
	return player1t2;
}
public void setPlayer1t2(Player player1t2) {
	this.player1t2 = player1t2;
}
public Player getPlayer2t2() {
	return player2t2;
}
public void setPlayer2t2(Player player2t2) {
	this.player2t2 = player2t2;
}
public Player getPlayer3t2() {
	return player3t2;
}
public void setPlayer3t2(Player player3t2) {
	this.player3t2 = player3t2;
}
public Player getPlayer4t2() {
	return player4t2;
}
public void setPlayer4t2(Player player4t2) {
	this.player4t2 = player4t2;
}
public Player getPlayer5t2() {
	return player5t2;
}
public void setPlayer5t2(Player player5t2) {
	this.player5t2 = player5t2;
}
public Integer getGameId() {
	return gameId;
}
public void setGameId(Integer gameId) {
	this.gameId = gameId;
}
public League getLeague() {
	return league;
}
public void setLeague(League league) {
	this.league = league;
}
public Boolean getPlayoff() {
	return playoff;
}
public void setPlayoff(Boolean playoff) {
	this.playoff = playoff;
}
public Double getPatch() {
	return patch;
}
public void setPatch(Double patch) {
	Checkers.check("Error in patch", patch>10);
	this.patch = patch;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public List<String> getBant1() {
	return Bant1;
}
public List<String> setBant1(List<String> bant1) {
	Bant1 = new ArrayList<String>();
	return Bant1;
}
public Boolean getWint1() {
	return Wint1;
}
public void setWint1(Boolean wint1) {
	Wint1 = wint1;
}
public List<String> setBant2(List<String> bant2) {
	Bant2 = new ArrayList<String>();
	return Bant2;
}
public List<String> getBant2() {
	return  Bant2;
}

public String CompareTo(game s){
	
	String res = null;
	if (this.patch>s.patch) {
	res = "Parche posterior";
	}else {
		if(this.patch== s.patch) {
		res ="Mismo parche"	;
		}else {
			res="Parche anterior";
		}
		
	}
	return res ;
}

public String ResumeGame() {
	return "game [gameId=" + gameId + ", league=" + league + ",Team 1 = "+ T1id+",Team 2 = "+ T2id;
}
public String toString() {
	return "game [gameId=" + gameId + ", league=" + league + ", playoff=" + playoff + ", patch=" + patch + ", date="
			+ date +",Team 1 = "+ T1id+",Team 2 = "+ T2id+ "Bant1=" + Bant1 + ", Wint1=" + Wint1 + ", Bant2=" + Bant2  + ", player1t1="
			+ player1t1 + ", player2t1=" + player2t1 + ", player3t1=" + player3t1 + ", player4t1=" + player4t1
			+ ", player5t1=" + player5t1 + ", player1t2=" + player1t2 + ", player2t2=" + player2t2 + ", player3t2="
			+ player3t2 + ", player4t2=" + player4t2 + ", player5t2=" + player5t2 + "]";
}

public game(Integer gameId, League league, Boolean playoff,  LocalDate date,Double patch,String T1id,List<String> ban1, Boolean wint1, String t2id2,
		List<String> bant2, Player player1t1, Player player2t1, Player player3t1, Player player4t1,
		Player player5t1, Player player1t2, Player player2t2, Player player3t2, Player player4t2, Player player5t2) {
	
	Checkers.check("Error in patch", patch>10&&patch<11);

	this.gameId = gameId;
	this.league = league;
	this.playoff = playoff;
	this.patch = patch;
	this.date = date;
	this.T2id = t2id2;
	this.T1id = T1id;

	Bant1 = ban1;
	Wint1 =wint1;
	Bant2 = bant2;
	this.player1t1 = player1t1;
	this.player2t1 = player2t1;
	this.player3t1 = player3t1;
	this.player4t1 = player4t1;
	this.player5t1 = player5t1;
	this.player1t2 = player1t2;
	this.player2t2 = player2t2;
	this.player3t2 = player3t2;
	this.player4t2 = player4t2;
	this.player5t2 = player5t2;
}







}

