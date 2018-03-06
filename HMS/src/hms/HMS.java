/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

/**
 *
 * @author danu
 */
import java.util.*;
public class HMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int H,M,S;
        System.out.println("Ingrese una hora por favor: ");
        H = sc.nextInt();
        System.out.println("Ingrese minutos: ");
        M = sc.nextInt();
        System.out.println("Ingrese segundos: ");
        S = sc.nextInt();
        
        if (H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60) 
            System.out.println("Hora correcta");
            else
            System.out.println("Hora incorrecta");
        System.out.println("La hora ingresada es: " + H + ":" + M + ":" + S);
        }
}
