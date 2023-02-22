/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cursoemvideo.numeros;

import java.util.Scanner;

/**
 *
 * @author jrpbnt
 */
public class Numeros {

    public static void main(String[] args) {
        System.out.println("Rafaela lindaaaa");
        
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um numero:");
            teclado.nextInt();
            n = teclado.nextInt();
            s += n;
            System.out.print("Quer Continuar [S/N]");
            resp = teclado.next();         
        } while(resp.equals("S"));
        System.out.println("A soma de todos os valores é "+ s);   
    }
}
