package com.ib.tpcalculatrice;

public class DivException extends Exception { // la classe herite de exception
	
	public DivException (String phrase){
			System.out.println("Pas de division par zero");
		}
}
