package fr.formation.appTest;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.formation.application.MathInterface;

public class TestPremier {
	
	private static ApplicationContext context;
	
	@BeforeClass 
	public static void setupBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app-context.xml");
	}
	
	@Test
	public void testPremier(){
		
		MathInterface premier= (MathInterface) context.getBean("Beeanapp");
		boolean result = premier.premier(5);
		assertEquals(true, result);
	}

}
