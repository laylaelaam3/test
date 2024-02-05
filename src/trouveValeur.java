public class trouveValeur {
    public static void main(String[] args) {
        int[] valeur = {10, 18, 30, 40};
        int valeurCherchéé = 30;
        boolean vaeurtruvé = false;
        for (int i = 0; i < valeur.length; i++) {
            if (valeur[i] == valeurCherchéé) {
                vaeurtruvé = true;
                break;
            }
        }
        if (vaeurtruvé) {
            System.out.println("la valeur cherchée exite bien dans le tableau " + valeurCherchéé);
        } else {
            System.out.println("la valeur cherchée n'exite pas dans le tableau ");
        }
    }
}


