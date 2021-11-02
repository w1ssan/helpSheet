public class ArrayHelpMethods {

    /**
     * sumStortar en tabell med positive heltall som parameter, beregner og returnerer summen av alle tall 
     * som er større enn det første tallet i tabellen (tallet som er lagret på indeks 0).
     * @param tallTab int array
     * @return int
     */
    public static int sumStor(int[] tallTab){
        int res = 0;
        for (int i = 1; i < tallTab.length; i++){
            if (tallTab[i] > tallTab[0])
                res += tallTab[i];
        }
        return res;
    }


}
