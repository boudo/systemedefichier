package systemedefichier;

public abstract class Composant {
	 protected String nom;
	 
	 protected Composant(String nom){
		 this.nom=nom;
	 }
	 
	 abstract protected  int getTaille();
	 abstract protected String tostring();
	 
	 

}

