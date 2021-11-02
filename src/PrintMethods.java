public class PrintMethods {
    /**
     * metoden tar imot en n verdi (antall linjer) og deretter tegner en vokaltrekant
     * @param n int
     */
    public static void vokalTrekant(int n){
        char[] vokalTab = {'A', 'E', 'I', 'O', 'U', 'Y', 'Æ', 'Ø', 'Å'};
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(vokalTab[i-1] + " ");
            }
            System.out.println();
        }
    }
}
