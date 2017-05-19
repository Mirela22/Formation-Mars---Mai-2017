package com.jeu2;
//import com.jeu2.RunImpl;
import com.jeu2.Personnage;
public class Start {

	public static void main(String[] args) {
		
		Personnage joueur1 = new Personnage("Joueur1",200);
		Personnage joueur2 = new Personnage("Joueur2",200);
		
		Attaquer attaque1 = new Attaquer (joueur1,joueur2);
		Attaquer attaque2 = new Attaquer (joueur2,joueur1);
		Guerir soin = new Guerir (joueur1);
		/*
		new Thread(attaque1).start();
		new Thread(soin).start();
		*/
		Thread t1 = new Thread(attaque1);
		Thread t3 = new Thread(attaque2);
		Thread t2 = new Thread(soin);
		t1.start();
		t3.start();
		t2.start();
		
		//RunImpl Attaquer = new RunImpl(joueur1, joueur2);
		//RunImpl Guerir = new RunImpl(joueur1, joueur2);
		//RunImpl RNI2 = new RunImpl(joueur2, joueur1);
		//new Thread(Attaquer).start();
		//new Thread(Guerir).start();
		//new Thread(RNI2).start();
		
		/*if ( ){
			System.out.println("-----FIN-------");
		
			joueur1.resultat(joueur1, joueur2);
			} 
			*/
		}
	}
		

