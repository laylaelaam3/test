import java.util.Scanner;

public class ab {
    public static void main(String[] args) {
        int []note=new int[10];
        int max,min;
        Scanner scanner=new Scanner(System.in);
        System.out.println("entrer les notes");
        for (int i=0;i< note.length;i++) {
            note[i] =scanner.nextInt();}
        max= note[0];
       min= note[0];
        for (int i=1;i< note.length;i++) {

            if (max<note[i]){
                max=note[i];
            }if (min>note[i]){
                min=note[i];
            }

        }
        System.out.println(max);
        System.out.println(min);

    }
    }
