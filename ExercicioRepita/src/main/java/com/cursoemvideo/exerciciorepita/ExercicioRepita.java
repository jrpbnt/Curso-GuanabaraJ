/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cursoemvideo.exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author jrpbnt
 */
public class ExercicioRepita {

    public static void main(String[] args) {
        System.out.println("meu pai é brabo");
        int n , s = 0;
        int c = 0;
        int par = 0;
        int impar = 0;
        int maior = 0;
        int M = 0;
        do {
         n =  Integer.parseInt(JOptionPane.showInputDialog
        (null,"<html>Informe um numero: <br><em>(valor 0 interrompe)</em></html>"));
            s += n;
            c ++;
             M = s / c;
                  if(n % 2 == 0) {
           par++;
       }else{
           impar++;
           
       }
        if(n >=100) {
            maior++;
            
        }else{
            
        }     
        
         
        }while(n != 0 );
        JOptionPane.showMessageDialog(null, "<html>Resultado final<hr>" +
                "<br>Total de  Valores:" + c +  
                "<br>Total pares :"+ par + "<br>total impares:" + impar + 
                "<br>Valores acima de 100:" + maior + 
                "<br>Media dos Valores" + M + "</html>");
        
   
            
            
        
           
        
                
        
        
        
        
        
        
                
    }
}
