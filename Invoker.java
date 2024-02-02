/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class Invoker {
    
    
  List<CommandInterfac> commands=new ArrayList<>();
    
    
    
    public void  addCommand(CommandInterfac commandInterfac){
        commands.add(commandInterfac);
    }
    public void executeCommand(){
        for(CommandInterfac commandInterfac :commands){
            commandInterfac.excute();
        }
    }
    
    
}
