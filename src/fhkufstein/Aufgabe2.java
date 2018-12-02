package fhkufstein;

import javax.swing.*;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class Aufgabe2 {
    public static void main(String[] args) {
        partialString(JOptionPane.showInputDialog("Gib deinen Namen ein"));

        //Aufrufen der Klasse Taschenrechner

        System.out.println(Taschenrechner.Addieren(10,5));
        System.out.println(Taschenrechner.Subtrahieen(10,5));
        System.out.println(Taschenrechner.Multiplizieren(10, 5));
        System.out.println(Taschenrechner.Dividieren(10, 5));

        System.out.println(Taschenrechner.Addieren(10, 2.5));
        System.out.println(Taschenrechner.Subtrahieen(10, 2.5));
        System.out.println(Taschenrechner.Multiplizieren(10, 2.5));
        System.out.println(Taschenrechner.Dividieren(10, 5));
    }


    public static void partialString (String a){
        if (a.length() < 3) //length() gibt die zählt die einzelnen Strings (in dem Fall) vom String
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


