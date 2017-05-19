package com.compteBancaire2;
import java.util.ArrayList;
//import java.util.Date;
import java.util.Map;

import com.compteBancaire2.Mouvements;
public class Banque {
	
		//déclaration de la map (pour la liste des comptes) et de la liste des historiques
		Map<Integer,Integer> listedescomptes;
		public ArrayList<Mouvements> laListeDesMouvements;
		
		//Le constructeur de la classe Banque
		public Banque (Map<Integer, Integer> listedescomptes ,ArrayList<Mouvements> laListeDesMouvements){
			this.laListeDesMouvements=laListeDesMouvements;
			this.listedescomptes =listedescomptes;	
		}

		
		//fonction creation des comptes
		public void creation(int cle, int valeur){
			listedescomptes.put(cle, valeur);
		}
	
		//fonction ajout d'argent
		public void ajouter(int cle, int montant){
			int solde =this.listedescomptes.get(cle);
			int new_solde=solde+montant;
			this.listedescomptes.put(cle, new_solde);
			Mouvements mouvement = new Mouvements(cle,solde,0, montant, new_solde,"");
			this.laListeDesMouvements.add(mouvement);
		}
		
		//fonction retirer d'argent
		public void retirer(int cle, int montant){
			int solde =this.listedescomptes.get(cle);
			int new_solde=solde-montant;
			this.listedescomptes.put(cle, new_solde);
			Mouvements mouvement = new Mouvements(cle,solde,montant, 0, new_solde,"");
			this.laListeDesMouvements.add(mouvement);	
		}

		//Les getters et les setters
		public Map<Integer, Integer> getListedescomptes() {
			return listedescomptes;
		}
		public void setListedescomptes(Map<Integer, Integer> listedescomptes) {
			this.listedescomptes = listedescomptes;
		}
		public ArrayList<Mouvements> getLaListeDesMouvements() {
			return laListeDesMouvements;
		}
		public void setLaListeDesMouvements(ArrayList<Mouvements> laListeDesMouvements) {
			this.laListeDesMouvements = laListeDesMouvements;
		}
		
}
