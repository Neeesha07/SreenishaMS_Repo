package Assignment1;



public class Student {
	static {
		studentCount=10;
	}
	private static  int studentId;
	 private char studentType;
	 private String studentName;
	 private static int studentCount;
	 private static int inc;
	public static int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	public Student( char studentType, String studentName ) {
		super();
		this.studentType = studentType;
		this.studentName = studentName;
		this.studentId=studentCount++;
		
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId+inc;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Student() {
		studentCount++;
		studentId=studentCount;
	}
	public void displayDetails( ) {
		System.out.println("Student Details :\nStudent Id: "+getStudentId()+"\nStudent Name: "+getStudentName()+"\nStudent Type: "+getStudentType()+"\nSTudent Count: "+getStudentCount());
	}
}
