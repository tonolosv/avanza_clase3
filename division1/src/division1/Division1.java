/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package division1;

/**
 *
 * @author danu
 */
//import java.io.*; no se ocupara
import java.util.*;
public class Division1 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {//throws IOException no se ocupara
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        double num1,num2;
        System.out.println("Ingrese el primer número: ");
        //num1=(double)System.in.read();
        num1=sc.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        //num2=(double)System.in.read();
        num2=sc.nextDouble();
        //System.in.read();
        
        //if(num1='0' && num2>='1') 
        if(num2==0)
            System.out.println("No se puede dividir por cero");
        else{
        System.out.println(num1 + "/" + num2 + " = " + num1/num2);
        //System.out.printf("%2.f/%.2f=%.2f%n",num1,num2,num1/num2);
        }
    }
    
}
