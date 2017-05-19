package com.compteBancaireG;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//import java.util.Scanner;



import com.compteBancaire2.Banque;
import com.compteBancaire2.Mouvements;


public class Start {

	public static void main(String[] args) {
		
		//initialisation de la map et de la liste
		Map<Integer, Integer> listedescomptes = new HashMap<Integer,Integer>();
		ArrayList<Mouvements> laListeDesMouvements = new ArrayList <Mouvements>();
		Banque banque = new Banque (listedescomptes, laListeDesMouvements);
	
		/*//une autre façon de faire : 
		 Banque banque = new Banque (listedescomptes);
		 banque.setLaListeDesMouvements(laListeDesMouvements);
		  */
		
		//création des comptes avec (cle, solde du compte)
		System.out.println(" ");
		
		banque.creation(1,4000);
		banque.creation(2,50);
		banque.creation(3,75450);
		banque.creation(4,4540);
		banque.creation(5,1000);
		banque.creation(15,1000);
		
		
		//Liste des différents comptes créés avec leur solde
		System.out.println(" ");
		System.out.println("-- Les soldes des comptes  --");
		
		for (Integer cle : listedescomptes.keySet()){
			System.out.println("le compte numero : " + cle + " possède un solde de " + listedescomptes.get(cle) );		
		}
		
		//application des fonctions ajouter et retirer de l'argent
		banque.ajouter(5,45);
		banque.ajouter(1,450);
		banque.ajouter(15,45455);
		banque.retirer(3,5000);
		banque.retirer(4,300);
		banque.retirer(15,455);
		//on affiche les soldes des comptes apres les transactions
		
		System.out.println(" ");
		System.out.println("-- Les soldes des comptes après les transactions --");

		for (Integer cle : listedescomptes.keySet()){
			System.out.println("le compte numero : " + cle + " possède un solde de " + listedescomptes.get(cle) );		
		}
						
		
		//affichage des elements mouvements de la liste qui contient tout l'historique des transactions
		
		System.out.println("-- L'historique --");
		
		for(Integer i=0; i<laListeDesMouvements.size();i++){
			System.out.println(" _____________");
			System.out.println("Le compte n°: " + banque.laListeDesMouvements.get(i).getNoCompte() + " possèdait un ancien solde de : " + banque.laListeDesMouvements.get(i).getAncienSolde());
			System.out.println("Il a été débité de : " + banque.laListeDesMouvements.get(i).getDebit() + " "+ "et/ou crédité de : " + banque.laListeDesMouvements.get(i).getCredit()); 
			System.out.println("Le nouveau solde du compte est :" +  banque.laListeDesMouvements.get(i).getNouveauSolde());
			System.out.println("le : " + banque.laListeDesMouvements.get(i).getDateVirement());
			
		}
	
		
	}
}	
	



