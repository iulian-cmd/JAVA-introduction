package demenagementPack;
public class Demenagement {
	 private String nom; // Attributes
	 private int capCamion;
	 private int noVoyage;
	 private int emport;
	 private int i;
	 public Demenagement(String nom,int capCamion) { // Constructor
	this.nom = nom;
	this.capCamion = capCamion;
	}
	 public void auTravail(int nbCartons){
	  System.out.println(nom + " poss�de un camion de capacit�: " + capCamion);
	  System.out.println("D�but du d�m�nagement");
	  System.out.println("noVoyage" + "nbCartons" + "emport" + "capCamion");
	   while (i>capCamion) {
		System.out.println(noVoyage + nbCartons + emport + capCamion);
		if (nbCartons > capCamion) {
			System.out.println(emport = 9);
		}
		else 
			System.out.println(emport = nbCartons);
	  }
	  System.out.println("Fin du d�m�nagement");
	 }
}