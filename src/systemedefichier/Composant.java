package systemedefichier;

public abstract class Composant {
	 
	protected String _nom;
	 
	 
	 abstract int getTaille();

	 public String getNom() {
		 return _nom;
	 }
	 
	 public void setNom(String nom) {
		 if(nom != null) {
			 _nom = nom;
		 }
	 }
}

