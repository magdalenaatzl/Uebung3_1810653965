package fhkufstein;

import javax.swing.*;

public class Vehicle
{
    private int power;
    private double weight;
    private String name;

    //Konstruktor
    public Vehicle(int power, double weight, String name)
    {
        this.power = power;
        this.weight =weight;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void calculatePower() {
        JOptionPane.showMessageDialog(null, +power + " kW (das sind " + power * 1.36 + " PS)");
    }

}




