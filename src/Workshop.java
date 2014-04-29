import java.util.Date;


public class Workshop {

	private int nummer;
	private String bezeichnung;
	private Date datum;
	
	public Workshop(int nummer, String bezeichnung, Date datum){
		this.setNummer(nummer);
		this.setBezeichnung(bezeichnung);
		this.setDatum(datum);
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}
}
