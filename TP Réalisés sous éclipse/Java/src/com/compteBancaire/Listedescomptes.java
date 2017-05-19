package com.compteBancaire;

import java.util.Map;

public class Listedescomptes {
	
	Map<Integer,Integer> listedescomptes;
	
	//mon constructeur
	public Listedescomptes (Map<Integer,Integer> listedescomptes){
		this.listedescomptes =listedescomptes;		
	}

	public Map<Integer, Integer> getListedescomptes() {
		return listedescomptes;
	}
	public void setListedescomptes(Map<Integer, Integer> listedescomptes) {
		this.listedescomptes = listedescomptes;
	}
	
	//la creation des comptes

	public void creation(int cle, int valeur){
		listedescomptes.put(cle, valeur);
	}
		
	//ajout d'argent
	public void ajouter(int cle, int montant){
		int solde =this.listedescomptes.get(cle);
		solde=solde+montant;
		this.listedescomptes.put(cle, solde);
	}
	
	//retirer d'argent
	public void retirer(int cle, int montant){
		int solde =this.listedescomptes.get(cle);
		solde=solde-montant;
		this.listedescomptes.put(cle, solde);
	
	}
	
	
	}


