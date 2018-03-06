/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplodiez;

/**
 *
 * @author danu
 */
import java.util.*;
public class MultiploDiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Ingrese un número: ");
        N = sc.nextInt();
        if(N%10==0)
        System.out.println(N + " Es multiplo de diez");
        else
        System.out.println(N + " No es multiplo de diez");
    }
  }
