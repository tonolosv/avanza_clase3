/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosletrasminusculas;



/**
 *
 * @author danu
 */
import java.io.*;
public class Dosletrasminusculas {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        char car1, car2;
        System.out.print("Introduzca primer carácter: ");
        car1 = (char)System.in.read();
        System.in.read();
        System.out.print("Introduzca segundo carácter: ");
        car2 = (char)System.in.read();
        if (Character.isLowerCase(car1)) {
            if (Character.isLowerCase(car2)) 
                System.out.println("Los dos son letras minúsculas");
            else
                System.out.println("El primero es una letra minuscula, pero el segundo no lo es");
           }
        else{
            if (Character.isLowerCase(car2)) 
                System.out.println("El segundo es una letra minúscula, pero el primero no");
            else
                System.out.println("Ninguno es letra minúscula.!");
            }
        }
    }
    

