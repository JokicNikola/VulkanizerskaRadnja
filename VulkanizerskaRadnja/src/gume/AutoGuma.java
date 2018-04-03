package gume;

/**
 * Klasa koja predstavlja gumu
 * @author Nikola
 * @version 1.0.0
 */

public class AutoGuma {
	
	/**
	 * Model automobila
	 */
	private String markaModel = null;
	
	/**
	 * Precnik gume
	 */
	private int precnik = 0;
	
	/**
	 * Sirina gume
	 */
	private int sirina = 0;
	
	/**
	 * Visina gume
	 */
	private int visina = 0;
	
	/**
	 * Vraca marku gume
	 * @return marka gume
	 */
	public String getMarkaModel() {
	return markaModel;
	}
	
	/**
	 * Menja vrednost atributa markaModel
	 * @param markaModel nova vrednost za markaModel
	 * @throws java.lang.RuntimeException ukoliko je
	 *  uneta null vrednost ili je duzina kraca od 3
	 */
	public void setMarkaModel(String markaModel) {
	if (markaModel==null || markaModel.length()<3)
		throw new RuntimeException("Morate uneti marku i model");
	this.markaModel = markaModel;
	}
	
	/**
	 * Vraca vrednost precnika gume
	 * @return precnik
	 */
	public int getPrecnik() {
	return precnik;
	}
	
	/**
	 * Postavlja novu vrednost precnika gume
	 * @param precnik nova vrednost precnika
	 * @throws java.lang.RuntimeException ukoliko je 
	 * precnik veci od 22 ili manje od 13
	 */
	public void setPrecnik(int precnik) {
	if (precnik < 13 || precnik > 22)
		throw new RuntimeException("Precnik van opsega");
	this.precnik = precnik;
	}
	
	/**
	 * Vraca vrednost sirine gume
	 * @return sirina
	 */
	public int getSirina() {
	return sirina;
	}
	
	/**
	 * Menja vrednost atributa sirina
	 * @param sirina nova vrednost sirine gume
	 * @throws java.lang.RuntimeException ukoliko je
	 * sirina veca od 355 ili manja od 135
	 */
	public void setSirina(int sirina) {
	if (sirina < 135 || sirina > 355)
		throw new RuntimeException("Sirina van opsega");
	this.sirina = sirina;
	}
	
	/**
	 * Vraca vrednost visine gume
	 * @return visina
	 */
	public int getVisina() {
	return visina;
	}
	
	/**
	 * Menja vrednost atributa visina
	 * @param visina nova vrednost visine gume
	 * @throws java.lang.RuntimeException ukoliko je
	 * visina manja od 25 ili veca od 95
	 */
	public void setVisina(int visina) {
	if (visina < 25 || visina > 95)
		throw new RuntimeException("Visina van opsega");
	this.visina = visina;
	}
	
	/**
	 * @return String sa podacima gume
	 */
	public String toString() {
	return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
	", sirina=" + sirina + ", visina=" + visina + "]";
	}
	
	/**
	 * Proverava da li je uneti objekat klase AutoGuma
	 * @return  TRUE ako jeste, FALSE ako nije
	 */
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	AutoGuma other = (AutoGuma) obj;
	if (markaModel == null) {
	if (other.markaModel != null)
	return false;
	} else if (!markaModel.equals(other.markaModel))
	return false;
	if (precnik != other.precnik)
	return false;
	if (sirina != other.sirina)
	return false;
	if (visina != other.visina)
	return false;
	return true;


	}
	
}
