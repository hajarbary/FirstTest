
public class Etudiant {
	
	public static int nbrEtd=0;
	public static int compt=0;
    public int num;
    public String nom;
    
    public Etudiant(int num, String nom)
    {
    	this.num = num;
    	this.nom = nom;
    	nbrEtd++;
    }
    
  public static void verser(int montant)
  {
	  compt = compt + montant;
  }
  
  public static void retire(int montant)
  {
	  compt = compt - montant;
  }
}
