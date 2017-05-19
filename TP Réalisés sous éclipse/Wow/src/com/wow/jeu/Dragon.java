package com.wow.jeu;

public class Dragon extends Personnage implements IAttaquer {

	@Override
	public String parler() {

		return "Jr suis un dragon";
	}

	public void attaquer() {
		System.out.println("j'attaqueeeeeeeeee(le dragon)");
		
	}


	
	

	public Dragon(String nom, int ptVie, int ptSpe) {
		super(nom, ptVie, ptSpe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "d1 est un dragon avec 45 vies  sts";
	}

	

}
