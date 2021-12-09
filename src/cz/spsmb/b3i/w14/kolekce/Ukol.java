package cz.spsmb.b3i.w14.kolekce;
//ArrayList lze vytvořit i s předem vytvořeným počtem prvků. Takto:
//ar = new ArrayList<Integer>(N). Proveďte rychlostní test a srovnejte
//s ar = new ArrayList<Integer>() pro milión prvků;
public class TypovanaKolekcePolymorfismus {
    public static void main(String[] args) {
        int N = 1000000;
        ArrayList<Integer> sar = new ArrayList<>(N);
        ArrayList<Integer> ar = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            sar.add(i);
        }
        long finish = System.currentTimeMillis();
        long timeElapsed = (finish - start);
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            ar.add(i);
        }
        long finish1 = System.currentTimeMillis();
        long timeElapsed2 = (finish1 - start1);
        System.out.println("AR znamená new ArrayList<Int>(N) " + timeElapsed);

        System.out.println("SAR znamená new ArrayList<Int>() " + timeElapsed2);
        if (timeElapsed2 > timeElapsed) {
            System.out.println("AR je nejrychlejší");

        } else if (timeElapsed > timeElapsed2) {
            System.out.println("SAR je rychlejší");

        } else {

            System.out.println("Oba jsou stejně rychlé");

        }

    }

}
