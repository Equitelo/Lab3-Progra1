/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorioweek3;

import java.util.Scanner;

public class LaboratorioWeek3 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        
        int opcion=0;
        
        while(opcion!=3){
        do{
        System.out.println("");
        System.out.println("1 - # \n2 - #\n3 - #");
        System.out.print("Ingresar la opcion que guste: ");
        opcion=lea.nextInt();
        
        if(opcion<0||opcion>3){
            System.out.println("Escoger un numero dentro de las opciones");
        }
        
        }while(opcion<0||opcion>3);
            if(opcion==1){
                
            }else if(opcion==2){
            
            }else if(opcion==3){
                
            }else{
                System.out.println("No existe");
            }
        }
    }
}
