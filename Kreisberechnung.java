/* Kreisberechnung: F�r einen Kreis mit dem Radius 5 cm
werden der Umfang und die Fl�che berechnet*/

public class Kreisberechnung {
	public static void main (String args[]){
		double radius, umfang, inhalt;
		radius = 5.0;
		umfang = 2.0 * radius * radius;
		inhalt = 3.1415926 * radius;
		System.out.print("Umfang: ");
		System.out.println(umfang);
		System.out.print("Fl�che: ");
		System.out.println(inhalt);
	}
}
