package libgest;

public class Livre {

	private String titre;
	private String auteur;
	private int nombrePages;

	public Livre(String titre, String auteur, int nombrePages) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.nombrePages = nombrePages;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNombrePages() {
		return nombrePages;
	}

	public void setNombrePages(int nombrePages) {
		this.nombrePages = nombrePages;
	}

}
