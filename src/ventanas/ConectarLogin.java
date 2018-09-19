/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JOptionPane;

/**
 *
 * @author leole
 */
public class ConectarLogin {
    
    public int Login(String user, String pass){
     int resultado = 0;
        try{
        // 
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Error al conectar" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        
       return resultado; 
    }
}
