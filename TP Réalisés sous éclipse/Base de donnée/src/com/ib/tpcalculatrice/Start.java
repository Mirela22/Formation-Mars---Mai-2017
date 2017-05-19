package com.ib.tpcalculatrice;
import java.util.Scanner;
import com.ib.tpcalculatrice.Calculs;
import com.ib.tpcalculatrice.TestException;

public class Start {
	

	public static void main(String[] args) throws TestException, DivException, PremierException {
		
		Scanner sc1 = new Scanner(System.in); 
		System.out.println("Veuillez saisir le signe de l'opération désirée : \n 1 pour addition \n 2 pour une soustraction\n 3 pour une division \n 4 pour une multiplication \n 5 pour la factorielle \n 6 pour le nombre premier ");
		int a= sc1.nextInt();
				
		Scanner sc = new Scanner(System.in); 
		int nb1, nb2;
			
		Calculs op = new Calculs ();
		
		switch (a){
			case 1: a=1;
				System.out.println("Veuillez saisir un nombre 1 :");
				nb1= sc.nextInt();
				System.out.println("Veuillez saisir un nombre 2 :");
				nb2= sc.nextInt();
				System.out.println("addition " +op.addition(nb1,nb2));
				break;
				
			case 2: a=2;
				System.out.println("Veuillez saisir un nombre 1 :");
				nb1= sc.nextInt();
				System.out.println("Veuillez saisir un nombre 2 :");
				nb2= sc.nextInt();
				System.out.println("Soustraction " +op.soustraction(nb1,nb2));
				break;
			case 3: a=3;
				System.out.println("Veuillez saisir un nombre 1 :");
				nb1= sc.nextInt();
				System.out.println("Veuillez saisir un nombre 2 :");
				nb2= sc.nextInt();
				op.division(nb1,nb2);
				break;
			case 4: a=4;
				System.out.println("Veuillez saisir un nombre 1 :");
				nb1= sc.nextInt();
				System.out.println("Veuillez saisir un nombre 2 :");
				nb2= sc.nextInt();
				System.out.println("multiplication " +op.multiplication(nb1,nb2));
				break;
			case 5: a=5;
				System.out.println("Veuillez saisir un nombre 1 :");
				nb1= sc.nextInt();
				System.out.println("facto " + op.factorielle(nb1));
				break;
			case 6: a=6;
				System.out.println("Veuillez saisir un nombre 1 :");
				nb1= sc.nextInt();
				if (op.isPremier(15) == true ){System.out.println("Premier");}
				else { System.out.println("Pas premier");}
				break;
				
		}
		
		
	
		sc1.close();
		sc.close();
	
		
		} 

}
