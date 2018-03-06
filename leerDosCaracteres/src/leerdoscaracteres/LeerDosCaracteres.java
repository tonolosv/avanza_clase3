/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerdoscaracteres;

/**
 *
 * @author danu
 */
import java.io.*;
public class LeerDosCaracteres {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        char car1, car2;
        System.out.print("Introduzca un carácter: ");
        car1 =(char)System.in.read();
        System.in.read();
        System.out.print("Introduzca otro carácter: ");
        car2 = (char)System.in.read();
        
        if (car1==car2) 
            System.out.println(car1 + " y " + car2 + " Son caracteres iguales");
        else
            System.out.println(car1 + " y " + car2 + " No son caracteres iguales");
            
        }
    }
    

