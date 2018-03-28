package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class TestAuto {
	private AutoGuma a;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a= new AutoGuma();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Fiat");
		
		assertEquals("Fiat", a.getMarkaModel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
		
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelManjeOd3() {
		a.setMarkaModel("sd");
		
		
	}


	@Test
	public void testSetPrecnik() {
		a.setPrecnik(14);
		
		assertEquals(14, a.getPrecnik());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManjeOd13() {
		a.setPrecnik(12);
			
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeceOd22() {
		a.setPrecnik(23);
		
		}

	@Test
	public void testSetSirina() {
		a.setSirina(200);
		assertEquals(200, a.getSirina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaIspod() {
		a.setSirina(5);
		
			
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaPreko() {
		a.setSirina(5000);
			
	}

	@Test
	public void testSetVisina() {
		a.setVisina(40);
		
		assertEquals(40, a.getVisina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaIspod() {
		a.setVisina(4);
		
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaIznad() {
		a.setVisina(400);
		
		
	}

	@Test
	public void testToString() {
		a.setMarkaModel("Fiat");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(40);
		
		assertEquals("AutoGuma [markaModel=Fiat, precnik=15, sirina=200, visina=40]", a.toString());
	}

	@Test
	public void testEquals() {
		a.setMarkaModel("Fiat");
		a.setPrecnik(19);
		a.setSirina(200);
	    a.setVisina(40);
			
		AutoGuma a2 = new AutoGuma();
			a2.setMarkaModel("Fiat");
			a2.setPrecnik(19);
			a2.setSirina(200);
			a2.setVisina(40);
				
			assertTrue(a.equals(a2));
		
	}
	
	@Test
	public void testEqualsFalse() {
		a.setMarkaModel("Fiat");
		a.setPrecnik(19);
		a.setSirina(200);
	    a.setVisina(40);
			
		AutoGuma a2 = new AutoGuma();
			a2.setMarkaModel("Fiat");
			a2.setPrecnik(18);
			a2.setSirina(200);
			a2.setVisina(40);
				
			assertFalse(a.equals(a2));
		
	}

}
