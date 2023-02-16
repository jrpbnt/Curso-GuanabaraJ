/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package idade.progamaidade;

import java.util.Scanner;


/**
 *
 * @author jrpbnt
 */
public class ProgamaIdade {

    public static void main(String[] args) {
        System.out.println("NICEEEEEEEEEEEEE");
        
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano vc nasceu");
        
        int nasc = t.nextInt();
        int i = 2023-nasc;
        System.out.println("Sua idade é " + i);
         if (i>18) {
             System.out.println("Maior de Idade");
         } else {
             System.out.println("Menor de Idade");
              

             
         }
         
       }
        
        
        
    }

