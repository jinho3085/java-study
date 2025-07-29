package chapter03.generic;

public class Box03<T> {
	private T value;
	
	public Box03(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
