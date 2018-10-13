package systemedefichier;

public class Main {
	
	public static void main(String[] args) {
		
	
		Repertoire r1 = new Repertoire("/");
		Repertoire r2= new Repertoire("user");
		Repertoire r3= new Repertoire("andy");
		Repertoire r4= new Repertoire("ibrahim");
		Repertoire r5= new Repertoire("aziz");
		Repertoire r6= new Repertoire("system_fichier_ibra");
		Repertoire r7= new Repertoire("system_fichier_andy");
		Repertoire r8= new Repertoire("system_fichier_aziz");
		
		Fichier f1= new Fichier("f1",10);
		Fichier f2= new Fichier("f2",20);
		Fichier f3= new Fichier("f3",30); // 100 dans andy
		Fichier f4= new Fichier("f4",40);
		
		Fichier f5= new Fichier("f5",50);
		Fichier f6= new Fichier("f6",60);
		Fichier f7= new Fichier("f7",70); // 350 dans ibrahim
		Fichier f8= new Fichier("f8",80);
		Fichier f9= new Fichier("f9",90);
		
		r1.ajouterComposant(r2);
		
		r2.ajouterComposant(r3);
		r2.ajouterComposant(r4);
		r2.ajouterComposant(r5);
		
		r3.ajouterComposant(r7);
		r3.ajouterComposant(f1);
		r3.ajouterComposant(f2);
		r7.ajouterComposant(f3);
		r7.ajouterComposant(f4);
		
		r4.ajouterComposant(f5);
		r4.ajouterComposant(r6);
		r6.ajouterComposant(f6);
		r6.ajouterComposant(f7);
		r6.ajouterComposant(f8);
		r6.ajouterComposant(f9);
		if(!r6.ajouterComposant(r6))
		{
			System.out.println("Impossible de rajouter "+"'"+r6.getNom()+"'"+" dans "+r6.getNom());
		}
		
		r5.ajouterComposant(r8);
		if(!r8.ajouterComposant(r1))
		{
			System.out.println("Impossible de rajouter "+"'"+r1.getNom()+"'"+" dans "+r8.getNom());
		}
		if(r8.ajouterComposant(r3))
		{
			System.out.println("'"+r3.getNom()+"'"+" dans "+r8.getNom());
		}
		
		
		System.out.println("La taille totale du repertoire "+"'"+r1.getNom()+"'"+" est "+r1.getTaille());
		
	}
	
	
}
