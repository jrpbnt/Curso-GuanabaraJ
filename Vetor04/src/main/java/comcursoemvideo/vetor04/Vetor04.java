/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package comcursoemvideo.vetor04;

import java.util.Arrays;
/**
 *
 * @author jrpbnt
 */
public class Vetor04 {

    public static void main(String[] args) {
        System.out.println("Star platinum");
        int vet[] = {3,7,6,1,9,4,2};
        for(int v:vet){
            System.out.print(v);
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 8);
        System.out.println("Encontrei o valor na posição " + p );
                
    }
}
