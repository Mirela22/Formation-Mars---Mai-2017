package com.wow.race;

import com.wow.personnage.Personnage;

public class Humain extends Personnage{
	

	public Humain (String nom, int ptVie, int ptSpe){
		super(nom, ptVie, ptSpe);
	}

	@Override

	public String parler () {
		return super.parler()+"et je suis un orc";
	}
	

}


	
	

