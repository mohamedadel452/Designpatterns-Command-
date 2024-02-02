/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author hp
 */
public class Homefire implements Device{

    @Override
    public void on() {
        System.out.println("Homefire is on ");
    }

    @Override
    public void off() {
         System.out.println("Homefire is off ");
    }
    
}

 class Airfire implements Device{

    @Override
    public void on() {
        System.out.println("Airfire is on ");
    }

    @Override
    public void off() {
         System.out.println("Airfire is off ");
    }
    
}
