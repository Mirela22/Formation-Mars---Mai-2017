package com.wow.personnage;


public class Personnage {


	protected String nom;
	protected int ptVie;
	protected int ptSpe;
	
	public Personnage () {
	}
	
	public Personnage (String nom, int ptVie, int ptSpe){
		this.nom = nom;
		this.ptVie = ptVie;
		this.ptSpe = ptSpe ; 
	}
	
	public String parler(){
		return parler();
	} 
	
	
	
	/*
	public Personnage(String nom, String race, int ptVie, int ptSpe){
		this.nom = nom;
		this.race = race;
		this.ptVie = ptVie;
		this.ptSpe = ptSpe ; 
	} // un constructeur avec arguments
	
	public Personnage (){
		nom = "inconnu";
		//race = "inconnu";
		ptVie = 0;
		ptSpe =0; */
	 //un constructeur sans argument
	
	/*public Personnage (String race) {
		this.race = race; //dragon avc surcharge
	
	}*/
	/*
	public Personnage (String race, String nom) {
		this.race = race; //dragon avc surcharge
		this.nom = nom;
	}//surcharge avc plusieurs paramètres
	
	public String parler(){
		return super.parler;
	} // une fonction qui permet de parler mais sans arguments
	
	public void parler (String phrase){
		System.out.println (phrase + "voilà ce que je suis");
	}// une fonction qui permet de parler
	
	public String parler1 (String phrase1){
		return phrase1 + "voilà ce que je suis";
	}
	
	*/
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	/*public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}*/
	public int getPtVie() {
		return ptVie;
	}
	public void setPtVie(int ptVie) {
		this.ptVie = ptVie;
	}
	public int getPtSpe() {
		return ptSpe;
	}
	public void setPtSpe(int ptSpe) {
		this.ptSpe = ptSpe;
	}
	
	
}
