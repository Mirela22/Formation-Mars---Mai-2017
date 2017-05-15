import java.util.Scanner; //on importe la classe servant à scanner de Java, on importe l'objet scanner du package java
// import java.lang.Math;  pour les valeurs négatives

class Factorielle{

	public static void main(String[] args){
		


		
		long nb; // le nombre a entrer
		
		Scanner sc = new Scanner(System.in); // L'initialisation de l'objet Scanner. System.in = l'entrée
		System.out.println("Veuillez saisir un nombre :");
		nb= sc.nextLong(); //pour lire un entier : next.Int(), on récupere notre nombre
		System.out.println("Vous avez saisi le nombre : " + nb);

		
		
		Long factorielle = nb; //on déclare un entier qui servira à donner le résultat

			if ( nb !=0 ){   //Si le nombre dont cherche la factorielle est différent de 0 on fait :
				while (nb >1) { //tant que ton nombre est supérieur à 1
					nb=nb-1; //on enlève une unité à ce nombre
					factorielle = factorielle*nb; //on multiplie la factorielle par le (nombre-1 unité)
				}
			}

		System.out.println(factorielle);
	}
}
