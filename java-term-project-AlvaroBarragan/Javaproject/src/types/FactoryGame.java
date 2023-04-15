package types;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import auxiliary.Player;
import auxiliary.Position;

public class FactoryGame {
public static games readGame(String file) {
	games res = null;
	try {
		Stream<game> sw =
				Files.lines(Paths.get(file))
				.skip(1)
				.map(FactoryGame::parseGame);
		res = new games(sw);
	}catch (IOException e) {
		System.out.println("Error with the file " + file);
		e.printStackTrace();
	}  
	return res;
}


private static game parseGame(String line) {
	String[] fields = line.split(",");
	Integer gameId = Integer.valueOf(fields[0].trim());
	League league = League.valueOf(fields[1].trim());
	Boolean playoff = Boolean.valueOf(fields[2].trim());
	LocalDateTime date = LocalDateTime.parse(fields[3].trim(),DateTimeFormatter.ofPattern("dd/MM/yyyy h:mm"));
	Double patch = Double.valueOf(fields[4].trim());
	String T1id = fields[5].trim();
	List<String> ban1= new ArrayList();
	String one = fields[6].trim();
	ban1.add(one);
	String two = fields[7].trim();
	ban1.add(two);
	String three = fields[8].trim();
	ban1.add(three);
	String four = fields[9].trim();
	ban1.add(four);
	String five = fields[10].trim();
	ban1.add(five);
	Boolean wint1 = Boolean.valueOf(fields[11].trim());
	String T2id = fields[12].trim();
	List<String> ban2= new ArrayList();
	String one2 = fields[13].trim();
	ban1.add(one2);
	String two2 = fields[14].trim();
	ban1.add(two2);
	String three2 = fields[15].trim();
	ban1.add(three2);
	String four2 = fields[16].trim();
	ban1.add(four2);
	String five2 = fields[17].trim();
	ban1.add(five2);
	
	Position t1p1pos = Position.valueOf(fields[18].trim());
	String t1p1name = fields[19].trim();
	String t1p1champ = fields[20].trim();
	Double t1p1dmg = Double.valueOf(fields[21].trim());
	Player n1 = new Player(t1p1pos, t1p1dmg, t1p1name, t1p1champ);
	
	Position t1p2pos = Position.valueOf(fields[22].trim());
	String t1p2name = fields[23].trim();
	String t1p2champ = fields[24].trim();
	Double t1p2dmg = Double.valueOf(fields[25].trim());
	Player n2 = new Player(t1p2pos, t1p2dmg, t1p2name, t1p2champ);
	
	Position t1p3pos = Position.valueOf(fields[26].trim());
	String t1p3name = fields[27].trim();
	String t1p3champ = fields[28].trim();
	Double t1p3dmg = Double.valueOf(fields[29].trim());
	Player n3 = new Player(t1p3pos, t1p3dmg, t1p3name, t1p3champ);
	
	Position t1p4pos = Position.valueOf(fields[30].trim());
	String t1p4name = fields[31].trim();
	String t1p4champ = fields[32].trim();
	Double t1p4dmg = Double.valueOf(fields[33].trim());
	Player n4 = new Player(t1p4pos, t1p4dmg, t1p4name, t1p4champ);
	
	Position t1p5pos = Position.valueOf(fields[34].trim());
	String t1p5name = fields[35].trim();
	String t1p5champ = fields[36].trim();
	Double t1p5dmg = Double.valueOf(fields[37].trim());
	Player n5 = new Player(t1p5pos, t1p5dmg, t1p5name, t1p5champ);
	
	Position t2p1pos = Position.valueOf(fields[38].trim());
	String t2p1name = fields[39].trim();
	String t2p1champ = fields[40].trim();
	Double t2p1dmg = Double.valueOf(fields[41].trim());
	Player n6 = new Player(t2p1pos, t2p1dmg, t2p1name, t2p1champ);
	
	Position t2p2pos = Position.valueOf(fields[42].trim());
	String t2p2name = fields[43].trim();
	String t2p2champ = fields[44].trim();
	Double t2p2dmg = Double.valueOf(fields[45].trim());
	Player n7 = new Player(t2p2pos, t2p2dmg, t2p2name, t2p2champ);
	
	Position t2p3pos = Position.valueOf(fields[46].trim());
	String t2p3name = fields[47].trim();
	String t2p3champ = fields[48].trim();
	Double t2p3dmg = Double.valueOf(fields[49].trim());
	Player n8 = new Player(t2p3pos, t2p3dmg, t2p3name, t2p3champ);
	
	Position t2p4pos = Position.valueOf(fields[50].trim());
	String t2p4name = fields[51].trim();
	String t2p4champ = fields[52].trim();
	Double t2p4dmg = Double.valueOf(fields[53].trim());
	Player n9 = new Player(t2p4pos, t2p4dmg, t2p4name, t2p4champ);
	
	Position t2p5pos = Position.valueOf(fields[54].trim());
	String t2p5name = fields[55].trim();
	String t2p5champ = fields[56].trim();
	Double t2p5dmg = Double.valueOf(fields[57].trim());
	Player n10 = new Player(t2p5pos, t2p5dmg, t2p5name, t2p5champ);
	
	
	
	
	
	
	
	return new game(gameId,league,playoff,date, patch,T1id,ban1,wint1,T2id,ban2,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10);
}




}