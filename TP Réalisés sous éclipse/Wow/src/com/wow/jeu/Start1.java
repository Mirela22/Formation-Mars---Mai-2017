package com.wow.jeu;

import java.awt.List;
import java.util.ArrayList;



public class Start1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Orc monOrc = new Orc("Orc1", 12, 5);
		Orc monOrc2 = new Orc("Orc2", 12, 5);
		Orc monOrc3 = new Orc("Orc3", 12, 5);
		Orc monOrc4 = new Orc("Orc4", 12, 5);
		
		

		System.out.println(monOrc.getNom());
		monOrc.guerrir();
		
		Dragon d1 = new Dragon("Dragi1",12,45);
		Dragon d2 = new Dragon ("drago", 12,45);
		Dragon d3 = new Dragon ("Drago32",12,78);
		Dragon d4 = new Dragon ("drago4",69,78);
		
		
		d1.attaquer();
		
		Homme h1 = new Homme ("Homme1",45,12);
		Homme h2 = new Homme ("Homme2",45,12);
		Homme h3 = new Homme ("Homme3",45,12);
		Homme h4 = new Homme ("Homme4",45,12);
		Homme h5 = new Homme ("Homme5",45,12);
		
		System.out.println(h1.getNom());
		
		/*ArrayList<Personnage> List = new ArrayList<Personnage> (); //on aurrait pu remplacer IAttaquer par Personnage
		List.add(new Orc ("Un", 130,130));
		List.add(new Orc ("Deux", 150,160));
		List.add(new Humain ("trois", 150,160));
		
		for (Personnage element : List){
			if (element instanceof IAttaquer){
				(IAttaquer)element.attaquer();
			System.out.println(element.getNom()+"a attaqué");
			else {
				System.out.println(element.getNom()+"ne peut pas attaquer");
		
			}
		}*/
	}

}
