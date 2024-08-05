/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author joseo
 */
public class Validacion {
    
    public boolean validarCorreo (String Correo){
        String x = "@gmail.com";
        String y = "@hotmail.com";
        String z = "@outlook.com";
        String ito = "@itoaxaca.edu.mx";
        String ya = "@yahoo.com";
        if(Correo.contains(x)||Correo.contains(y)||Correo.contains(z)||Correo.contains(ito)||Correo.contains(ya)) return true;
        return false;
    }
    
    public boolean validarContra (String contra){
        boolean s = false;
        for (int i=0;i<contra.length();i++){
            if(Character.isUpperCase(contra.charAt(i))){
                s=true;
            }
        }
        boolean s2 = false;
        for (int i=0;i<contra.length();i++){
            if(Character.isLowerCase(contra.charAt(i))){
                s2=true;
            }
        }
        
        boolean s3 = false;
        for (int i=0;i<contra.length();i++){
            if(!Character.isLetterOrDigit(contra.charAt(i))){
                s3=true;
            }
        }
        
        if(s==true && s2==true && s3==true){
            return true;
        }
        return false;
    }
}
