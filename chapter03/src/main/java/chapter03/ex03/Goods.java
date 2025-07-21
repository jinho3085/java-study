package chapter03.ex03;

public class Goods {
	public static int countOfGoods;
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public Goods() {
		// 클래스 내부에서는 클래스 이름 생략이 가능하다.
		// Goods.countOfGoods++;
		// System.out.println(Math.PI);
		
		countOfGoods++;
	}
}
