package random;

import java.util.Scanner;

public class kwhrechner {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TO-DO
		// Das multipliziert man dann für eine Woche, oder man kann mit einem Menü die
		// Wochenendtage und die Watt aufnahmen erhöhen z.B. 10 x 60min Aufnahmen
		// Das Ergebnis zeigt einem dann wie viel man in der Woche verbraucht hat und
		// wird dann mit dem User-Eingegebenem Strompreis multipliziert
		// Das kann man dann auch für ein Jahr oder ein halbes Jahr oder wie man es
		// möchte ausrechnen lassen

		Scanner sc = new Scanner(System.in);
		String input;
		input = sc.next();
		System.out.printf("***********************************%n Welcome to my Wattage Calculator!%n");
		System.out.printf(
				" For this first test you can only input 4 different Wattages. %n It's recommended to record these Wattages in a 60min Interval. %n ----------------------------- %n");

		System.out.printf(" Input your 1. Wattage please: ");
		float watts = sc.nextFloat();

		System.out.printf(" Input your 2. Wattage please: ");
		float watts2 = sc.nextFloat();

		System.out.printf(" Input your 3. Wattage please: ");
		float watts3 = sc.nextFloat();

		System.out.printf(" Input your 4. Wattage please: ");
		float watts4 = sc.nextFloat();

		System.out.printf(" 1: %.2f W %n 2: %.2f W %n 3: %.2f W %n 4: %.2f W%n", watts, watts2, watts3, watts4);

		System.out.printf(
				" ----------------------------- %n The Program will now calculate your average Watts per day. %n");
		float avgwatts = (watts + watts2 + watts3 + watts4) / 4;
		System.out.printf(" Your average Watts per day are: %.2f W%n ----------------------------- %n", avgwatts);

		System.out.printf(" You can now Input a specified Time-Span (for test purposes now only with Days): ");
		float days = sc.nextFloat();
		float daysavg = avgwatts * days;
		System.out.printf(" Your average Watts for %.0f Days are: %.2f Watts %n", days, daysavg);
		float kwh = daysavg / 1000;
		System.out.printf(" In kWh this is: %.2f kWh%n", kwh);

		int i = 1;
		while (i <= 3) {
			i++;
			System.out.printf(" What do you want to do next? *Return* or *Keep Going*? %n");
		}
		String choice = input;
		switch (choice) {
		case "keep going":
			if (input.equalsIgnoreCase("keep going")) {
				System.out.printf(" You can now use your previous Watts to keep calculating. %n");
				break;
			}

		case "return":
			if (input.equalsIgnoreCase("return")) {
				System.out.printf(" You stopped the Program. %n");
				return;
			}

		}

		System.out.printf(" Your kWh are: %.2f kWh %n", kwh);

	}
}
