package sampleqs;

public class SampleClass {

	public static void main(String[] args) {

		Child child = new Child("test address", 17.123456, 78.123456);
		System.out.print("Address: " + child.getAddress() + "\nLat: " + child.getLatitude() + "\nLng: " + child.getLongitude());

	}

}
