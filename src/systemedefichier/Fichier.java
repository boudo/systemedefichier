package systemedefichier;

public class Fichier extends Composant{
	int taille;
public int GetTaille() { return this.taille; }
public Fichier(String nom,int t) {
	super(nom);
	this.taille=t;
	
};
}
