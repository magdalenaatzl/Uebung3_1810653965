package fhkufstein;

public class Aufgabe4 {
    public static void main(String[] args) {
        System.out.println("Iterativ: "+fibunacciIterativ(3));
        System.out.println("rekursiv: "+fibunacciRekursiv(10));

    }

    public static int fibunacciRekursiv(int n) {
        //rekursiv: eine Funktion ruft sich selbst auf

        //Für eine rekursive Methoden benötige ich Abbruchsbedingugen --> sonst wird sie endlos aufgerufen
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibunacciRekursiv(n - 2) + fibunacciRekursiv(n - 1);
    }


    public static int fibunacciIterativ(int n) {
        //iterativ: Schleifen bilden


        //funktioniert so nicht:
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int ergebnis = 2;
        for (int i = 1 ; i < n; i++) {
            ergebnis = (n-2)+(n-1);
        }
        return ergebnis;





        /*
        Unterschied Rekursion und Iteration

        Iteration = Wiederholung durch Aneinaderreihung (Schleifen)
        Rekrusion = Wiederholung durch Ineinanderschachtelung (Selbstaufruf)

        Iterative Lösungen sind effizienter (schneller und beanspruchen weniger Speicher)

        Rekursive Lösungen benötigen mehr Speicher, um alle Rekursionsschritte zwischenzuspeichern

         */

    }
}
