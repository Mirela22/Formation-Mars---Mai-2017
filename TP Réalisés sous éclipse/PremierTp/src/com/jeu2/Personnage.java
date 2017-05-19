package com.jeu2;

import java.util.Random;

public class Personnage {

		String nom;
		int ptVie;
		
		public Personnage () {
		}
		
		public Personnage (String nom, int ptVie){
			this.nom = nom;
			this.ptVie = ptVie;
					}
		
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public int getPtVie() {
			return ptVie;
		}
		public void setPtVie(int ptVie) {
			this.ptVie = ptVie;
		}
	
		public synchronized void  attaquer(Personnage victime){
			System.out.println("--------------------");
			System.out.println("Les points de vie du " + victime.getNom()+ " sont de : " + victime.getPtVie());
			
			Random rand = new Random();
			int valeur = rand.nextInt(100 - 0 + 1) + 0;
			//int valeur = 10;
			int ptVie = victime.getPtVie();
			this.ptVie=ptVie-valeur;
			victime.setPtVie(this.ptVie);
			System.out.println(victime.getNom() + " est attaqué de "+ valeur + ". Ses points de vie sont de : " + victime.getPtVie());
			System.out.println("--------------------");	
		}
		
		public synchronized void guerir(Personnage victime){
			System.out.println("--------------------");
			Random rand = new Random();
			int soin = rand.nextInt(100 - 0 + 1) + 0;
			//int soin = 5;
			this.ptVie=ptVie+soin;
			victime.setPtVie(this.ptVie);
			System.out.println("La guérison de " + victime.getNom() +  " est de "+ soin + " et les points de vie sont de : " + this.ptVie);
			System.out.println("--------------------");		
		}
		
		public synchronized void resultat(Personnage joueur1, Personnage joueur2){
			if ( joueur1.getPtVie()> joueur2.getPtVie()){
				System.out.println(joueur1.getNom() + " a gagné");
			}
			else { System.out.println(joueur2.getNom() + " a gagné");
			}			
		}

		
}
