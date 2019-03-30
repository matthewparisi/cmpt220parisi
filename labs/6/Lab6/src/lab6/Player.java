package lab6;

public class Player {
	private String name;
	private int goals;
	private String team; 

	 Player() {
		name = team = "";

		goals = 0;
		}

		Player(String name, int goal, String team){
		this.name = name;

		this.goals = goal;

		this.team = team;
		}

		void setName(String name){
		this.name = name;
		}

		void setTeam(String team){
		this.team = team;
		}

		void setGoals(int goals){
		this.goals = goals;
		}

		String getName(){
		return name;
		}

		String getTeam(){
		return team;
		}

		int getGoals(){
		return goals;
		}

		public String toString(){
		return "\n Player Name: " + name + "    Team: " + team + "    Goals: " + goals;
		}
}
