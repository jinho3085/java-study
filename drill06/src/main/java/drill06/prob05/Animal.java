package drill06.prob05;

public class Animal {
	private static int count;
	
	public static int count() {
		return count; 			// 현재까지 생선된 수 리턴
	}
	
	public Animal() {		
		count++;				// 객체 생성될 때마다 증가
		System.out.println("동물 객체 생성!");
	}
	
	
	

}
