package bootstrap;

public class SampleBarefoot {

	public static void main(String[] args) {
		
		double startLat = 12.999531;
		double startLng = 77.600701;
		
		double rightLat = 12.817937;
		double rightLng = 77.890222;
		
		double bottomLat = 12.817937;
		
		double vertical = distance(startLat, startLat, startLng, rightLng, 0, 0);
		double horizontal = distance(startLat, bottomLat, startLng,  startLng, 0, 0);
		
		
		int matrixWidth = 500;
		horizontal = horizontal / matrixWidth;
		vertical = vertical / matrixWidth;
		
//		System.out.println(horizontal);
//		System.out.println(vertical);
		
		double[][] lat1 = new double[(int)horizontal][(int)vertical];
		double[][] lat2 = new double[(int)horizontal][(int)vertical];
		double[][] lat3 = new double[(int)horizontal][(int)vertical];
		double[][] lat4 = new double[(int)horizontal][(int)vertical];
		
		double[][] lng1 = new double[(int)horizontal][(int)vertical];
		double[][] lng2 = new double[(int)horizontal][(int)vertical];
		double[][] lng3 = new double[(int)horizontal][(int)vertical];
		double[][] lng4 = new double[(int)horizontal][(int)vertical];
		
		for(int i = 0; i < (int)horizontal; i++) {
			for(int j = 0; j < (int)vertical; j++) {
				lat1[i][j] = (startLat + ((bottomLat - startLat) / vertical) * i);
				lat2[i][j] = (startLat + ((bottomLat - startLat) / vertical) * i);
				lat3[i][j] = (startLat + ((bottomLat - startLat) / vertical) * (i + 1));
				lat4[i][j] = (startLat + ((bottomLat - startLat) / vertical) * (i + 1));
				
				lng1[i][j] = (startLng + ((rightLng - startLng) / horizontal) * j);
				lng2[i][j] = (startLng + ((rightLng - startLng) / horizontal) * (j + 1));
				lng3[i][j] = (startLng + ((rightLng - startLng) / horizontal) * j);
				lng4[i][j] = (startLng + ((rightLng - startLng) / horizontal) * (j + 1));
//				System.out.println((startLat + ((bottomLat - startLat) / vertical) * i) + ", " + 
//						(startLng + ((rightLng - startLng) / horizontal) * j));// + " " + j
			}
		}
		
		for(int i = 0; i < (int)horizontal; i++) {
			for(int j = 0; j < (int)vertical; j++) {
				System.out.println(lat1[i][j] + ", " + lng1[i][j]);
				System.out.println(lat2[i][j] + ", " + lng2[i][j]);
				System.out.println(lat3[i][j] + ", " + lng3[i][j]);
				System.out.println(lat4[i][j] + ", " + lng4[i][j]);
			}
			System.out.println("---------------------");
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
