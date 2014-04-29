
public class Referent {

	private String name;
	private String email;
	private String firma;
	
	public Referent(String name, String email, String firma){
		this.setName(name);
		this.setEmail(email);
		this.setFirma(firma);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}
}
