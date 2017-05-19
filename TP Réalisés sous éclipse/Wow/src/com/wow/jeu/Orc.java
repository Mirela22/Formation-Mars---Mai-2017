package com.wow.jeu;

public class Orc extends Personnage implements IGuerrir {

	public Orc() {
	}



	public Orc(String nom, int ptVie, int ptSpe) {
		super(nom, ptVie, ptSpe);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String parler() {
		// TODO Auto-generated method stub
		return "Je suis un Orc";
	}


	public void guerrir() {
		System.out.println("L'orc gueris");
	}
	// Orc = la classe fille de pesonnage 
	
	
	

}
