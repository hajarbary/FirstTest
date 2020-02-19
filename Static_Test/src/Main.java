
public class Main {

	public static void main(String[] args) {
		
		//variables static
		Etudiant e1 = new Etudiant(1,"Ali");
    	System.out.println(Etudiant.nbrEtd);
    	
    	Etudiant e2 = new Etudiant(2,"Amal");
    	System.out.println(Etudiant.nbrEtd);

    	Etudiant e3 = new Etudiant(3,"Salim");
    	System.out.println(Etudiant.nbrEtd);
    
    	Etudiant e4 = new Etudiant(4,"Salwa");
    	Etudiant e5 = new Etudiant(5,"Fatima");
    	
    	int totalEtd = Etudiant.nbrEtd;
    	System.out.println("Le nombre total des étudiant est: "+totalEtd);
    	
    	// methodes static
    	e1.verser(500); // soit l'appeler par le nom d'objet 
        Etudiant.verser(391); // ou le nom de la classe
    	e3.verser(847);
    	e4.verser(290);
    	Etudiant.retire(200);
    	System.out.println(Etudiant.compt);
    	
    	Etudiant.verser(20);
    	System.out.println(Etudiant.compt);
    	
    
	}

}
