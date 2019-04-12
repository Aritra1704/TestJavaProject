package sampleqs;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class NameInitals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList();
		names.add("Aritra");
		names.add("Aritra Ranjan Pal");
		names.add("Aritra Pal");
		names.add("Sales & Marketing");
		names.add("Sales &Marketing");
		names.add("Sales & 1Marketing");
		names.add("2Sales & Marketing");
		
		for(String name : names) {
			System.out.print("\n" + name + " : ");
			name = removealphanumeic(name);
			System.out.print(name + " => ");
			
			name = getInitials(name);
			System.out.print(name);
		}
	}
	
	private static String removealphanumeic(String name) {
		String regNum = "[^\\p{L}\\p{Z}]";
		name = Pattern.compile(regNum).matcher(name).replaceAll("");
		return name;
	}

	private static String getInitials(String name) {
		name = name.replaceAll("  ", " ");
		String initials = "";
		String[] names = name.split(" ");
		if(names.length == 1) {
			initials = names[0].substring(0, 2);
		} else {
			initials = names[0].substring(0, 1) + names[1].substring(0, 1);
		}
		return initials;
	}
}
