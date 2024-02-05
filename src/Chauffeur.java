public class Chauffeur {
    public static void main(String[] args) {
        Vehicule voiture=new Vehicule("toyota","corolla","2020");
        Vehicule voiture2=new Vehicule("dacia","logan","2020");
        voiture.setVitesse(300);
        System.out.println(voiture.getVitesse());
        System.out.println(voiture);
        voiture.accélere();
        System.out.println(voiture.getVitesse());
        voiture.ralentire();
        System.out.println(voiture.getVitesse());

        System.out.println(voiture.arretee());



    }

}
