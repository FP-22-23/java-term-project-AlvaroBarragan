package types;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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
	
	public void addAllGames(List<game> s) {
		games.addAll(s);
	}
	public void delgame(game s) {
		games.remove(s);
	}
	public boolean exists() {
		boolean bol = false;
		for (game g:games ) {
			if (g.getPlayoff()==true) {
				bol=true;
				break;
		}
		}
		return bol;
	}
	public boolean existsstr() {
	return games.stream().anyMatch(x->x.getPlayoff().equals(true));	
	}
	
	public double totaldmg() {
		double total=0;
		Double Sum= 0.0;
		for (game g:games) {
			total =g.getPlayer1t1().getDmp()+g.getPlayer2t1().getDmp()+g.getPlayer3t1().getDmp()+g.getPlayer4t1().getDmp()+g.getPlayer5t1().getDmp();
			Sum=Sum+total;
		}
		
		return Sum;
	}
	public double totaldmgstr() {
		double  one = games.stream().mapToDouble(x->x.getPlayer1t1().getDmp()).sum();
		double two=games.stream().mapToDouble(x->x.getPlayer2t1().getDmp()).sum();
		double three=games.stream().mapToDouble(x->x.getPlayer3t1().getDmp()).sum();
		double four=games.stream().mapToDouble(x->x.getPlayer4t1().getDmp()).sum();
		double five=games.stream().mapToDouble(x->x.getPlayer5t1().getDmp()).sum();
		double six=games.stream().mapToDouble(x->x.getPlayer1t2().getDmp()).sum();
		double seven=games.stream().mapToDouble(x->x.getPlayer2t2().getDmp()).sum();
		double eight=games.stream().mapToDouble(x->x.getPlayer3t2().getDmp()).sum();
		double nine=games.stream().mapToDouble(x->x.getPlayer4t2().getDmp()).sum();
		double ten=games.stream().mapToDouble(x->x.getPlayer5t2().getDmp()).sum();
		double total =one+two+three+four+five+six+seven+eight+nine+ten;
		return total;
	}
	public List<game> selectleague(League s){
		List<game> t= new ArrayList<game>();
		for(game a:games) {
			if (a.getLeague()==s) {
				t.add(a);
			}
		}
		return t;
	}
	public List<game>selectleaguestr(League s ){
		return games.stream().filter(x->x.getLeague().equals(s)).collect(Collectors.toList());
	}
	public game worstmatchofadc(String s ) {
		return games.stream().filter(x->x.getPlayer1t1().getName().equals(s)).min(Comparator.comparing(x->x.getPlayer1t1().getDmp())).orElse(null);
	}
	public SortedSet<game> selectleagueperdate(League s){
		return games.stream().filter(x->x.getLeague().equals(s)).sorted(Comparator.comparing(game::getDate)).collect(Collectors.toCollection(TreeSet::new));

	}
	
	
	
	public Map<String, Set<String>> champofplayer(String t){
		Map<String,Set<String>> f = new HashMap<String,Set<String>>();
		Set<String> champs = new HashSet<String>();
		for (game g:games) {
			if (g.getPlayer1t1().getName().equals(t)) {
				champs.add(g.getPlayer1t1().getChamp());
		}else {
			if (g.getPlayer2t1().getName().equals(t)) {
				champs.add(g.getPlayer2t1().getChamp());
		}else {
			if (g.getPlayer3t1().getName().equals(t)) {
				champs.add(g.getPlayer3t1().getChamp());
		}else {
			if (g.getPlayer4t1().getName().equals(t)) {
				champs.add(g.getPlayer4t1().getChamp());
		}else {
			if (g.getPlayer5t1().getName().equals(t)) {
				champs.add(g.getPlayer5t1().getChamp());
		}else {
			if (g.getPlayer1t2().getName().equals(t)) {
				champs.add(g.getPlayer1t2().getChamp());
		}else {
			if (g.getPlayer2t2().getName().equals(t)) {
				champs.add(g.getPlayer2t2().getChamp());
		}else {
			if (g.getPlayer3t2().getName().equals(t)){
				champs.add(g.getPlayer3t2().getChamp());
		}else {
			if (g.getPlayer4t2().getName().equals(t)) {
				champs.add(g.getPlayer4t2().getChamp());
		}else {
			if (g.getPlayer5t2().getName().equals(t)) {
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
public Map<Double,Long>freqofmatchstr(){
	return games.stream().collect(Collectors.groupingBy(game::getPatch,Collectors.counting()));
}
public SortedSet<League> leaguesinpatch(Double s ){
	return games.stream().filter(x->x.getPatch().equals(s)).collect(Collectors.mapping(game::getLeague, Collectors.toCollection(TreeSet::new)));
}
public Map<String,Double>bestgameofsup(){
	return games.stream().collect(Collectors.groupingBy(x->x.getPlayer1t1().getName(), Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(x->x.getPlayer1t1().getDmp())), x->x.orElse(null).getPlayer1t1().getDmp())));
}


public SortedMap<League,List<game>> fisrtmatches(Integer n ){
	Map<League,List<game>> gg = games.stream().collect(Collectors.groupingBy(game::getLeague));
	return new TreeMap<>(gg.entrySet().stream().collect(Collectors.toMap(x->x.getKey(), x->firstmatchesaux(x.getValue(),n))));
}
private List<game>firstmatchesaux(List<game> m ,Integer n){
	return m.stream().sorted(Comparator.comparing(game::getDate)).limit(n).collect(Collectors.toList());
}
	
public Map.Entry<Integer,LocalDate>lastgame(){
	Map<Integer,LocalDate> m = games.stream().collect(Collectors.toMap(x->x.getGameId(), x->x.getDate()));
	return m.entrySet().stream().max(Comparator.comparing(x->x.getValue())).orElse(null);
}
		
	
}