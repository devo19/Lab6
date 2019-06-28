import java.util.Random;
import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		String userChoice;
		int noOfRolls = 0;
		Scanner scanner = new Scanner(System.in);

		do {

			System.out.println("Welcome to Grand Circus Casino!");
			System.out.println();
			System.out.println("How many sides should each die have?");
			int sidesEntered = scanner.nextInt();

			int firstDiceResult = generateRandomDieRoll(sidesEntered);
			int secondDiceResult = generateRandomDieRoll(sidesEntered);

			noOfRolls++;
			System.out.println("Roll " + noOfRolls);

			System.out.println(firstDiceResult);
			System.out.println(secondDiceResult);

			System.out.println("Roll again? (y/n):");
			userChoice = scanner.next();

		} while (userChoice.equalsIgnoreCase("y"));

		    System.out.println("Goodbye!!");
		    scanner.close();
	}

	public static int generateRandomDieRoll(int noOfSides) {
		int randomResult;
		Random random = new Random();
		randomResult = random.nextInt(noOfSides) + 1;
		return randomResult;

	}

}
