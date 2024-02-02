/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package command;

/**
 *
 * @author hp
 */
public class Command {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Device device=new Homefire();
        CommandInterfac commandInterfac=new offCommand(device);
        CommandInterfac commandInterfac2=new OnCommand(device);
        Invoker invoker=new Invoker();
        invoker.addCommand(commandInterfac);
        invoker.addCommand(commandInterfac2);
        invoker.executeCommand();
        
        
        
        
        
    }
    
}
