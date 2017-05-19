package com.ib.beans;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;
import com.ib.beans.User;
import com.ib.beans.Utilitairefct;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		SecureRandom rnd = new SecureRandom();
		String Acces_token = new BigInteger(130, rnd).toString(32);
        User.Ajout_Access(Acces_token, "12345678");
		
		
		
	}

}
