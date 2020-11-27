package libgest;

public class Etudiant extends Person {

	private String branche;

	public Etudiant(String id, String nom, String prenom, int age, String branche) {
		super(id, nom, prenom, age); // get the attrubt from the preson class

		this.branche = branche;
	}

	public String getBranche() {
		return branche;
	}

	public void setBranche(String branche) {
		this.branche = branche;
	}

}
