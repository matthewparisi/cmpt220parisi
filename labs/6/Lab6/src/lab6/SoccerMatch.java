package lab6;
import java.util.Random; 
import java.util.*;

public class SoccerMatch {
	Date startTime;
	Date endTime;
	String venue;
	String home;
	String visitor;
	Player homePlayers[];
	Player visitorPlayers[];
	Goal homeGoals[];
	Goal visitorGoals[];

	int homePlayerCounter, visitPlayerCounter;

	int homeGoalCounter, visitGoalCounter;

	SoccerMatch(){

	startTime = endTime = null;

	venue = home = visitor = null;

	homePlayers = new Player[11];

	visitorPlayers = new Player[11];

	homeGoals = new Goal[10];

	visitorGoals = new Goal[10];

	homePlayerCounter = visitPlayerCounter = homeGoalCounter = visitGoalCounter = 0;
	
	//makes the teams 
	for(int i = 0; i < 11; i++){

	homePlayers[i] = new Player();

	visitorPlayers[i] = new Player();
	}
	//adds goals
	for(int i = 0; i < 10; i++){

	homeGoals[i] = new Goal();

	visitorGoals[i] = new Goal();
	}

	}
	
	SoccerMatch(Date st, Date et, String ven, String hom, String vis){

	this();
	startTime = st;

	endTime = et;

	venue = ven;

	home = hom;

	visitor = vis;
	}
	
	void addHomePlayer(Player p){
	homePlayers[homePlayerCounter++] = p;

	}

	void addVisitorPlayer(Player p){
	visitorPlayers[visitPlayerCounter++] = p;

	}
	
	void addHomeGoal(Goal g){
	homeGoals[homeGoalCounter++] = g;

	}

	void addVisitorGoal(Goal g){
	visitorGoals[visitGoalCounter++] = g;

	}

	int [] getHomeGoals(){

	int goals[] = new int[10];
	// gets players and goals and saves them in goals
	for(int x = 0; x < 10; x++) {
	goals[x] = homeGoals[x].getPlayer().getGoals();
	}
	return goals;
	}

	int [] getVisitorGoals(){


	int goals[] = new int[10];

	for(int x = 0; x < 10; x++) {
		goals[x] = visitorGoals[x].getPlayer().getGoals();
	}

	return goals;
	}

	String getWinner(){

	String winStat = "";

	int homeGoals[] = getHomeGoals();

	int visitGoals[] = getVisitorGoals();

	int homeTotal = 0;  
	int visitTotal = 0;

	for(int x = 0; x < 10; x++){
	homeTotal += homeGoals[x];
	visitTotal += visitGoals[x];

	}
	
	winStat = "\n Home Team Total Goals: " + homeTotal + "\n Visitor Team Total Goals: " + visitTotal;

	if(homeTotal >visitTotal) {
		winStat += "\n Winner: Home Team";
	}

	else if(visitTotal > homeTotal) {
		winStat += "\n Winner: Visitor Team";
	}
	
	else {
		winStat += "\n Tie";
	}
	
	return winStat;
	}

	public static void main(String[] args){
	Random rand = new Random();

	Date d1 = new Date(2019, 8, 15, 30, 17, 22);

	Date d2 = new Date(2019, 11, 14, 23, 34, 26);

	SoccerMatch sm = new SoccerMatch(d1, d2, "Arron", "Lions", "Tigers");

	String homePlayerName [] = {"Liam", "Nick", "Jake", "Jack", "Andrew", "Tony", "Ian", "Donald", "Duke", "Evan", "Matt"};

	String visitPlayerName [] = {"Gabe", "George", "Tray", "Drew", "Trery", "Richie", "Jeff", "Keith", "Sam", "Malcome", "Mark"};

	for(int x = 0; x < 11; x++){

	sm.addHomePlayer(new Player(homePlayerName[x], rand.nextInt(10), "Lions"));

	sm.addVisitorPlayer(new Player(visitPlayerName[x], rand.nextInt(10), "Tigers"));
	}

	for(int x = 0; x < 10; x++){

	sm.addHomeGoal(new Goal(rand.nextInt(59), sm.homePlayers[x]));

	sm.addVisitorGoal(new Goal(rand.nextInt(59), sm.visitorPlayers[x]));

	}
	System.out.println("--------Home Team Players--------");

	for(int x = 0; x < 11; x++) {
		System.out.println(sm.homePlayers[x]);
	}

	System.out.println("--------Visiting Team Players--------");

	for(int x = 0; x < 11; x++) {
		System.out.println(sm.visitorPlayers[x]);
	}

	System.out.println("--------Home Team Goals--------");

	for(int x = 0; x < 10; x++)

	System.out.println(sm.homeGoals[x]);

	System.out.println("--------Visiting Team Goals--------");

	for(int x = 0; x < 10; x++)

	System.out.println(sm.visitorGoals[x]);

	System.out.println("---------GAME STATUS--------");

	System.out.println(sm.getWinner());

	}
	}