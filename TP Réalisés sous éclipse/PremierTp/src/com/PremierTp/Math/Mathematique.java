package com.PremierTp.Math;

public class Mathematique {
	


	public long factorielle(int value){
		
		return (value) >1 ? this.factorielle(value-1):1; //this permet de pointer bien sur ce que l'on veut.qd on utilise un element qui appartient a l'instance et non a la fonction
	} //on utilise le factoriel de l'instance que l'on vient de manipuler

	public long fibonacci(int nb){
	
		long a,b,c;
		c=1;
		for (long i=3; i<=(nb+1) ; i++) { 
			a=i-1;
			b=i-2;
			c=c+a+b;

			}
		return c;
	}
	
	public boolean isPremier(int n){
			long d;

			if (n % 2 == 0){
				return (n == 2); 
		}
			for (d = 3; d * d <= n; d = d + 2){ 
				if (n % d == 0){
 		 			return false;
			}
		}
		return true;


			}
		
	
	
}
