package drill06.prob07;

public class Address {
	private String city;
	private String street;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void printInfo() {
		System.out.println("도시: " + city);
		System.out.println("도로명: " + street);
	}

}
