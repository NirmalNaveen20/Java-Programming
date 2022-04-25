package Ex2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
	public static void main(String[] args) {
		
		List<Student> Studentlist = new ArrayList<>();
		Studentlist.add(new Student(100,2.5,"Kamal"));
		Studentlist.add(new Student(101,3.6,"Nimal"));
		Studentlist.add(new Student(102,2.9,"Sunith"));
		
		
		
		
		//Traversing through the list (Iterative through list)
		for(Student s : Studentlist) {
			System.out.println("Student ID: " + s.getStudentID());
			System.out.println("Student Name: " + s.getName());
			System.out.println("Student GPA: " + s.getGpa());
			System.out.println();
		}
		
	}
}
