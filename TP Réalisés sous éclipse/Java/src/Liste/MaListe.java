package Liste;
import java.util.ArrayList;

	public class MaListe <T> {
		Item root;
		Item last;
		int length;

		public Item getRoot() {
			return root;
		}
		private void setRoot(Item root) {
			this.root = root;
		}
		public Item getLast() {
			return last;
		}
		private void setLast(Item last) {
			this.last = last;
		}
		public int getLength() {
			return length;
		}
		private void setLength(int length) {
			this.length = length;
		}

		public MaListe(){}
		
		public void delete(int index) throws Exception{
			Item cursor = this.itemOf(index);
			if(cursor.getPrecedent()!=null)
				cursor.getPrecedent().setSuivant(cursor.getSuivant());
			
			if(cursor.getSuivant()!=null)
				cursor.getSuivant().setPrecedent(cursor.getPrecedent());
			cursor = null;
			this.length--;
		}
		public void add(T valeur){
			Item newItem = new Item(valeur);
			
			if(this.root==null){
				this.root = this.last = newItem;
				return;
			}
			Item cursor = this.last;
		
			this.last = newItem;
			newItem.precedent = cursor;
			cursor.suivant = newItem;
			
			this.last = newItem;
			
			this.length++;
			}
		
		public ArrayList <T> printAll(){
			ArrayList<T> tabRetour = new ArrayList<T>(); 
			Item cursor = null;
			for(int i = 0; i<=this.length; i++){
				if(i==0){
					cursor = this.root;
					tabRetour.add(cursor.getValeur());
					continue;
				}
				cursor = cursor.getSuivant();
				tabRetour.add(cursor.getValeur());
			}
			
			return tabRetour;
		}

		private Item itemOf(int index) throws Exception{
			if(index > this.length || index < 0 || (this.root == null))
					throw new Exception("Index hors de porte ou vide");
					Item cursor=null;	
					int i=0;
				do{
					if(cursor!=null){
					cursor = cursor.getSuivant();
					}
					else{
						cursor = this.root;
					}
				i++;	
				}while(i<=index);
				return cursor;
		}
		
		public T valueOf(int index) throws Exception{
			return this.itemOf(index).getValeur();
		}

		class Item {
			Item precedent;
			Item suivant;
			T valeur;
			
			public Item(Item precedent, Item suivant, T valeur){
				this.precedent = precedent;
				this.valeur = valeur;
				this.suivant = suivant;
			}
		public Item(T valeur){
				this.valeur = valeur;
			}
			
			public Item getPrecedent() {
				return precedent;
			}
			public void setPrecedent(Item precedent) {
				this.precedent = precedent;
			}
			public Item getSuivant() {
				return suivant;
			}
			public void setSuivant(Item suivant) {
				this.suivant = suivant;
			}
			public T getValeur() {
				return valeur;
			}
			public void setValeur(T valeur) {
				this.valeur = valeur;
			}
		
	
		 
		}
		
}