package wagner_wendt__aufgabenblatt3;

public class Tamagotchi {
	private int hunger;
	private int boredness;
	private int tiredness;

	public int getHunger() {
		// TODO Auto-generated method stub
		return hunger;
	}

	public int getTiredness() {
		// TODO Auto-generated method stub
		return tiredness;
	}

	public int getBoredness() {
		// TODO Auto-generated method stub
		return boredness;
	}

	public void setHunger(int i) {
		hunger = i;

	}

	public void setTiredness(int i) {
		tiredness = i;

	}

	public void setBoredness(int i) {
		boredness = i;

	}

	public void timePasses() {
		hunger++;
		tiredness++;
		boredness++;

	}

	public void eat() {
		// TODO Auto-generated method stub
		boredness++;
		hunger = 0;

	}

	public void sleep() {
		// TODO Auto-generated method stub
		boredness = 0;
		hunger++;
		tiredness = 0;
	}

	public void play() {
		// TODO Auto-generated method stub
		boredness = 0;
		hunger++;
		tiredness++;
	}

	public int getScore() {
		int score = 0;
		if (getHunger() >= 4) {

			System.out.println("Im Hungry");
			score -= 2;

		}
		if (getTiredness() >= 4) {

			score -= 2;

		}
		if (getBoredness() >= 4) {

			score -= 2;

		}
		if (getHunger() < 4) {

			score += 1;
		}
		if (getTiredness() < 4) {

			score += 1;
		}
		if (getBoredness() < 4) {

			score += 1;
		}
		return score;

	}

	public void handleCommand(String command) {
		switch (command) {
		case "eat":
			eat();
			timePasses();
			System.out.println("Current Score" + getScore());
			System.out.println("Fun!");
			break;
		case "sleep":
			sleep();
			timePasses();
			System.out.println("Current Score" + getScore());

			break;
		case "play":
			play();
			timePasses();
			System.out.println("Current Score" + getScore());

		case "nothing":
			timePasses();
			System.out.println("Current Score" + getScore());
			break;
		case "exit":
			System.out.println("Goodbye!");
		}

	}

}
