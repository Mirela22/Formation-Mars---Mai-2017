package com.compteBancaire;

public class Compte {
	
	Integer nocompte;
	Integer solde;
	
	public Compte(){
	}
	


	public Integer getNocompte() {
		return nocompte;
	}

	public void setNocompte(Integer nocompte) {
		this.nocompte = nocompte;
	}

	public Integer getSolde() {
		return solde;
	}

	public void setSolde(Integer solde) {
		this.solde = solde;
	}
	void deposer(Integer montant){
		solde=solde+montant;
		
	}
	void retirer (Integer montant){
		solde=solde-montant;
	}

}
