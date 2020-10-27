package com.company;

import javax.swing.*;

public class Main {
    public static int numberOfmyDogs = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of dogs "));
    public static myDogs dogs[] = new myDogs[numberOfmyDogs];
    private static String name;
    private static int age;
    private static String breed;
    private static float height;

    public static void main(String[] args) {
        for (int i = 0; i < numberOfmyDogs; i++) {
            dogs[i] = new myDogs();
            name = JOptionPane.showInputDialog(null, "Enter dog's name ");
            dogs[i].setName(name);
            age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter dog's age "));
            dogs[i].setAge(age);
            breed = JOptionPane.showInputDialog(null, "Enter dog's breed ");
            dogs[i].setName(breed);
            height = Float.parseFloat(JOptionPane.showInputDialog(null, " Enter dog's height "));
            dogs[i].setHeight(height);

        }
        for (int i = 0; i < numberOfmyDogs; i++) {
            JOptionPane.showMessageDialog(null, dogs[i].toString());
        }
    }
}
