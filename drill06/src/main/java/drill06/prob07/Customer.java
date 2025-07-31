package drill06.prob07;

public class Customer {

	private String name;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void printInfo() {
		System.out.println("고객명: " + name);
		address.printInfo(); // Address 객체의 정보도 같이 출력
	}
	
	
	
	
	
}
