package systemedefichier;

import java.util.*;

public class Repertoire extends Composant {
	
	/**Liste des composants du repertoire*/
	private List<Composant> _contenu;
	
	/**Le père du repertoire*/
	private Repertoire _pere;
	
	/**
	 * Constructeur du repertoire
	 * @param nom du repertoire
	 */
	public Repertoire(String nom)
	{
		_nom = nom;
		_contenu = new ArrayList<Composant>();
		_pere = null;
	}
	
	/**
	 * 
	 * @param compo un composant
	 * @return vrai si le composant a été ajouter dans le repretoire sinon faux
	 */
	public boolean ajouterComposant(Composant compo)
	{	
		if(compo != null)
		{
			if(compo instanceof Repertoire) // si compo est un est repertoire
			{
				if(compo != this && !estMonDescendant((Repertoire) compo)) /*!this.estDescendantDe((TestRepertoire) compo))*/
				{
					_contenu.add(compo);
					((Repertoire) compo).setPere(this);
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
	
	/**
	 * Getter sur pere de ce repertoire
	 * @return _pere 
	 */
	public Repertoire getPere()
	{
		return _pere;
	}
	
	/**
	 * Setter sur pere de ce repertoire
	 * @param rep un repertoire
	 */
	public void setPere(Repertoire rep)
	{
		_pere = rep;
	}
	
	/**
	 * 
	 * @param rep un repertoire
	 * @return vrai si cet repertoire un descendant de rep
	 */
	public boolean estDescendantDe(Repertoire rep)
	{
		boolean bool = false;
		Repertoire pere = _pere;
		while(pere != null && rep !=null && !bool)
		{
			if(pere == rep)
			{
				bool = true;
			}
			else 
			{
				pere = _pere.getPere();
			}
		}
		
		return bool;
	}
	
	public boolean estMonDescendant(Repertoire rep)
	{
		if(rep == null || _pere == null)
		{
			return false;
		}
		if(rep == _pere)
		{
			return true;
		}
		
		return _pere.estMonDescendant(rep);
	}

}
