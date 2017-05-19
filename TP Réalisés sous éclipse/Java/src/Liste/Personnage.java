package Liste;

public class Personnage {
	
	int nbrePt = 10;
	
	public Personnage(){
	}
		
	 public void attaquer(Personnage perso){
		 perso.nbrePt--;
	 }

		public int getNbrePt() {
			return nbrePt;
		}
		public void setNbrePt(int nbrePt) {
			this.nbrePt = nbrePt;
		}

	
 
}
