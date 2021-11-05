package demenagementPack;

public class Demenagement {
	private String nom; // Attributes
	private int capCamion;

	public Demenagement(String nom, int capCamion) { // Constructor
		this.nom = nom;
		this.capCamion = capCamion;
	}
	public void auTravail(int nbCartons) {
		
		// initialisation des variable utilis�s
		int nbVoyage = 0;
		int emport = capCamion;
		System.out.println(nom + " poss�de un camion de capacit�: " + capCamion);
		System.out.println("D�but du d�m�nagement");
		System.out.println("__________________________________________________________________");
		System.out.println(" N�Voyages \t | N�Cartons \t | Emport \t | Capacit�Camion");
		System.out.println("__________________________________________________________________");
		
		// la boucle qui parcours les donn�es
		while (nbCartons > 0) {
			// incrementer la valeur des nombres de voyage a chaque passage
			nbVoyage++;
			if (nbCartons >= capCamion) {
				emport = capCamion;
			} else
				emport = nbCartons;
			nbCartons = nbCartons - emport;
			System.out.println(" " + nbVoyage + "\t \t | " + nbCartons + "\t \t | " + emport + "\t \t | " + capCamion);
		}
		System.out.println("__________________________________________________________________");
		System.out.println("Fin du d�m�nagement");
	}
}