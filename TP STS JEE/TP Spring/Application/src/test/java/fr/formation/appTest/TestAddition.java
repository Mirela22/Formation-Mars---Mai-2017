package fr.formation.appTest;



import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.formation.application.MathInterface;



public class TestAddition {
	
	private static ApplicationContext context;
	
	@BeforeClass 
	public static void setupBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app-context.xml");
	}
	
	@Test
	public void testAddition(){
	
		MathInterface add = (MathInterface) context.getBean("Beeanapp");
		int nombre = add.addition(4, 2);
		assertEquals(6, nombre);
		
	}


}
