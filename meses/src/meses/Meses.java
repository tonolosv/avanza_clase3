/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meses;

/**
 *
 * @author danu
 */
import java.util.*;
public class Meses {

    /**
     * @param args the command line arguments ||
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int Mes;
        System.out.println("Ingrese un número entre el 1 y 12: ");
        Mes = sc.nextInt();
        if(Mes<1 || Mes>12)
        System.out.println("Mes incorrecto");
        else
        switch (Mes) {
            case 1: System.out.print("Enero");
                break;
            case 2: System.out.print("Febrero");
                break;
            case 3: System.out.print("Marzo");
                break;
            case 4: System.out.print("Abril");
                break;
            case 5: System.out.print("Mayo");
                break;
            case 6: System.out.print("Junio");
                break;
            case 7: System.out.print("Julio");
                break;
            case 8: System.out.print("Agosto");
                break;
            case 9: System.out.print("Septiembre");
                break;
            case 10: System.out.print("Octubre");
                break;
            case 11: System.out.print("Noviembre");
                break;
            case 12: System.out.print("Diciembre");
                break;
    } 
    if(Mes==1 && Mes==3 && Mes==5 && Mes==7 && Mes==8 && Mes==10 && Mes==12)    
    System.out.println(" es un mes de 31 días");
    else if(Mes==2)
        System.out.println(" es un mes de 28 días");
    else
        System.out.println(" es un mes de 30 días");
                }
}

