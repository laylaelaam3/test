public class Vehicule {
    private String marque,modele,annee;
    private int vitesse;

    public Vehicule(String marque, String modele, String annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
       vitesse =0;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getAnnee() {
        return annee;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", annee='" + annee+
                '}';
    }
    public void accélere(){
        if (vitesse<200)
        vitesse+=5;
        else {
            System.out.println("vous avez atteint la vitesse max");
        }
    }
    public void ralentire(){
        if (vitesse>0)
        vitesse-=5;
        else {
            System.out.println("la Vehicule est arretee");
        }
    }


    public boolean arretee(){
        if (vitesse==0)return true;
        else return false;

    }
}


