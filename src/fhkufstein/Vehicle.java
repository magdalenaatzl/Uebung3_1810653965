package fhkufstein;

import javax.swing.*;

public class Vehicle {
    public int power; //in kW
    public double weight; //in kg
    public String name;

    public static String printName(String name){
        return name;
    }
    public static void calculatePower(int power){
        JOptionPane.showMessageDialog(null, +power+" kW (das sind "+power*3.6+" PS)");
    }
}
