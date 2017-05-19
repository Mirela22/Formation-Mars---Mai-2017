package com.ib.tpcalculatrice;
import com.ib.tpcalculatrice.TestException;

public class Calculs { // on créer la classe calcul qui va contenir tout les types de calculs
	
	public int addition(int a, int b){
		return a+b;
	}
	public int soustraction(int a, int b){
		return a-b;
	}
	public int multiplication(int a, int b){
		return a*b;
	}
	
//----------------------------------
	public void division (int a, int b) throws DivException {
		try{ 
			int resultat_division = a/b;
			System.out.println("Le résultat de la division est : " + resultat_division);
			
		}catch (ArithmeticException e){ 
		
			throw new DivException("t");
		}
		
	}
//------------------------------------
	public long factorielle(int value)throws TestException {
		
		if (value <=0 ){
			throw new TestException("On ne peut pas calculer la factorielle d'un nombre négatif");
		} else {
		
		long a = (value) >1 ? this.factorielle(value-1)*value:1; 
		return a;
		}
	} 

//--------------------------------------------
	public boolean isPremier(int n) throws PremierException {
							
			if ( n <= 0) {
				throw new PremierException();
			}else {
		
				if (n % 2 == 0){
					return (n == 2); 
			}
				for (long d = 3; d * d <= n; d = d + 2){ 
					if (n % d == 0){
				 			return false;
				}
			}
			return true;

			}
		}
	
	

}
