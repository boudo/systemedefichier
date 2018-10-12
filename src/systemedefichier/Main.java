package systemedefichier;

public class Main {
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
	Fichier f3= new Fichier("f3",30);
	Fichier f4= new Fichier("f4",40);
	Fichier f5= new Fichier("f5",50);
	Fichier f6= new Fichier("f6",60);
	Fichier f7= new Fichier("f7",70);
	Fichier f8= new Fichier("f8",80);
	Fichier f9= new Fichier("f9",90);
	
	r1.ajouter(r2);
	r2.ajouter(r3);
	r2.ajouter(r4);
	r2.ajouter(r5);
	r3.ajouter(r6);
	r4.ajouter(r7);
	r5.ajouter(r8);
	
	System.out.println();
	
	
	
	
	
	
	
}
