package com.PremierTp.start;
import java.util.Scanner;

import com.PremierTp.Math.Mathematique;
import com.PremierTp.vetements.Pantalon;

public class Start {

	public static void main(String[] args) {
		/*
		Pantalon monPantalon = new Pantalon (); //il faut le mettre dans le mm package que la classe de pantalon : on va importer un package
		// stocké dans la pile = stocké dans le tas
		Pantalon monPantalon2 = new Pantalon ();
		Pantalon monPantalon3 = new Pantalon ();
		
		monPantalon.couleur ="bleue";
		monPantalon.taille = 45;
		monPantalon.longueur = 180;
		
		monPantalon.plier (): //marche car on appelle depuis la classe
		
		monPantalon2.couleur ="noir";
		monPantalon2.taille = 45;
		monPantalon2.longueur = 180;
		
		monPantalon3.couleur ="bleue";
		monPantalon3.taille = 45;
		monPantalon3.longueur = 180;
		
		System.out.println("mon pantalon est " + monPantalon.couleur);
		*/
		
		
		//implementation de scanner
		
		
		int value=0;
		
		
		Scanner sc = new Scanner(System.in); // L'initialisation de l'objet Scanner. System.in = l'entrée
		System.out.println("Veuillez saisir un nombre :");
		nb= sc.nextLong(); //pour lire un entier : next.Int(), on récupere notre nombre
		
		Start.afficher(nb); // pad de this car on est en mode static et on met this dans les class
		
	}
	
	public static void afficher (int value) {
		
		Mathematique util = new Mathematique ();
		
		util.factorielle(value);
		util.fibonacci(value);
		util.isPremier(value);
		
	}
}
