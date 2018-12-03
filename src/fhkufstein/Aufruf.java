package fhkufstein;

import javax.swing.*;

public class Aufruf {
    public static void main(String[] args) {
        Vehicle auto1 = new Vehicle();
        Vehicle auto2 = new Vehicle();

        auto1.setName("Porsche");
        auto2.setName("Ferrari");


        JOptionPane.showMessageDialog(null, "ein "+auto1.getName()+" hat...");
        Vehicle.calculatePower(440);

        JOptionPane.showMessageDialog(null, "ein "+auto2.getName()+" hat...");
        Vehicle.calculatePower(220);

    }
}
