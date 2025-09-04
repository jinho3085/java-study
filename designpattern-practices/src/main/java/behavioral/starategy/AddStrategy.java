package behavioral.starategy;

public class AddStrategy implements CalculateStrategy {

	@Override
	public int calculate(int val1, int val2) {
		return val1 + val2;
	}

}
