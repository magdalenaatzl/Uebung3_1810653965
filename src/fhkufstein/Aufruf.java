package fhkufstein;

import javax.swing.*;

public class Aufruf {
    public static void main(String[] args) {
        Vehicle auto1 = new Vehicle(120, 500, "Porsche");
        Vehicle auto2 = new Vehicle(250, 400, "Ferrari");

        JOptionPane.showMessageDialog(null, "ein "+auto1.getName()+" hat...");
        auto1.calculatePower();

        JOptionPane.showMessageDialog(null, "ein "+auto2.getName()+" hat...");
        auto2.calculatePower();
    }
}
