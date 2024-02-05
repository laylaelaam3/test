public class pairimaire {
    public static void main(String[] args) {
        int[] table = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tableImpair = new int[table.length / 2];
        int[] tablePair = new int[table.length / 2];
        int j = 0, k = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] % 2 == 0) {
                tableImpair[j] = table[i];
                j++;
            }
            if (table[i] % 2 == 1) {
                tablePair[k] = table[i];
                k++;
            }
        }
        System.out.print("les nombres pair sont:");
        for (int i = 0; i< tablePair.length; i++) {
            System.out.print(tablePair[i]+" ");
        }
        System.out.println();
        System.out.print("les nombres impair sont:");
        for (int i = 0; i < tableImpair.length; i++) {
            System.out.print(tableImpair[i]+" ");
        }

    }
}
