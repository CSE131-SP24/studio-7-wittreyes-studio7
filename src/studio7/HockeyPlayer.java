package studio7;
import java.util.Scanner;

public class HockeyPlayer {
	private String name; 
	private String jerseyNumber;
	private String shootingSide;
	private int points;
	private int goals;
	private int assists;
	private int totalGames;
	Scanner scanner = new Scanner(System.in);
	/**
	 * creates a new hockey player 
	* @param name the full name of the player
	* @param jerseyNumber the number on the player's jersey
	* @param shootingSide the side the player shoots from (left, right, or both)
	* @param points the total number of points scored by the player
	* @param goals the total number of goals scored by the player
	* @param assists the total number of assists by the player
	* @param totalGames the total number of games played by the player
	*/
	public HockeyPlayer(String name, String jerseyNumber, String shootingSide, int goals, int assists, int totalGames) {
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		this.shootingSide = shootingSide;
		this.goals = goals;
		this.assists = assists;
		this.totalGames = totalGames;
		this.points = goals + assists;
	}
	
	public void gameCompleted(String name, int newGoals, int newAssists) {
		totalGames++;
		this.goals += newGoals;
		this.assists += newAssists;
		this.points = this.goals + this.assists;
	}
	public String toString() {
		return this.name + " " + this.jerseyNumber +  " " + this.shootingSide +  " " + this.points +  " " + this.goals +  " " + this.assists +  " " + this.totalGames;
	}
	public String getName() {
		return name;
	}
	public String getJerseyNumber() {
		return jerseyNumber;
	}
	public String getShootingSide() {
		return shootingSide;
	}
	public int getPoints() {
		return points;
	}
	public int getGoals() {
		return goals;
	}
	public int getAssists() {
		return assists;
	}
	public int getTotalGames() {
		return totalGames;
	}
	public static void main(String[] args) {
		HockeyPlayer sponge = new HockeyPlayer("Bob Sponge", "00", "left", 6, 12, 3);
		System.out.println(sponge.toString());
		sponge.gameCompleted("Bob Sponge", 17, 0);
		System.out.println(sponge.toString());

}
}
