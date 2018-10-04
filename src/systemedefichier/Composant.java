package systemedefichier;

public abstract class Composant {
	 protected String _nom;
	 
	 protected Composant(String nom){
		 this._nom=nom;
	 }
	 
	 abstract protected  int getTaille();
	 abstract protected String tostring();
}

