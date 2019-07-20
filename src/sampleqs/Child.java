package sampleqs;

public class Child extends Parent {

	private String childAddress = "";
	
	public Child(String address, double lat, double lng) {
		super(lat, lng);
		childAddress = address;
	}
	
	public String getAddress() {
		return childAddress;
	}

}
