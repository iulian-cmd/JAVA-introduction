package demenagementPack;

public class Demenagement {
	 private String nom; // attributs
	 private int capCamion;
	 public Demenagement(String nom,int capCamion) { // constructeur
	this.nom = nom;
	this.capCamion = capCamion;
	}
	 public void auTravail(){
	System.out.println(nom + " poss�de un camion de capacit� : " + capCamion);
	System.out.println("D�but du d�m�nagement");
	}
	}

