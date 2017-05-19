package com.jeu2;
import com.jeu2.Personnage;

public class RunImpl implements Runnable {
	
		Personnage attaquant;
		Personnage victime;
	
					
		public RunImpl (Personnage attaquant, Personnage victime){
			this.attaquant=attaquant;
			this.victime=victime;
			
		}
		
		
	public void run() {
		
		int nombrePartie=4;
		
		try {
			for (int i =0; i<nombrePartie; i++){
				System.out.println("--------------------");
				attaquant.attaquer(victime);
				Thread.sleep(2000);
				
				if (victime.getPtVie() <=0){
					System.out.println(victime.getNom() + " a perdu" + attaquant.getNom()+ "a gagné");
					break;
				}
				else {victime.guerir(victime);}
				
				victime.attaquer(attaquant);
				if (attaquant.getPtVie() <=0){
					System.out.println(attaquant.getNom() + " a perdu" + victime.getNom()+ "a gagné");
					break;
				}
				else {attaquant.guerir(attaquant);}
				
			}
		}catch (InterruptedException e) {
				e.printStackTrace();
				}
		}
		
	}
