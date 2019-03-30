package lab6;

public class Goal {
	private int minute;
	private Player player;

	Goal(){
	minute = 0;

	player = null;
	}

	Goal(int min, Player p){
	minute = min;
	player = p;
	}

	void setMinute(int minute){
	this.minute = minute;
	}

	void setPlayer(Player player){
	this.player = player;
	}

	int getMinute(){
	return minute;
	}

	Player getPlayer(){
	return player;
	}
	
	public String toString(){
	return "\n Minute the goal was scored: " + minute + "\n player who scored : " + player.getName();
	}
	
	}


