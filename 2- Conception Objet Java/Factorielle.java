import java.util.Scanner; //on importe la classe servant � scanner de Java, on importe l'objet scanner du package java
// import java.lang.Math;  pour les valeurs n�gatives

class Factorielle{

	public static void main(String[] args){
		


		
		long nb; // le nombre a entrer
		
		Scanner sc = new Scanner(System.in); // L'initialisation de l'objet Scanner. System.in = l'entr�e
		System.out.println("Veuillez saisir un nombre :");
		nb= sc.nextLong(); //pour lire un entier : next.Int(), on r�cupere notre nombre
		System.out.println("Vous avez saisi le nombre : " + nb);

		
		
		Long factorielle = nb; //on d�clare un entier qui servira � donner le r�sultat

			if ( nb !=0 ){   //Si le nombre dont cherche la factorielle est diff�rent de 0 on fait :
				while (nb >1) { //tant que ton nombre est sup�rieur � 1
					nb=nb-1; //on enl�ve une unit� � ce nombre
					factorielle = factorielle*nb; //on multiplie la factorielle par le (nombre-1 unit�)
				}
			}

		System.out.println(factorielle);
	}
}
