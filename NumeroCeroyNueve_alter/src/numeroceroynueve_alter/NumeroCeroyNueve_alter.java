/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroceroynueve_alter;

/**
 *
 * @author danu
 */
import java.io.*;
public class NumeroCeroyNueve_alter {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        char Num1;
        System.out.println("Presiona una tecla");
        Num1=(char)System.in.read();
        if(Character.isDigit(Num1))
            System.out.println(Num1+" Es un número");
        else
            System.out.println(Num1+" No es un número");
    }
    
}
