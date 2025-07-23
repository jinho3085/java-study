package chapter03.ex14;


public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public Goods() {
		
	}
	
	public Goods(String name, int price, int countStock, int countSold) {
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}

	public int calcDiscountPrice(float percentage) {
		return price - (int)(price * percentage);
	}
	
	public void showInfo(boolean summary) {
		if(summary) {
			System.out.println("상품이름: " + name +", 가격: " + price);
		}else {
			showInfo();
		}
	}
	
	public void showInfo() {
		System.out.println(
				"상품이름: " + name + 
				", 가격: " + price + 
				", 재고량: " + countSold + 
				", 판매량: " + countStock
		);	
	}
	
	public void sell() {
//		if(countStock > 0) {
//			countStock--;
//			countSold++;
//		}
		sell(1);
	}
	
	public void sell(int quantity) {
		if(countStock >= quantity) {
			countStock -= quantity;
			countSold += quantity;
		}
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price < 0) {
			price = 0;
		}
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

}
