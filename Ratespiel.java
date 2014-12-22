import java.util.Random;
import javax.swing.JOptionPane;

public class Ratespiel {
	private int zufallszahl;
	private int ratezahl;

	Ratespiel() {
		ratezahl = -1;
	}

	void setZufallszahl(int z) {
		zufallszahl = z;
	}

	int getZufallszahl() {
		return zufallszahl;
	}

	void setRatezahl(int z) {
		ratezahl = z;
	}

	int getRatezahl() {
		return ratezahl;
	}

	public static void main(String[] args) {
		Ratespiel spiel;
		spiel = new Ratespiel();
		boolean geraten = false;
		int versuchzaehler = 0;
		JOptionPane.showMessageDialog(null,
				"Erraten Sie eine ganze Zahl aus dem Bereich 1 bis 100!");
		Random randomGenerator = new Random();
		spiel.setZufallszahl(randomGenerator.nextInt(101));
		while (!geraten) {
			spiel.setRatezahl(Integer.parseInt(JOptionPane
					.showInputDialog("Welche Zahl wird gesucht?")));
			versuchzaehler++;
			if (spiel.getRatezahl() < spiel.getZufallszahl()) {
				JOptionPane.showMessageDialog(null, "Ihre Zahl ist zu groß!");
			} else {
				geraten = true;
				JOptionPane.showMessageDialog(null,
						"Glückwunsch! Sie haben die Zahl mit " + versuchzaehler
								+ " Versuchen erraten!");
			}
		}
	}
}
