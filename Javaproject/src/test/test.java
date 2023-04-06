package test;

import java.time.LocalDateTime;

import auxiliary.Player;
import auxiliary.Position;
import types.League;
import types.game;

public class test {
	public static void main (String[]args) {
		Player player1 = new Player(Position.sup, 4.980, "Mike", "Leona");
		Player player2 = new Player(Position.mid, 5.980, "Tom", "Veigar");
		game game1 = new game(1234, League.LCL, false, 10.2, LocalDateTime.of(2012,12,03,10,15,30), "Grecee", "paris", null, true, null, player1, player2,null, null, null, null, null, null, null, null);
		game game2 = new game(1244, League.LCS, false, 10.4, LocalDateTime.of(2012,12,04,10,15,30), "Grecee", "paris", null, true, null, player1, player2,null, null, null, null, null, null, null, null);

		System.out.print(game1);
		game1.equals(game2);
		game1.CompareTo(game2);
	}
}
