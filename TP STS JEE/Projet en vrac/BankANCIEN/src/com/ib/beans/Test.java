package com.ib.beans;
import com.ib.BDD.*;

import com.ib.beans.Utilitairefct;

import java.util.HashMap;

import com.ib.beans.User;

public class Test {

	public static void main(String[] args) {
		
		
	
		HashMap<String, Integer> myClientIDPass = new HashMap<String,Integer>();
		myClientIDPass = User.getPerson_is_advisor();
		
		Listedescomptesfonctions.getListeDesComptes(7);
		
	/*boolean whoIsPersonn = Utilitairefct.isAdvisor (myClientIDPass,"84628456"); 
     
 	if (whoIsPersonn == true ){
 		System.out.println("client");
 	} else {
 		System.out.println("conseiller");
 	}*/
}
}


