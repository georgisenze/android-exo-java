/* import java.text.SimpleDateFormat;
import java.util.Date; */

abstract public class Employe {

    //Les attributs
    private String nom;
    private String poste;
    //private Date dateEngagement;

    // Constructeur
    public Employe(String nom, String poste) //Date dateEngagement)
    {
        this.nom = nom;
        this.poste = poste;
        //this.dateEngagement = dateEngagement;
    }

    // getter
    public String getNom() {
        return nom;
    }
    public String getPoste() {
        return poste;
    }
/*     public Date getDateEngagement() {
        return dateEngagement;
    } */
    //setter
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPoste(String poste) {
        this.poste = poste;
    }
/*     public void setDateEngagement(Date dateEngagement) {
        this.dateEngagement = dateEngagement;
    } */

    // methode abstract pour le durée de travail
    abstract public void Duree();

    public static void main(String[] args) throws Exception {

        
  /*       SimpleDateFormat ft = new SimpleDateFormat("E yyy.MM.dd 'at' hh:mm:ss a zzz ");
        Date date = new Date();
        System.out.println(date.toString()); */

        // creation des objets
        EmployeTemporaire employer1 = new EmployeTemporaire("Sensey", "Ghost leader", 1000000000 , 458);
        EmployeSalarie employer2 = new EmployeSalarie("Georgi", "Sniper", 50000000, 90);
        System.out.println("\t\t\tLISTE DES EMPLOYEES");
    
        System.out.println(" ____________________________________________________________________ ");
        System.out.println("|EMPLOYERS : \t |NOM :  |\t |POSTES :     |\t SALAIRE|");
        System.out.println("____________________________________________________________________");
        System.out.println("|\t 1 \t | " +employer1.getNom()+ " | \t |" +employer1.getPoste()+ " | \t " +employer1.calculerSalaire(employer1.getSalaireHoraire(), employer1.getHeures())+"|");
        System.out.println("____________________________________________________________________");
        System.out.println("|\t 2 \t | " +employer2.getNom()+ " | \t |" +employer2.getPoste()+ " | \t " +employer2.calculerSalaire(employer2.getSalaireFixe(), employer2.getTauxActivite())+"|");
        System.out.println("_____________________________________________________________________");
    }
}
