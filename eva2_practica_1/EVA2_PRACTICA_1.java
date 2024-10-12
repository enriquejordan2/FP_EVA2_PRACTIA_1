/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica_1;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA2_PRACTICA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        String texto;
        Scanner captu = new Scanner(System.in);
        //captu.nextLine();
        System.out.println("Escriba el texto: ");
       texto = captu.nextLine();
        System.out.println("Intrdusca el numero: ");
       num = captu.nextInt();
        
        
        for (int i = 1; i <= num;i++){
            System.out.println(i+": "+texto);
        
        
        
            //System.out.println(i +"-");
        }
        
        
        
        
        
        
        
        
    }
    
}
