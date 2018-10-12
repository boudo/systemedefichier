

import java.util.*;

public class TestRepertoire extends TestComposant {
	

	private List<TestComposant> _contenu;
	
	private TestRepertoire _pere;
	

	public TestRepertoire(String nom)
	{
		_nom = nom;
		_contenu = new ArrayList<TestComposant>();
		_pere = null;
	}
	
	public boolean ajouterComposant(TestComposant compo)
	{	
		if(compo != null)
		{
			if(compo instanceof TestRepertoire) // si compo est un est repertoire
			{
				if(compo != this && !estMonDescendant((TestRepertoire) compo)) /*!this.estDescendantDe((TestRepertoire) compo))*/
				{
					_contenu.add(compo);
					((TestRepertoire) compo).setPere(this);
					return true; // compo est un repertoire et pas un ascendant de this
				}
				return false; // compo est un repertoire et est un ascendant de this
			}
			else if(compo instanceof TestFichier) // si compo est un est fichier
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
		for(TestComposant compo: _contenu)
		{
			taille += compo.getTaille();
		}
		
		return taille;
	}
	
	public TestRepertoire getPere()
	{
		return _pere;
	}
	
	public void setPere(TestRepertoire rep)
	{
		_pere = rep;
	}
	
	public boolean estDescendantDe(TestRepertoire rep)
	{
		boolean bool = false;
		TestRepertoire pere = _pere;
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
	
	public boolean estMonDescendant(TestRepertoire rep)
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
