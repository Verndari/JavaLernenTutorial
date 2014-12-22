package de.galileocomputing.schroedinger.java.kapitel01;

public class Aberglaube {

	public static void main(String[] args){
		if(args.length > 0) {
			String parameter = args[0];
			int zahl = Integer.parseInt(parameter);
			if(zahl%7 == 0) {
				System.out.println("Glück gehabt");
			} 
			else if(zahl%13 ==0) {
				System.out.println("Glück gehabt");
			} 
			else {
				System.out.println("Pech gehabt");
			}
 		} else {
 			System.err.println("Keine Zahl übergeben.");
 		}
	}
}