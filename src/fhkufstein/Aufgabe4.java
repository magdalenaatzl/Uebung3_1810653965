package fhkufstein;

public class Aufgabe4 {
    public static void main(String[] args) {
        System.out.println("Iterativ: "+fibunacciIterativ(10));
        System.out.println("rekursiv: "+fibunacciRekursiv(10));
    }

    public static int fibunacciRekursiv(int n) {
        //Abbruchsbedingugen --> sonst wird sie endlos aufgerufen
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibunacciRekursiv(n - 2) + fibunacciRekursiv(n - 1);
}
    public static int fibunacciIterativ(int n) {
        if (n <= 1) {
            return n;
        }
        //Hilfsvariablen
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;             // n=3 -> 1; n=4 -> 2
            fib += prevFib;             // n=3 -> 2; n=4 -> 3   --- diese Zahl wird von return aufgerufen
            prevFib = temp;             // n=3 -> 1; n=4 -> 2
        }
        return fib;


        /*
        Unterschied Rekursion und Iteration

        Iteration = Wiederholung durch Aneinaderreihung (Schleifen)
        Rekrusion = Wiederholung durch Ineinanderschachtelung (Selbstaufruf)

        Iterative Lösungen sind effizienter (schneller und beanspruchen weniger Speicher)

        Rekursive Lösungen benötigen mehr Speicher, um alle Rekursionsschritte zwischenzuspeichern

         */

    }
}
