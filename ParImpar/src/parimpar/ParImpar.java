/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar;

/**
 *
 * @author danu
 */
import java.util.*;
public class ParImpar {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Introduzca un número entero: ");
        N = sc.nextInt();
        if(N%2==0) 
            System.out.println("Par");
           else
            System.out.println("Impar");
        }
    }
    

