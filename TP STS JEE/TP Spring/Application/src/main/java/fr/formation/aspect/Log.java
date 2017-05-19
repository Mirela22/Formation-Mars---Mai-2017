package fr.formation.aspect;

import org.aspectj.lang.JoinPoint;

public class Log {
		
	public void beforeMethod(JoinPoint joinPoint){ //point de jointure
			
			String methode = joinPoint.getSignature().toShortString(); //on déclare la methode qu'on a declarer et on lui demande de recuperer la signature de cette methode, on s'arrete avant de l'appeler, on recupere que le nom de la methode grace a toshortstring
			Object[] args = joinPoint.getArgs();//recupere moi les arguements passé dans ce joinpoiint, on fait de l'outboxxing grace a objet
			
			StringBuilder builder = new StringBuilder(); //Stringbuilder = comme une liste chainé, alors que String = tableau de caractere qui est plus consommateurs
			builder.append("Methode : ");
			builder.append(methode);
			builder.append(" Invoqué avec les parametres suivant : ");
			
			for (Object o : args){
				builder.append(o);
				builder.append(" - ");
			}
			
			System.out.println(builder.toString());
		}
	
		public void afterMethod(JoinPoint joinPoint, Object result){
			String methode = joinPoint.getSignature().toShortString();
			System.out.println("Méthode : " +methode+ "a produit le résultat "+result);
		}
	

}
