package bootstrap;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleBarefoot {

	public static void main(String[] args) {
		
		double startLat = 12.999531;
		double startLng = 77.600701;
		
		double rightLng = 77.890222;
		
		double bottomLat = 12.817937;
		
		double hori = distance(startLat, startLat, startLng, rightLng, 0, 0);
		double vert = distance(startLat, bottomLat, startLng,  startLng, 0, 0);
		
		
		int matrixWidth = 500;
		vert = Math.ceil(vert / matrixWidth);
		hori = Math.ceil(hori / matrixWidth);
		
//		System.out.println(hori);
//		System.out.println(vert);
		
		double[][] lat1 = new double[(int)vert][(int)hori];
		double[][] lat2 = new double[(int)vert][(int)hori];
		double[][] lat3 = new double[(int)vert][(int)hori];
		double[][] lat4 = new double[(int)vert][(int)hori];
		
		double[][] lng1 = new double[(int)vert][(int)hori];
		double[][] lng2 = new double[(int)vert][(int)hori];
		double[][] lng3 = new double[(int)vert][(int)hori];
		double[][] lng4 = new double[(int)vert][(int)hori];
		
		for(int i = 0; i < (int)vert; i++) {
			for(int j = 0; j < (int)hori; j++) {
				lat1[i][j] = (startLat - ((startLat - bottomLat) / hori) * j);
				lat2[i][j] = (startLat - ((startLat - bottomLat) / hori) * j);
				lat3[i][j] = (startLat - ((startLat - bottomLat) / hori) * (j + 1));
				lat4[i][j] = (startLat - ((startLat - bottomLat) / hori) * (j + 1));
				
				lng1[i][j] = (startLng + ((rightLng - startLng) / vert) * i);
				lng2[i][j] = (startLng + ((rightLng - startLng) / vert) * (i + 1));
				lng3[i][j] = (startLng + ((rightLng - startLng) / vert) * i);
				lng4[i][j] = (startLng + ((rightLng - startLng) / vert) * (i + 1));
				
				System.out.println((startLat - ((startLat - bottomLat) / hori) * j) + ", " + 
						(startLng + ((rightLng - startLng) / vert) * i));
			}
		}
		List<List<String>> rows = new ArrayList<List<String>>();
		for(int i = 0; i < (int)vert; i++) {
			for(int j = 0; j < (int)hori; j++) {
//				System.out.println(lat1[i][j] + ", " + lng1[i][j]);
//				System.out.println(lat2[i][j] + ", " + lng2[i][j]);
//				System.out.println(lat3[i][j] + ", " + lng3[i][j]);
//				System.out.println(lat4[i][j] + ", " + lng4[i][j]);
				List<List<String>> row = Arrays.asList(
					    Arrays.asList(String.valueOf(lat1[i][j]), String.valueOf(lng1[i][j])),
					    Arrays.asList(String.valueOf(lat2[i][j]), String.valueOf(lng2[i][j])),
					    Arrays.asList(String.valueOf(lat3[i][j]), String.valueOf(lng3[i][j])),
					    Arrays.asList(String.valueOf(lat4[i][j]), String.valueOf(lng4[i][j]))
					);
				rows.addAll(row);
			}
//			System.out.println("---------------------");
		}
		
//		try {
//			FileWriter csvWriter = new FileWriter("Locus.csv");
//			csvWriter.append("lat");
//			csvWriter.append(",");
//			csvWriter.append("lng");
//			 csvWriter.append("\n");
//			
//	
//
//		for (List<String> rowData : rows) {
//		    csvWriter.append(String.join(",", rowData));
//		    csvWriter.append("\n");
//		}
//
//		csvWriter.flush();
//		csvWriter.close();
//		} catch (IOException e) {
//			System.out.println("" + e.getLocalizedMessage());
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public void addDataToCSV() {
		
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
