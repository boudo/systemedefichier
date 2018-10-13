package systemedefichier;

public class Fichier extends Composant {
	
	/**Taille du fichier*/
	private int _taille;
	
	/**
	 * Constructeur de fichier
	 * @param nom du fichier
	 * @param taille du fichier
	 */
	public Fichier(String nom, int taille)
	{
		_nom = nom;
		_taille = taille;
	}
	
	/**
	 * La methode getTaille propre au fichier
	 * @return la taille du fichier
	 */
	@Override
	public int getTaille()
	{
		return _taille;
	}
}
