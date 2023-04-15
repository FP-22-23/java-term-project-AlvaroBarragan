package auxiliary;

public class Player {
private Position position;
private Double dmp;
private String name;
private String Champ;

public Position getPosition() {
	return position;
}
public void setPosition(Position position) {
	this.position = position;
}
public Double getDmp() {
	return dmp;
}
public void setDmp(Double dmp) {
	this.dmp = dmp;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getChamp() {
	return Champ;
}
public void setChamp(String champ) {
	Champ = champ;
}

public String toString() {
	return "Player [position=" + position + ", dmp=" + dmp + ", name=" + name + ", Champ=" + Champ + "]";
}

public Player(Position position, Double dmp, String name, String champ) {
	
	this.position = position;
	this.dmp = dmp;
	this.name = name;
	Champ = champ;
}

}
