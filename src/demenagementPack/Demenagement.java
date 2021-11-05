package demenagementPack;

public class Demenagement {
	private String nom; // Attributes
	private int capCamion;

	public Demenagement(String nom, int capCamion) { // Constructor
		this.nom = nom;
		this.capCamion = capCamion;
	}

	public void auTravail(int nbCartons) {
		
		// initialisation des variable utilisés blabla
		int nbVoyage = 0;
		int emport = capCamion;
		System.out.println(nom + " possède un camion de capacité: " + capCamion);
		System.out.println("Début du déménagement");
		System.out.println("__________________________________________________________________");
		System.out.println(" N°Voyages \t | N°Cartons \t | Emport \t | CapacitéCamion");
		System.out.println("__________________________________________________________________");
		
		// la boucle qui parcours les données
		while (nbCartons > 0) {
			// incrementer la valeur des nombres de voyage a chaque passage
			nbVoyage++;
			// condition si le nombre de cartons est plus grand que la capacité camion
			if (nbCartons >= capCamion) {
				// dans ce cas la on part avec le camion plein du coup l'emport est:
				emport = capCamion;
			} else 
				emport = nbCartons;
			// chaque fois qu'on fait un voyage la quantité est diminué par le nombre de cartons emportés
			nbCartons = nbCartons - emport;
			System.out.println(" " + nbVoyage + "\t \t | " + nbCartons + "\t \t | " + emport + "\t \t | " + capCamion);
		}
		System.out.println("__________________________________________________________________");
		System.out.println("Fin du déménagement");
	}
}