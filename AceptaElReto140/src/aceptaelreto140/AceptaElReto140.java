/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto140;

import java.util.*;

/**
 *
 * @author Usuario DAM 1
 */
public class AceptaElReto140 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String numero = sc.nextLine();
        
        int sum = 0;
        String salida = "";
        
        for (int i = 0; i < numero.length(); i++) {
            int n = Integer.parseInt("" + numero.charAt(i));
            sum += n;
            if (i != numero.length() - 1) {
                salida = salida.concat(n + " + ");
            } 
            else {
                salida = salida.concat(n + " = " + sum);
            }
        }

        System.out.println(salida);
    }

}
