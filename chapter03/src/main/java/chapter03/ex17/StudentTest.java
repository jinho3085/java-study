package chapter03.ex17;

public class StudentTest {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("둘리");
		s1.setSchool("Java Scool");
		
									
		Person p1 = s1;				// Upcasting(암시적, 자식 -> 부모, Implicity)
		System.out.println(p1.getName());
		
		Person p2 = new Student(); 	// Upcasting!!!, 다형성
		p2.setName("마이콜");
		
		Student s2 = (Student)p2; 			// Downcasting(명시적, Explicity) 
		s2.setSchool("Java School"); 		// 또는
		((Student)p2).setSchool("Java School"); // Downcasting(명시적, Explicity)
	}
}
