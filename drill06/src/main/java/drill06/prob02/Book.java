package drill06.prob02;

public class Book {
	private String title;
	private int price;
	
	public void show() {
		System.out.println(
				 title + " " +
				price + " "
				);
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}

