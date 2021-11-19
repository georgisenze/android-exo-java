//import java.util.Date;

public class EmployeSalarie extends Employe implements merite {
    // Les attribut de la classe
    private double salaireFixe;
    private double tauxActivite;

    //constructeur
    public EmployeSalarie(String nom, String poste, double salaireFixe, double tauxActivite) //Date dateEngagement,
    {
        super(nom, poste);//dateEngagement
        this.tauxActivite = tauxActivite;
        this.salaireFixe = salaireFixe;
    }

    //getter
    public double getSalaireFixe() {
        return salaireFixe;
    }
    public double getTauxActivite() {
        return tauxActivite;
    }
    //setter
    public void setSalaireFixe(double salaireFixe) {
        this.salaireFixe = salaireFixe;
    }
    public void setTauxActivite(double tauxActivite) {
        this.tauxActivite = tauxActivite;
    }

    public double calculerSalaire(double salaireFixe, double tauxActivite) {
        return salaireFixe*tauxActivite;
    }


    //implémenation de la methode abstract
    public  void Duree()
    {
        System.out.println("La durée de travaile est de 150heure");
    }

     public void securiteSocial()
    {
        System.out.println("Mon emploie m'offre une sécurité sociale");
    } 
}
