package Liste;

public class Utilities {

	public static void attaquer(MaListe <? extends Personnage> groupe, Personnage marcel ){
		for(Personnage quiTape: groupe.printAll()){
			quiTape.attaquer(marcel);
		}
	}
}
