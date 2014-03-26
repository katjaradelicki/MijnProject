package be.vdab.valueobjects;

import static org.junit.Assert.*;

import org.junit.Test;

@SuppressWarnings("unused")
public class AdresTest {

	@Test
	public void adresAanmakenOK() {
		Adres adres=new Adres("Hoevendreef", "12A", 0, 3300, "Tienen");
	}
	@Test
	public void adresAanmakenMetBusnrOK() {
		Adres adres=new Adres("Hoevendreef", "12A", 3, 3300, "Tienen");
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void adresAanmakenZonderStraatNOK() {
		Adres adres=new Adres(null, "12A", 0, 3300, "Tienen");
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void adresAanmakenZonderHuisnrNOK() {
		Adres adres=new Adres("Hoevendreef", null, 0, 3300, "Tienen");
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void adresAanmakenMetPostcodeNulNOK() {
		Adres adres=new Adres("hoevendreef", "12A", 0, 0, "Tienen");
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void adresAanmakenZonderGemeenteNOK() {
		Adres adres=new Adres("hoevendreef", "12A", 0, 3300, null);
	}
	

}
