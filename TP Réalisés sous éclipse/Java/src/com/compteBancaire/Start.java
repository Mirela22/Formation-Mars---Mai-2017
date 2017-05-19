package com.compteBancaire;
import com.compteBancaire.Compte;
import java.util.Scanner;

import java . util . Enumeration ;
import java . util . Hashtable ;


public class Start {

	public static void main(String[] args) {
		
		//création des comptes
		Hashtable < String , Integer > compte1 = new Hashtable < String , Integer > ();
		compte1.put("1", 10000);
		compte1.put("2", 2000);
		compte1.put("3", 45054);
		
		Enumeration<Integer> e = compte1.elements();
		
		/*while(e.hasMoreElements()){
		    System.out.println(e.nextElement());
		}*/
		//System.out.println("___________________________________");

		//System.out.println(compte1.size());
		//System.out.println(compte1.get("1"));
		
		//System.out.println("___________________________________");
		
		/*for (String itm : compte1.keySet()){
			System.out.println(itm);
		}*/
		/*System.out.println("___________________________________");
		for (String itm : compte1.keySet()){
			System.out.println(itm + " " + compte1.get(itm) );
			compte1.get(itm);
		}*/
		//nouveauCompte1(00003737,10057,14169, 1);
		//nouveauCompte1.compte_clef = compte1.keys();
		
		for (String itm : compte1.keySet()){
			System.out.println("le compte numero : " + itm + " possède un solde de " + compte1.get(itm) );
			compte1.get(itm);
		}
		
		System.out.println("______________Nouveau compte_______________");
		
		Compte nouveauCompte1 = new Compte  ();
		nouveauCompte1.solde = compte1.get("1");
	
		System.out.println("Le solde du compte 1 est : " + nouveauCompte1.solde);
		
		//fonction déposer de l'argent
		Scanner sc = new Scanner(System.in); 
		System.out.println("Veuillez saisir la somme à déposer :");
		int nb = sc.nextInt();
		nouveauCompte1.deposer(nb);
		System.out.println("Le nouveau solde du compte 1 est : " + nouveauCompte1.solde);
		
		//fonction retirer de l'argent
		Scanner sc2 = new Scanner(System.in); // L'initialisation de l'objet Scanner. System.in = l'entrée
		System.out.println("Veuillez saisir la somme à retirer :");
		int nb2 = sc2.nextInt();
		nouveauCompte1.retirer(nb2);
		System.out.println("Le nouveau solde du compte 1 est : " + nouveauCompte1.solde);
		
		
		
		
		
		
	}
}


