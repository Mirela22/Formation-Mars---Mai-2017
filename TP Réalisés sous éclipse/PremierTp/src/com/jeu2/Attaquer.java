package com.jeu2;
import com.jeu2.Personnage;

public class Attaquer implements Runnable {
		
			Personnage attaquant;
			Personnage victime;
		
			public Attaquer (Personnage attaquant, Personnage victime){
				this.attaquant=attaquant;
				this.victime=victime;
			}
					
		public void run() {
			
			for (int i =0; i<5; i++){
				
				attaquant.attaquer(victime);
				/*if (victime.getPtVie() <=0){
					System.out.println(victime.getNom() + " a perdu" + attaquant.getNom()+ "a gagné");
					break;
				}
				else {continue;}*/
			
				try {
					Thread.sleep(5000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
}

