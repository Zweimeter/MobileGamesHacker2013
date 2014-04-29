import java.util.Date;


public class Rahmenprogramm {
	private String bezeichnung;
	private String zeit;
	private Date datum;
	private String ort;
	
	public Rahmenprogramm(String bezeichnung, Date datum, String zeit, String ort){
		this.setBezeichnung(bezeichnung);
		this.setDatum(datum);
		this.setZeit(zeit);
		this.setOrt(ort);
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getZeit() {
		return zeit;
	}

	public void setZeit(String zeit) {
		this.zeit = zeit;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}
}
