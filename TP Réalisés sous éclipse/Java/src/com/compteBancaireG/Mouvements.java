package com.compteBancaireG;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Mouvements <T> {
	//declaration 
	T  noCompte;
	Integer ancienSolde;
	Integer  debit;
	Integer credit;
	Integer nouveauSolde;
	String  dateVirement;
	
	//constructeurs

	public Mouvements (T  noCompte,Integer ancienSolde,Integer debit,Integer credit,Integer nouveauSolde,String dateVirevement){
		this.noCompte=noCompte;
		this.ancienSolde=ancienSolde;
		this.debit=debit;
		this.credit=credit;
		this.nouveauSolde=nouveauSolde;
		this.dateVirement= new SimpleDateFormat("yyyy.MM.dd à HH:mm:ss").format(Calendar.getInstance().getTime());
	}
	
	//les getters et ls setters
	public String getDateVirement() {
		return dateVirement;
	}
	public void setDateVirement(String dateVirement) {
		this.dateVirement = dateVirement;
	}

	public T getNoCompte() {
		return noCompte;
	}

	public void setNoCompte(T noCompte) {
		this.noCompte = noCompte;
	}

	public Integer getAncienSolde() {
		return ancienSolde;
	}

	public void setAncienSolde(Integer ancienSolde) {
		this.ancienSolde = ancienSolde;
	}

	public Integer getDebit() {
		return debit;
	}

	public void setDebit(Integer debit) {
		this.debit = debit;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public Integer getNouveauSolde() {
		return nouveauSolde;
	}

	public void setNouveauSolde(Integer nouveauSolde) {
		this.nouveauSolde = nouveauSolde;
	}


	

}
