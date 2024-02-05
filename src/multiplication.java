import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        int[] valeurTable=new int[10];
        Random random=new Random();
        for (int i=0;i< valeurTable.length;i++){
            valeurTable[i]=random.nextInt(1,10);

        }
        System.out.print("les valeur du tableau sont ");
        for (int i=0;i< valeurTable.length;i++){
        System.out.print(valeurTable[i]+"  ");}
        System.out.println();
        System.out.print("les valeur du tableau triees ");
        Arrays.sort(valeurTable);
        for (int i=0;i< valeurTable.length;i++){
            System.out.print(valeurTable[i]+"  ");}




    }
}
