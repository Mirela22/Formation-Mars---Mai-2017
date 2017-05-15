class Tp_nbre_premier{
	
	public static void main(String[] args){ 
	
		int nombre = 9;
		int a=0;
			
			if (nombre == 2 || nombre ==1 ) {
				a=1;

			}
			else if ( nombre%2 == 0 ) {
		
				a=2;
				
			}
			
			else {

				for ( int i=nombre; i>0; i=i-2 ) {
					if ( nombre%i == 0 ) {
						a=a+1;
						
					}
					else {
						continue ;
					}
				}
			}
				
			if (a == 1 ) {
				System.out.println("C'est un nombre premier");
			}
			else {
			 	System.out.println("Ce n'est un nombre premier"); 
			}
			
	}
}
	
// faire une fonction