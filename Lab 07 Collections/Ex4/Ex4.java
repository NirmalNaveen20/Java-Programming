package Ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Ex2.Student;

public class Ex4 {
	//Key and value pares we can see --> Map Class(HashMap Class)
	
	public static void main(String[] args) {
		//Creating map of student
		Map <Integer,Student> map = new HashMap<Integer,Student>();
		
		//Creating Students
		Student s1 = new Student(100, 2.5, "Kamal");
		Student s2 = new Student(101, 2.3, "Janith");
		Student s3 = new Student(103, 2.8, "Kasun");
		
		//Adding student to the map
		map.put(s1.getStudentID(), s1);
		map.put(s2.getStudentID(), s2);
		map.put(s3.getStudentID(), s3);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student ID: ");
		int id = sc.nextInt();
		
		Student st = map.get(id);
		st.print();
		
		//Use for each loop in Map Class(Optional)		
		for(Map.Entry<Integer, Student > entry : map.entrySet()) {
			int key = entry.getKey();
			Student value = entry.getValue();
		}
	}
	
}
