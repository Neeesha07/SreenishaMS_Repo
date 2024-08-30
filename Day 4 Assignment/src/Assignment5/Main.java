package Assignment5;

public class Main {
	public static void main(String[] args) {
		// Step 3: Create an object of type DayScholar
		DayScholar dayScholar = new DayScholar(5, "OOPS", 16000, 1001, "D", "Lily", "Brooklyn");

		// Calculate fees
		dayScholar.calculateFees();

		// Call the corresponding methods
		dayScholar.displayDetails();
		dayScholar.displayFeesDetails();
	}
}
