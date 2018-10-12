package systemedefichier;

public class Fichier extends Composant {
	
	
	private int _taille;
	
	
	public Fichier(String nom, int taille)
	{
		_nom = nom;
		_taille = taille;
	}
	
	public int getTaille()
	{
		return _taille;
	}
}
