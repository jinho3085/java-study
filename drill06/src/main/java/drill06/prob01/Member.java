package drill06.prob01;

public class Member {
	// 1. 필드
	private String id;
	private String name;
	private int point;
	
	// 2. 메소드
	
	// id
	public String getId() { // 외부에서 값을 읽어올때 사용
		return id;
	}
	
	public void setId(String id) { // setId() -> 외부에서 값을 저장할때 사용
		this.id = id;
	}
	
	// name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// point
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	// show
	private void show() {
		System.out.println("회원아이디:" + id);
		System.out.println("회원이름:" + name);
		System.out.println("포인트:" + point);
	}
}
