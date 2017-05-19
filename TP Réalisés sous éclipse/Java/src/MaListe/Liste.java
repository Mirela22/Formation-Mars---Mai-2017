/*package MaListe;


public class Liste {
	
		Item first;
		Item last;
		int lenght;
		
		class Item{
			Item precedent;
			Item suivant;
			Object valeur;
							
			public Object getPrecedent() {
				return precedent;
			}
			public void setPrecedent(Item precedent) {
				this.precedent = precedent;
			}
			public Object getSuivant() {
				return suivant;
			}
			public void setSuivant(Item suivant) {
				this.suivant = suivant;
			}
			public Object getValeur() {
				return valeur;
			}
			public void setValeur(Object valeur) {
				this.valeur = valeur;
			}
			
			
			public Item(){
			}
			
			
			public Item(Item precedent, Item suivant, Object valeur){
				this.valeur=valeur;
				this.precedent=precedent;
				this.suivant=suivant;
			}
		}
	
	public Liste(){
	}
		
	public void add(Object valeur){
		
		Item newItem = new Item();
		newItem.setValeur(valeur);
		
				
				
				if ( this.first == null){
				
					this.first = newItem;
					this.last= newItem;
					newItem.suivant=this.last;
					this.lenght++;
					
					//first.setPrecedent(null);
					//irst.setSuivant(null);
				}
			        
			    else{
			         newItem.setPrecedent(last);
			         newItem.setSuivant(null);
			         last = newItem;
				
			    }
				
				
				
				
	}
	
	public int valueOf(int index){
		if(index>this.lenght || index<0)
			
			throw new Exception ("index hors de porté");
		
		Item cursor = this.first;
		if(index ==00)
			return this.first.getValeur();
			return cursor.getValeur();
		
		for (int i=0; i<index; i++){
			cursor = cursor.getSuivant();
		}
		
	}
	
	public void ArrayList<Integer> printAll(){
		ArrayList<Integer> tailletour = new ArrayList<Integer>();
		Item cursos = null;
		for (int i =0; i<=this.lenght;i++){
			if(cursor ==null){
				cursor=this.first;
				continue;
			}
			cursor = cursor.getSuivant():
				tabRetour.add(arg0);
		}
	}
	
	private Item ItemOf(int index){
		return null
	}
	
	public void delete(int index) throws Exception{
				Item cursor = this.itemOf(index);
			if(cursor.getPrecedent()!=null)
				cursor.getPrecedent().setSuivant(cursor.getSuivant());
			
			if(cursor.getSuivant()!=null)
				cursor.getSuivant().setPrecedent(cursor.getPrecedent());
			cursor = null;
			this.length--;
		}
	
	public Item getFirst() {
		return first;
	}
	public void setFirst(Item first) {
		this.first = first;
	}
	public Item getLast() {
		return last;
	}
	public void setLast(Item last) {
		this.last = last;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	
	
}*/