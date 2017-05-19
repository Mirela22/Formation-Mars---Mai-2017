package com.compteBancaireG;
import com.compteBancaireG.Mouvements;

import java.util.ArrayList;
//import java.util.Date;
import java.util.Map;

public class Banque <T> {
	
		//déclaration de la map (pour la liste des comptes) et de la liste des historiques
		Map<T,Integer> listedescomptes;
		ArrayList<Mouvements> laListeDesMouvements;
		
		//Le constructeur de la classe Banque
		public Banque (Map<T, Integer> listedescomptes ,ArrayList<Mouvements> laListeDesMouvements){
			this.laListeDesMouvements=laListeDesMouvements;
			this.listedescomptes =listedescomptes;	
		}

		
		//fonction creation des comptes
		public void creation(T cle, Integer valeur){
			listedescomptes.put(cle, valeur);
		}
	
		//fonction ajout d'argent
		public void ajouter(T cle, Integer montant){
			Integer solde =this.listedescomptes.get(cle);
			Integer new_solde=solde+montant;
			this.listedescomptes.put(cle, new_solde);
			Mouvements<T> mouvement = new Mouvements<T>(cle,solde,0, montant, new_solde,"");
			this.laListeDesMouvements.add(mouvement);
		}
		
		//fonction retirer d'argent
		public void retirer(T cle, Integer montant){
			Integer solde =this.listedescomptes.get(cle);
			Integer new_solde=solde-montant;
			this.listedescomptes.put(cle, new_solde);
			Mouvements<T> mouvement = new Mouvements<T>(cle,solde,montant, 0, new_solde,"");
			this.laListeDesMouvements.add(mouvement);	
		}

//Les getters et les setters
		public Map<T, Integer> getListedescomptes() {
			return listedescomptes;
		}


		public void setListedescomptes(Map<T, Integer> listedescomptes) {
			this.listedescomptes = listedescomptes;
		}



		public ArrayList<Mouvements> getLaListeDesMouvements() {
			return laListeDesMouvements;
		}


		public void setLaListeDesMouvements(ArrayList<Mouvements> laListeDesMouvements) {
			this.laListeDesMouvements = laListeDesMouvements;
		}

		

		
}
