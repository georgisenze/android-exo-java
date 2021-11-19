public class EmployeTemporaire extends Employe  {
    
    private double salaireHoraire ;
    private double heures;

    public EmployeTemporaire(String nom, String poste, double salaireHoraire, double heures)
    {
        super(nom, poste);
        this.salaireHoraire = salaireHoraire;
        this.heures = heures;
    }

    //getter
    public double getSalaireHoraire() {
        return salaireHoraire;
    }
    public double getHeures() {
        return heures;
    }
    //setter
    public void setSalaireHoraire(double salaireHoraire) {
        this.salaireHoraire = salaireHoraire;
    }
    public void setHeures(double heures) {
        this.heures = heures;
    }

    public double calculerSalaire(double salaireHoraire, double heures){
        return salaireHoraire*heures;
    }

    //implémenation de la methode abstract
        public  void Duree()
        {
            System.out.println("La durée de travaile est de 150heure");
        }

}
