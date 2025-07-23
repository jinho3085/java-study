package chapter03.ex11;

public class GoodsApp {

	public static void main(String[] args) {
		
//		기본 생성자를 자동으로 추가 해주지 않음
//		Goods camera = new Goods();
//		camera.setName("nikon");
//		camera.setPrice(400000);
//		camera.setCountSold(10);
//		camera.setCountStock(20);
		
		Goods camera2 = new Goods("nikon", 400000, 10, 20);
		camera2.showInfo();
		
	}
}
