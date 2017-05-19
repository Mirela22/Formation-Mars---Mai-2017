package com.wow.jeu;

public abstract class Personnage { // par le droit de faire new
	String nom; 
	int ptVie;
	int ptSpe;
	
	public Personnage () {
	}
	
	
	public Personnage (String nom, int ptVie, int ptSpe){
		this.nom = nom;
		this.ptVie = ptVie;
		this.ptSpe = ptSpe ; 
		
	}
	
	
	public abstract String parler(); // je dois implementer la methode parler dans la classe fille, 
	
	
	
	public String getNom() {
		return nom;}
	public void setName(String nom) {
		this.nom = nom;}
	public int getPtVie() {
		return ptVie;}
	public void setPtVie(int ptVie) {
		this.ptVie = ptVie;}
	public int getPtSpe() {
		return ptSpe;}
	public void setPtSpe(int ptSpe) {
		this.ptSpe = ptSpe;} 

}
