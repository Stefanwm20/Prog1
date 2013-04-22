/**
 * Prof. Philipp Jenke
 * Hochschule f�r Angewandte Wissenschaften (HAW), Hamburg
 * Lecture demo program.
 */
package wagner_wendt__aufgabenblatt3;

/**
 * This is a testing class for the class Tamagotchi.
 * 
 * @author Philipp Jenke
 * 
 */
public class TestTamagotchi {

	/**
	 * Test the Tamagotchi method timePassed().
	 * 
	 * @return True if the test is passed.
	 */
	private boolean testTimePasses() {
		Tamagotchi tamagotchi = new Tamagotchi();
		tamagotchi.setHunger(0);
		tamagotchi.setTiredness(0);
		tamagotchi.setBoredness(0);
		tamagotchi.timePasses();
		return tamagotchi.getHunger() == 1 && tamagotchi.getTiredness() == 1
				&& tamagotchi.getBoredness() == 1;
	}

	/**
	 * Test the Tamagotchi method eat().
	 * 
	 * @return True if the test is passed.
	 */
	private boolean testEat() {
		Tamagotchi tamagotchi = new Tamagotchi();
		tamagotchi.setHunger(1);
		tamagotchi.setTiredness(2);
		tamagotchi.setBoredness(3);
		tamagotchi.eat();
		return tamagotchi.getHunger() == 0 && tamagotchi.getTiredness() == 2
				&& tamagotchi.getBoredness() == 4;
	}

	/**
	 * Test the Tamagotchi method sleep().
	 * 
	 * @return True if the test is passed.
	 */
	private boolean testSleep() {
		Tamagotchi tamagotchi = new Tamagotchi();
		tamagotchi.setHunger(1);
		tamagotchi.setTiredness(2);
		tamagotchi.setBoredness(3);
		tamagotchi.sleep();
		return tamagotchi.getHunger() == 2 && tamagotchi.getTiredness() == 0
				&& tamagotchi.getBoredness() == 0;
	}

	/**
	 * Test the Tamagotchi method play().
	 * 
	 * @return True if the test is passed.
	 */
	private boolean testPlay() {
		Tamagotchi tamagotchi = new Tamagotchi();
		tamagotchi.setHunger(1);
		tamagotchi.setTiredness(2);
		tamagotchi.setBoredness(3);
		tamagotchi.play();
		return tamagotchi.getHunger() == 2 && tamagotchi.getTiredness() == 3
				&& tamagotchi.getBoredness() == 0;
	}

	/**
	 * Test the Tamagotchi method getScore().
	 * 
	 * @return True if the test is passed.
	 */
	private boolean testGetScore() {
		Tamagotchi tamagotchi = new Tamagotchi();
		tamagotchi.setHunger(4);
		tamagotchi.setTiredness(4);
		tamagotchi.setBoredness(4);
		boolean test1Result = tamagotchi.getScore() == -6;

		tamagotchi.setHunger(4);
		tamagotchi.setTiredness(5);
		tamagotchi.setBoredness(3);
		boolean test2Result = tamagotchi.getScore() == -3;

		tamagotchi.setHunger(1);
		tamagotchi.setTiredness(5);
		tamagotchi.setBoredness(3);
		boolean test3Result = tamagotchi.getScore() == 0;

		return test1Result && test2Result && test3Result;
	}

	/**
	 * Program entry point.
	 */
	public static void main(String[] args) {

		boolean allTestsPassed = true;
		TestTamagotchi testTamagotchi = new TestTamagotchi();
		System.out.println(testTamagotchi.testGetScore());
		// timePasses()
		if (!testTamagotchi.testTimePasses()) {
			System.out.println("Testing timePassed(): failed");
			allTestsPassed = false;
		} else {
			System.out.println("Testing timePassed(): ok");
		}

		// eat()
		if (!testTamagotchi.testEat()) {
			System.out.println("Testing eat(): failed");
			allTestsPassed = false;
		} else {
			System.out.println("Testing eat(): ok");
		}

		// sleep()
		if (!testTamagotchi.testSleep()) {
			System.out.println("Testing sleep(): failed");
			allTestsPassed = false;
		} else {
			System.out.println("Testing sleep(): ok");
		}

		// play()
		if (!testTamagotchi.testPlay()) {
			System.out.println("Testing play(): failed");
			allTestsPassed = false;
		} else {
			System.out.println("Testing play(): ok");
		}

		// getScore()
		if (!testTamagotchi.testGetScore()) {
			System.out.println("Testing getScore(): failed");
			allTestsPassed = false;
		} else {
			System.out.println("Testing getScore(): ok");
		}

		if (allTestsPassed) {
			System.out.println("All tests passed.");
		} else {
			System.out.println("Not all tests passed.");
		}

	}
}
