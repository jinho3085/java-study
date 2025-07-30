package drill06.prob05;

public class ProbMain {

	public static void main(String[] args) {
		new Animal();
		System.out.println("현재 동물 수: " + Animal.count());

		new Animal();
		System.out.println("현재 동물 수: " + Animal.count());
	}
}
