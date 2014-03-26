package be.vdab.valueobjects;

/*
 * Adres bevat een straat, huisnummer, busnummer, postcode en gemeente.
 *Wanneer straat, huisnummer, postcode of gemeente niet ingevuld zijn, wordt een
 *IllegalArgumentException gegooid. 
 */
public class Adres {
	private final String straat;
	private final String huisnr;
	private final int busnr;
	private final int postcode;
	private final String gemeente;

	public Adres(String straat, String huisnr, int busnr, int postcode,
			String gemeente) {

		if (straat != null && huisnr != null && postcode != 0
				&& gemeente != null) {
			this.straat = straat;
			this.huisnr = huisnr;
			this.busnr = busnr;
			this.postcode = postcode;
			this.gemeente = gemeente;
		} else
			throw new IllegalArgumentException();
	}

	/**
	 * @return de straat
	 */
	public String getStraat() {
		return straat;
	}

	/**
	 * @return het huisnr
	 */
	public String getHuisnr() {
		return huisnr;
	}

	/**
	 * @return het busnr
	 */
	public int getBusnr() {
		return busnr;
	}

	/**
	 * @return de postcode
	 */
	public int getPostcode() {
		return postcode;
	}

	/**
	 * @return de gemeente
	 */
	public String getGemeente() {
		return gemeente;
	}

}
