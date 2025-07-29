package chapter03.generic;

public class PairTest {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("One", 1);
		System.out.println("key:" + pair.getKey() + ", value:" + pair.getValue());
	}

}
