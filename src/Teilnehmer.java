
public class Teilnehmer {
	private String name;
	private String email;
	private String status;
	
	public Teilnehmer(String name, String email, String status){
		this.setName(name);
		this.setEmail(email);
		this.setStatus(status);
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
