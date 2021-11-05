package demenagementPack;

//Ceci importe la classe Scanner du package java.util
import java.util.Scanner;

public class TestDem {
	public static void main(String[] args) {
		System.out.println("Bienvenus");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Veuillez saisir la capacité du camion: ");
			int capCamion = sc.nextInt();
//		System.out.println("Vous avez saisi le nombre : " + capCamion);
			// on crée une "instance"
			Demenagement dem = new Demenagement("Entreprisse bretonne", capCamion);
			// on appelle la méthode d’instance "auTravail()
			System.out.println("Veuillez saisir le nombre des cartons à transporter: ");
			int nbCartons = sc.nextInt();
//		System.out.println("Vous avez saisi le nombre : " + nbCartons);
			dem.auTravail(nbCartons);
		}

	}
}
