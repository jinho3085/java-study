package exercise03.prob01;

public class Goods {
	private String name;
	private int price;
	private int stock;
	
	public Goods(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public void printInfo() {
		System.out.println(name + "(가격:" + price + "원)이" + stock + "개 입고 되었습니다.");
	}  
	
	public void showInfo() {
		System.out.println(
				"상품이름: " + name +
				",가격: " + price +
				",재고량: " + stock
		);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getStock() {
		return stock;
	}
}