/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letramayuscula_alter;

/**
 *
 * @author danu
 */
import java.io.*;
import java.util.*;
public class LetraMayuscula_alter {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        char car, car1;
        System.out.print("Ingrese una letra: ");
        car = (char)System.in.read();
        
        if (car>='A' && car <='Z') 
            System.out.println("'"+car+"'"+" Es una letra mayuscula");
        else
            System.out.println("'"+car+"'"+" No es una letra mayuscula");
        }
        
    }
    

