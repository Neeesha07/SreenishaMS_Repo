package Assignment7;

public class DynamixEx {

	public static void main(String[] args) {
		// Create an object of DayScholar
		DayScholar dayScholar = new DayScholar(1000, 'B', "Eugene", "NYC");

		// Set values using setter methods
		dayScholar.setStudentID(1000);
		dayScholar.setStudentName("Eugene");
		dayScholar.setStudentType('B');
		dayScholar.setResidentialAddress("NYC");

		// Calculate fees
		dayScholar.calculateFees();

		// Display details of DayScholar and Student
		dayScholar.displayDetails();
	}
}
