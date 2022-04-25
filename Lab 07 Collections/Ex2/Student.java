package Ex2;

public class Student {
	
	private int studentID;
	private double gpa;
	private String name;
	
	//Constructor
	public Student(int studentID, double gpa, String name){
		this.studentID = studentID;
		this.gpa = gpa;
		this.name = name;
	}

	//Setters and getters
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//print method
	public void print() {
		System.out.println("Student ID: " + getStudentID());
		System.out.println("Student Name: " + getName());
		System.out.println("Student GPA: " + getGpa());
		System.out.println();
	}
	
	
}
