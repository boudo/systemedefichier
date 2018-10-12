

import java.util.*;

public class Repertoire extends Composant {
	
	private List<Composant> _contenu;
	
	public Repertoire(String nom)
	{
		_nom = nom;
		_contenu = new ArrayList<Composant>();
	}
	
	public boolean ajouterComposant(Composant compo)
	{	
		if(compo != null)
		{
			if(compo instanceof Repertoire) // si compo est un est repertoire
			{
				if(compo != this)
				{
					_contenu.add(compo);
					return true; // compo est un repertoire et pas un ascendant de this
				}
				return false; // compo est un repertoire et est un ascendant de this
			}
			else if(compo instanceof Fichier) // si compo est un est fichier
			{
				_contenu.add(compo);
				return true;
			}
		}
		return false; // compo est null
	}
	
	@Override
	public int getTaille()
	{
		int taille = 0;
		for(Composant compo: _contenu)
		{
			taille += compo.getTaille();
		}
		
		return taille;
	}
	


}
