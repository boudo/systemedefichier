package systemedefichier;

public abstract class Composant {
	 
	/** Nom du composant*/
	protected String _nom;
	 
	/** Taille du composant*/
	 abstract int getTaille();

	 /**
		 * Getter du nom
		 * @return Le nom du composant
		 */
	 public String getNom() {
		 return _nom;
	 }
	 
	 /**
		 * Modification du nom du composant
		 * @param Nom du composant (Repertoire ou fichier)
		 */
	 public void setNom(String nom) {
		 if(nom != null) {
			 _nom = nom;
		 }
	 }
}

