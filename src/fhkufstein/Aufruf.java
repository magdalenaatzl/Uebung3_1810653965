package fhkufstein;

import javax.swing.*;

public class Aufruf {
    public static void main(String[] args) {
        Vehicle auto1 = new Vehicle();
        Vehicle auto2 = new Vehicle();

        auto1.name = "Porsche";
        auto2.name = "Ferrari";

        JOptionPane.showMessageDialog(null, "ein "+auto1.name+" hat...");
        Vehicle.calculatePower(50);
        JOptionPane.showMessageDialog(null, "ein "+auto2.name+" hat...");
        Vehicle.calculatePower(40);


    }
}
