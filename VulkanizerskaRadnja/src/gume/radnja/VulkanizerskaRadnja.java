package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;
/**
 * Klasa koja predstavlja vulkanizersku radnju sa osnovnim funkcijama
 * @author Nikola
 * @version 1.0.0
 */
public class VulkanizerskaRadnja {
	
	/**
	 * Lista sa objektima AutoGuma
	 */
	private LinkedList<AutoGuma> gume =
			new LinkedList<AutoGuma>();
	
	/**
	 * Dodaje objekat AutoGuma u listu
	 * @param a Objekat klase AutoGuma
	 * @throws java.lang.RuntimeException ako je guma u listi
	 * @throws java.lang.NullPointerException ukoliko je uneta null vrednost
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
			}
	
	/**
	 * Pronalazi gumu u listi 
	 * @param markaModel Objekat klase AutoGuma
	 * @return vraca null ukoliko guma nije u listi, ukoliko jeste vraca listu sa tom gumom
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		
		for(int i=0;i<gume.size();i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
			return novaLista;
	}


}
