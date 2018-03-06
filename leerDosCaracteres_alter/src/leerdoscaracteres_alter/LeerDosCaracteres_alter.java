/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerdoscaracteres_alter;

/**
 *
 * @author danu
 * @throws java.io.IOException //no va acá
 */
import java.io.*;
public class LeerDosCaracteres_alter {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    char car1, car2;
        System.out.print("Ingrese un caracter: ");
        car1 = (char)System.in.read();
        System.in.read();
        System.out.print("Ingrese otro caracter: ");
        car2 = (char)System.in.read();        
        Character c1 = car1;
        Character c2 = car2;
        /**
         * Character c1 = Characeter car1; me pide eliminar el Character
         * Character c2 = Character car2; me pide eliminar el Character
         */
        if(c1.equals(c2)) 
             System.out.println(car1 + " y " + car2 + " Son caracteres iguales");
        else
            System.out.println(car1 + " y " + car2 + " No son caracteres iguales");
        }
    }
    

