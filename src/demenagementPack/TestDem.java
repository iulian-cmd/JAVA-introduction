package demenagementPack;

public class TestDem {
	public static void main(String[] args) {
		System.out.println("Bienvenus");
		// on cr�e une "instance"
		Demenagement dem = new Demenagement("Entreprisse bretonne", 9);
		// on appelle la m�thode d�instance "auTravail()
		dem.auTravail(34);

	}
}
