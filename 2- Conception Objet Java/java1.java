package com.PremierTp.start;
import java.util.Scanner;
import com.PremierTp.vetements.Pantalon;

public class Start {

	public static void main(String[] args) {
		
		Pantalon monPantalon = new Pantalon (); //il faut le mettre dans le mm package que la classe de pantalon : on va importer un package
		
		System.out.println("Hello, the world !");
		

		long nb; 
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Veuillez saisir un nombre :");
		nb= sc.nextLong();
		System.out.println("Vous avez saisi le nombre : " + nb);

		
		long factorielle = nb; 
			if ( nb !=0 ){   
				while (nb >1) { 
					nb=nb-1; 
					factorielle = factorielle*nb; 
				}
			}

		System.out.println(factorielle);
		
		
		int a,b,c;
		c=1;

			
			for (int i=3; i<=13 ; i++) { 
			a=i-1;
			b=i-2;
			c=c+a+b;

			}
			System.out.println("lenombre de couples de lapin à 12 mois est de:"+ c);
	}
}