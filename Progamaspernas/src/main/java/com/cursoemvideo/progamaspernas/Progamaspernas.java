/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cursoemvideo.progamaspernas;

import java.util.Scanner;

/**
 *
 * @author jrpbnt
 */
public class Progamaspernas {

    public static void main(String[] args) {
        System.out.println("FOI DESGRAÇAAAA!");
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int  perna = tec.nextInt();
        String tipo;
        
        System.out.println("Isso é um(a)");
        switch (perna) {
            case 1 :
                tipo = "Saci";
                break;
            case 2 :
                tipo = "Bípede";
                break;
            case 3 :
                tipo = "tripe";
                break;
            case 4:
                tipo = "Quadrupede";
            case 6:    
                tipo = "Aranha";
                break;
                default:
                tipo = "ET";
                
        }              
         System.out.println(tipo);
         
                       
                        
        }
        
        
    }
   

