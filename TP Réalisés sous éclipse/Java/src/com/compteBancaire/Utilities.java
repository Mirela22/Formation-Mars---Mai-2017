package com.compteBancaire;
import com.compteBancaire.Compte;

public class Utilities <T> {
	Integer solde;
	
	public Utilities(){
	}
	
	void deposer(Integer montant){
		solde=solde+montant;
	}
	void retirer (Integer montant){
		solde=solde-montant;
	}


}
