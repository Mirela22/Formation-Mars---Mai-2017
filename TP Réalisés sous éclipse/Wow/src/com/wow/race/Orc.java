package com.wow.race;
import com.wow.personnage.Personnage;
import com.wow.personnage.iInterface;


public class Orc extends Personnage implements iInterface {
	

		public Orc (String nom, int ptVie, int ptSpe){
			super(nom, ptVie, ptSpe);
		}
	
		@Override
	
		public String parler () {
			return super.parler()+"et je suis un orc";
		}

		public void attaquer() {
			// TODO Auto-generated method stub
			
		}
		
	
}

