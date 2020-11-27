package libgest;

public class Employee extends Person {

	private float salaire;

	public Employee(String id, String nom, String prenom, int age, float salaire) {
		super(id, nom, prenom, age);

		this.salaire = salaire;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

}
