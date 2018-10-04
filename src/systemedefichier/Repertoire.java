package systemedefichier;
import java.util.*;

public class Repertoire extends Composant {
	
	List<Composant> _comtenu;

	public Repertoire(String nom) // A finir
	{
		super(nom); // recupérer le code de Andy
		_comtenu = new ArrayList<Composant>();
	}
	
	public boolean ajouterComposant(Composant compo) // A finir
	{
		if(compo != null)
		{
			_comtenu.add(compo);
			return true;
		}
		
		return false;
	}
	
	public int getTaille() // A finir
	{
		return 2;
	}

}
