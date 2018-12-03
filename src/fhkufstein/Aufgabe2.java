package fhkufstein;

import javax.swing.*;

public class Aufgabe2 {
    public static void main(String[] args) {

    //Aufgabe 2: Aufrufen der Methode
        partialString(JOptionPane.showInputDialog("Gib deinen Namen ein"));

    //Aufgabe 3: Aufrufen der Klasse Taschenrechner
        System.out.println("\nRechnen mit ganzen Zahlen:");
        System.out.println(Taschenrechner.Addieren(10,5));
        System.out.println(Taschenrechner.Subtrahieren(10,5));
        System.out.println(Taschenrechner.Multiplizieren(10, 5));
        System.out.println(Taschenrechner.Dividieren(10, 5));

        System.out.println("\nRechnen mit Kommazahlen:");
        System.out.println(Taschenrechner.Addieren(10, 2.5));
        System.out.println(Taschenrechner.Subtrahieren(10, 2.5));
        System.out.println(Taschenrechner.Multiplizieren(10, 2.5));
        System.out.println(Taschenrechner.Dividieren(10, 2.5));
    }

    //Aufgube 2

    public static void partialString (String a){
        if (a.length() < 3) //length() gibt die zählt die einzelnen Zeichen (in dem Fall) vom String
        {
            System.err.println("zu kurz");
        }
        else
        {
            System.out.println(a.substring(a.length()/2));
            /*substring() gibt eineen Teil des Strings wieder
            bei ungeraden Zeichenketten wird der kürzere Teil des Strings wiedergegeben, weil 5/2 = 2
             */

        }

    }
}


