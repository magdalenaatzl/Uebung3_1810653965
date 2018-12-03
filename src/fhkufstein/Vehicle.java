package fhkufstein;

import javax.swing.*;

public class Vehicle {
    private int power; //in kW
    private double weight; //in kg
    private String name;


    public static void calculatePower(int power) {
        JOptionPane.showMessageDialog(null, +power + " kW (das sind " + power * 1.36 + " PS)");
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}




