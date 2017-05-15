class Premier{
	public static void main(String[] args){
		int a = 2;
		int b = 4217;
		int c = 60;
		int d = 15;
		System.out.println(a+ " est premier? "+isPremier(a));
		System.out.println(b+ " est premier? "+isPremier(b));
		System.out.println(c+ " est premier? "+isPremier(c));
		System.out.println(d+ " est premier? "+isPremier(c));
		
	}

	public static boolean isPremier(int n){
  			int d;

  			if (n % 2 == 0){
    				return (n == 2); // retourne true si n=2, false sinon
			}

			/* condition arrêt boucle for : tout entier n >=2 qui est un produit
			de facteurs a toujours au moins un diviseur premier p tel que 
			2 <= p <= racine de n */

  			for (d = 3; d * d <= n; d = d + 2){ 
    				if (n % d == 0){
     		 			return false;
				}
			}
			return true;
	}
}
