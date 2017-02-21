/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rreyesc.tarea02p02;
import java.util.Scanner;
/**
 *
 * @author roxana
 */
public class SPP2RREYESCTAREA02P02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Roxana Reyes Córdoba
        //A00820572
        //IIS
        Scanner kb = new Scanner (System.in);
        int valinf, valsup;
        double res;
        
        System.out.println("Porfavor introduzca un numero entero inferior");
        valinf = kb.nextInt();
        System.out.println("Porfavor introduzca un numero entero superior");
        valsup = kb.nextInt();
        
        do {
            valinf ++;
            
            res = valinf % 2;
            if (res > 0 || res < 0){
                System.out.println(valinf + " no es divisible entre 2");
            }
            else {
                System.out.println(valinf + " es divisible entre 2");
            }
            
            res = valinf % 3;
            if (res > 0 || res < 0){
                System.out.println(valinf + " no es divisible entre 3");
            }
            else {
                System.out.println(valinf + " es divisible entre 3");
            }
            
            res = valinf % 5;
            if (res > 0 || res < 0){
                System.out.println(valinf + " no es divisible entre 5");
                
            }
            else {
                System.out.println(valinf + " es divisible entre 5");
            }
        }
        while(valinf < valsup);
    }
}
    
    

