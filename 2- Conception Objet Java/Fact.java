
import java.util.Scanner; 
import java.lang.Math;

class Fact{
public static void main(String[] args){
	long nombre=1;
	
	while(nombre!=-1){
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez saisir un nombre :");
		 nombre = sc.nextLong();
		System.out.println(Factorielle(Math.abs(nombre)));
	}
}


	public static long Factorielle(long nbre){		
		return nbre >1 ?  nbre*(Factorielle(nbre-1)):1;
	}
}
