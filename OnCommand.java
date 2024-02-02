/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author hp
 */
public class OnCommand  implements CommandInterfac{
    
    Device device ;
    public OnCommand(Device device){
        this.device=device;
    }
    
    

    @Override
    public void excute() {
      device.on();
    }
    
}
 class offCommand  implements CommandInterfac{
    
    Device device ;
    public offCommand(Device device){
        this.device=device;
    }
    
    

    @Override
    public void excute() {
      device.off();
    }
    
}
