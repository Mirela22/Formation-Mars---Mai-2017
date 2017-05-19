package com.wow.start;


import com.wow.personnage.Personnage;
import com.wow.race.Humain;
import com.wow.race.Orc;



public class Start {

	public static void main(String[] args) {
	
		
		
		/*Personnage persoOrc = new Personnage ();
		
		persoOrc.setNom("Grrr");
		persoOrc.setRace("Org");
		persoOrc.setPtSpe(5);
		persoOrc.setPtVie(2);
		
		System.out.println("Bonjour, je m'appele "+persoOrc.getNom()+ " et je suis un " +persoOrc.getRace());
		
		Personnage humain = new Personnage ();
		humain.setNom("Josiane");
		humain.setRace("humain");
		humain.setPtSpe(6);
		humain.setPtVie(10);
		
		System.out.println("Bonjour, je m'appele "+ humain.getNom()+ " et je suis un " + humain.getRace());
		
		Personnage humain2 = new Personnage ( "José", "humain", 5, 45 );
		System.out.println("Bonjour, je m'appele "+ humain2.getNom()+ " et je suis un " + humain2.getRace());
		
		Personnage humain3 = new Personnage ();
		System.out.println("Bonjour, je m'appele "+ humain3.getNom()+ " et je suis un " + humain3.getRace());
		humain3.setNom("Fanta");
		humain3.setRace("humain");
		System.out.println("Bonjour, je m'appele "+ humain3.getNom()+ " et je suis un " + humain3.getRace());
		
		Personnage dragon = new Personnage ("dragon");
		System.out.println("Je suis un " + dragon.getRace());

		Personnage Mirela = new Personnage ( "humain", "Mirela");
		System.out.println("Bonjour, je m'appele "+ Mirela.getNom()+"Je suis un " + Mirela.getRace());
		
		dragon.parler();
		dragon.parler("Ma race est dragon, "); // on fait parler nos personnages */
		
		/*Humain Mirela = new Humain( "Mirela", 8,5);
		System.out.println("Bonjour, je m'appele "+ Mirela.getNom()+" J'ai " + Mirela.getPtVie()+ "vie");
		
		System.out.println(Mirela.parler());*/
		
		Orc monOrc = new Orc("Freddy", 120,130);
		System.out.println(monOrc.parler());
		//System.out.println(monOrc);
		
		
		
		
	}

}
