package Liste;
import Liste.MaListe;
import Liste.Personnage;

public class Start2 {

	
		public static void main(String[] args) throws Exception {
			
			MaListe <Homme> mesPerso = new MaListe <Homme>();
			//MaListe <Integer> liste2 = new MaListe <Integer>();
			
			for (int i=0; i<50;i++){
				mesPerso.add(new Homme());
			}
			
			Personnage marcel = new Personnage();
			marcel.setNbrePt(10);
			
			Utilities.attaquer(mesPerso, marcel);
			
			
			/*
			int result = 0;
			for(Integer i : liste.printAll()){
				result+=i;
			}
			for(Integer i : liste.printAll()){
				System.out.println(i);
			}
			*/
			/*liste.delete(2);
			System.out.println("----------------------------");
			for(Integer i : liste.printAll()){
				System.out.println(i);
			}
			liste.delete(2);
			System.out.println("----------------------------");
			for(Integer i : liste.printAll()){
				System.out.println(i);
			}
			liste.delete(2);
			System.out.println("----------------------------");
			for(Integer i : liste.printAll()){
			System.out.println(i);
			}
		*/
			
		}
	
	}
