package exercise04.ex05;

public class ProbMain {
	public static void main(String[] args) {
		Bird bird01 = new Duck();
		bird01.setName("꽥꽥이");
		bird01.fly();
		bird01.sing();


		Bird bird02 = new Sparrow();
		bird02.setName("짹짹이");
		bird02.fly();
		bird02.sing();
		
	}
}
