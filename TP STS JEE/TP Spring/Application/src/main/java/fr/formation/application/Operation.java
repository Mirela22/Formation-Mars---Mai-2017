package fr.formation.application;

public class Operation implements MathInterface {


	public int addition(int number, int number2) {
		
		return number+number2;
	}


	public int factorielle(int number) {
		
		return number <= 1?1: number*factorielle(number- 1);
	}


	public boolean premier(int number) {
		  
		long d;

		if (number % 2 == 0){
			return (number == 2); 
		}
		for (d = 3; d * d <= number; d = d + 2){ 
			if (number % d == 0){
		 		return false;
			}
		}
		return true;       
	}
	
	
	


			
}
