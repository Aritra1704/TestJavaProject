package bootstrap;

public class SampleBarefoot {

	public static void main(String[] args) {
		
		double startLat = 12.870531;
		double startLng = 77.766701;
		
		double rightLat = 12.870531;
		double rightLng = 77.810222;
		
		double bottomLat = 12.837937;
		
		double horizontal = distance(startLat, rightLat, startLng, rightLng, 0, 0);
		double vertical = distance(12.870531, 12.837937, 77.766701,  77.768419, 0, 0);
		
		int matrixWidth = 100;
		horizontal = horizontal / matrixWidth;
		vertical = vertical / matrixWidth;
		
		System.out.println(horizontal);
		System.out.println(vertical);
		
		double[][] values = new double[(int)horizontal / 100][(int)vertical / 100];
		for(int i = 0; i < horizontal; i++) {
			for(int j = 0; j < vertical; j++) {
				System.out.println((startLat + ((bottomLat - startLat) / vertical) * i) + ", " + 
						(startLng + ((rightLng - startLng) / horizontal) * j));
			}
		}

	}

	public static double distance(double lat1, double lat2, double lon1,
	        double lon2, double el1, double el2) {

	    final int R = 6371; // Radius of the earth

	    double latDistance = Math.toRadians(lat2 - lat1);
	    double lonDistance = Math.toRadians(lon2 - lon1);
	    double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
	            + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
	            * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	    double distance = R * c * 1000; // convert to meters

	    double height = el1 - el2;

	    distance = Math.pow(distance, 2) + Math.pow(height, 2);

	    return Math.sqrt(distance);
	}
}
