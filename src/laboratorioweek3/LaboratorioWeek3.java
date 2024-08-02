/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorioweek3;

import java.util.Scanner;
import java.util.Random;

public class LaboratorioWeek3 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        Random aleatorio= new Random();
        
        int opcion=0;
        
        while(opcion!=3){
        do{
        System.out.println("");
        System.out.println("1 - Rock Paper Scissor \n2 - Piramide\n3 - piramide\n 4 - Salir");
        System.out.print("Ingresar la opcion que guste: ");
        opcion=lea.nextInt();
        
        if(opcion<0||opcion>3){
            System.out.println("Escoger un numero dentro de las opciones");
        }
        
        }while(opcion<0||opcion>3);
            if(opcion==1){
                
                int maquina;
                String mazoMaquina;
                
                while(true){
                System.out.print("Ingresar 'piedra', 'papel' o 'tijera': ");
                String mazo=lea.next().toLowerCase();
                
                maquina=aleatorio.nextInt(3)+1;
                
                if(maquina==1){
                    mazoMaquina="piedra";
                    System.out.println(" ");
                    System.out.println("Opcion de la maquina: "+mazoMaquina);
                    System.out.println("");
                }else if(maquina==2){
                    mazoMaquina="papel";
                    System.out.println(" ");
                    System.out.println("Opcion de la maquina: "+mazoMaquina);
                    System.out.println("");
                }else if(maquina==3){
                    mazoMaquina="tijera";
                    System.out.println(" ");
                    System.out.println("Opcion de la maquina: "+mazoMaquina);
                    System.out.println("");
                }else{
                    System.out.println("Nada");
                }
                System.out.println("Opcion del usuario: "+mazo);
                System.out.println("");
                
                if(maquina==1&&mazo.equalsIgnoreCase("papel")){
                    
                    System.out.println("Ganaste!");
                }else if(maquina==2&&mazo.equalsIgnoreCase("tijera")){
                    
                    System.out.println("Ganaste!");
                }else if(maquina==3&&mazo.equalsIgnoreCase("piedra")){
                    
                    System.out.println("Ganaste!");
                }else if(maquina==3&&mazo.equalsIgnoreCase("tijera")||maquina==2&&mazo.equalsIgnoreCase("papel")||maquina==1&&mazo.equalsIgnoreCase("piedra")){
                    
                    System.out.println("Empate! ");
                }else{
                
                    System.out.println("Perdiste!");
                }
                System.out.println("Desea volver a jugar?(SI/NO)");
                String respuesta = lea.next().toLowerCase();
                
                if(respuesta.equals("no")){
                    break;
                }
                }
            }else if(opcion==2){
                int entero;
                String sumaCadena="";
                int suma = 0;

                System.out.print("Ingrese un numero entero: ");
                entero=lea.nextInt();

                String enteroTexto=Integer.toString(entero);
                
                int longitud=enteroTexto.length()-1;
                
                for(int contador=0;contador<=longitud;contador++){
                    char numeroChar = enteroTexto.charAt(contador);
                    
                    int numero = Integer.parseInt(Character.toString(numeroChar));
                    
                    sumaCadena += numero+" + ";
                    suma+=numero;
                } 
                String sumaSubs= sumaCadena.substring(0, sumaCadena.length()-3);
                System.out.println(sumaSubs+" = "+suma);
            }else if(opcion==3){
                
            }else{
                System.out.println("No existe");
            }
        }
    }
}
