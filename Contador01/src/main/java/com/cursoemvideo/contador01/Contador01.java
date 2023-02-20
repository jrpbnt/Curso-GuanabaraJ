/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cursoemvideo.contador01;

/**
 *
 * @author jrpbnt
 */
public class Contador01 {

    public static void main(String[] args) {
        System.out.println("Cambalhota");
        int cc = 0;
        while (cc<=20) {
            cc++;
             if (cc == 2 || cc == 3 || cc == 4) {
                 continue;                 
            }
             if (cc == 7) {
                 break;
                 
             }
            System.out.println("Cambalhota" + cc);
            
        }
    }
}
