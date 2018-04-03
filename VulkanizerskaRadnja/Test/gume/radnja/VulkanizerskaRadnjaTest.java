package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;
import gume.radnja.VulkanizerskaRadnja;

public class VulkanizerskaRadnjaTest {
	
	VulkanizerskaRadnja v;
	AutoGuma a;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		v= new VulkanizerskaRadnja();
		a= new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDodajGumu() {
		a.setMarkaModel("Fiat");
		v.dodajGumu(a);
		
		assertEquals("Fiat", v.pronadjiGumu("Fiat").get(0).getMarkaModel());
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuNull() {
		
		v.dodajGumu(null);
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuPostojiGuma() {
		a.setMarkaModel("Fiat");
		
		AutoGuma a2= new AutoGuma();
		a2.setMarkaModel("Fiat");
		v.dodajGumu(a);
		v.dodajGumu(a2);
	}

	@Test
	public void testPronadjiGumu() {
		a.setMarkaModel("Fiat");
		v.dodajGumu(a);
		
		assertEquals("Fiat", v.pronadjiGumu("Fiat").get(0).getMarkaModel());
		
	}
	
	@Test 
	public void testPronadjiNull() {
		
		assertEquals(null, v.pronadjiGumu(null));
		
	}
	
	@Test 
	public void testPronadjiNema() {
		
		assertEquals(0, v.pronadjiGumu("Fiat").size());
		
	}
	
	@Test 
	public void testPronadji2() {
		AutoGuma a2= new AutoGuma();
		AutoGuma a3= new AutoGuma();
		a.setMarkaModel("Fiat");
		a.setPrecnik(15);
		a2.setMarkaModel("Fiat");
		a2.setPrecnik(16);
		a3.setMarkaModel("Tigar");
		a3.setPrecnik(16);
		
		v.dodajGumu(a);
		v.dodajGumu(a2);
		v.dodajGumu(a3);
		
		
		assertEquals(2, v.pronadjiGumu("Fiat").size());
		
	}
	
	
	
	
	

}
