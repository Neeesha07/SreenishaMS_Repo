package Assignment3;

//Main.java
public class Main {
	public static void main(String[] args) {
		// Create a Hostelite object using the parameterized constructor
		Hostelite hostelStudent = new Hostelite(1, 'A', "Nate", "Archibald", 5000.00, "Lavish Hostel", 101);
		DayScholar dayscholar = new DayScholar(2, 'B', "Chuck", "BAss", 6000.00, "Not So LAvish");
		// Display details
		hostelStudent.displayDetails();

		dayscholar.displayDetails();
	}
}
