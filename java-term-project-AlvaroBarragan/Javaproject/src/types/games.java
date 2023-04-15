package types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import auxiliary.Player;


public class games {

	
	private List<game> games;
	
	public games() {
		games = new ArrayList<game>();
	}
	
	public games(Stream<game> sw) {
		games = sw.collect(Collectors.toList());
	}
	
	public List<game> getGames(){
		return games;
	}

	@Override
	public int hashCode() {
		return Objects.hash(games);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		games other = (games) obj;
		return Objects.equals(games, other.games);
	}

	@Override
	public String toString() {
		return "games [games=" + games + "]";
	}

	public Integer getNumberGames(){
		return games.size();
		
	}
	public void addGames(game s) {
		games.add(s);
	}
	
	public void addAllGames(List<game>  s) {
		games.addAll(s);
	}
	public void delgame(game s) {
		games.remove(s);
	}
	public boolean exists() {
		boolean bol = false;
		for (game g:games ) {
			if (g.getBant1().size()>6) {
				bol=false;
			}else {
				bol= true;
			}
		}
		return bol;
	}
	public double totaldmg() {
		double total=0;
		for (game g:games) {
			total =g.getPlayer1t1().getDmp()+g.getPlayer2t1().getDmp()+g.getPlayer3t1().getDmp()+g.getPlayer4t1().getDmp()+g.getPlayer5t1().getDmp();
		}
		return total;
	}
	
	public List<game> selectleague(League s){
		List<game> t= new ArrayList();
		for(game a:games) {
			if (a.getLeague()==s) {
				t.add(a);
			}
		}
		return t;
	}
	
	public Map<Player,Set<String>> champofplayer(Player t){
		Map<Player,Set<String>> f = new HashMap<Player,Set<String>>();
		Set<String> champs = new HashSet();
		for (game g:games) {
			if (g.getPlayer1t1()==t) {
				champs.add(g.getPlayer1t1().getChamp());
		}else {
			if (g.getPlayer2t1()==t) {
				champs.add(g.getPlayer2t1().getChamp());
		}else {
			if (g.getPlayer3t1()==t) {
				champs.add(g.getPlayer3t1().getChamp());
		}else {
			if (g.getPlayer4t1()==t) {
				champs.add(g.getPlayer4t1().getChamp());
		}else {
			if (g.getPlayer5t1()==t) {
				champs.add(g.getPlayer5t1().getChamp());
		}else {
			if (g.getPlayer1t2()==t) {
				champs.add(g.getPlayer1t2().getChamp());
		}else {
			if (g.getPlayer2t2()==t) {
				champs.add(g.getPlayer2t2().getChamp());
		}else {
			if (g.getPlayer3t2()==t) {
				champs.add(g.getPlayer3t2().getChamp());
		}else {
			if (g.getPlayer4t2()==t) {
				champs.add(g.getPlayer4t2().getChamp());
		}else {
			if (g.getPlayer5t2()==t) {
				champs.add(g.getPlayer5t2().getChamp());
		}
	}
	
	
		}
			}
			}
			}
			}
			}
	
		}
		}
		}
		f.put(t, champs);
		return f;
		
		}
	public Map<Double,Integer> freqofmatch(){
		Map<Double,Integer> contador  = new HashMap<Double,Integer>();
		for (game g:games) {
			Double caracter= g.getPatch();
			if (contador.containsKey(caracter)) {
				Integer valor = contador.get(caracter);
				valor++;
				contador.put(caracter, valor);
				
			}else {
				contador.put(caracter,1);
			}
		}
		return contador;
		
	}
	
	
	
	
	
	
	
	
	
	
}