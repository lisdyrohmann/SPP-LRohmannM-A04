/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lrohmann.a04;
import java.util.Scanner;

/**
 *
 * @author lisdyrohmann
 */
public class SPPLRohmannA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Lisdy Nadine Rohmann Martínez 513659
    //Carrera: IIS
    //Actividad 4 
    
    //Variables
    int opEntrada; 
    Scanner Sc= new Scanner(System.in);  
    double a;
    
    
    //Menú
        System.out.println("Introduzca la opción deseada");
        System.out.println("1. Calcular tangente");
        System.out.println("2. Calcular seno");
        System.out.println("3. Calcular coseno");
        System.out.println("4. Salir"); 
        opEntrada = Sc.nextInt(); 
        
        switch (opEntrada){
        case 1:
            System.out.println("Cálculo de tangente");
            System.out.println("Introduce un ángulo entre 0 y 360º: ");
            a = Sc.nextDouble();
        double b = Math.toRadians(a);
            System.out.println("La tangente de " + a + " es: " + Math.tan(b));
        break;
        
        
        case 2:
            System.out.println("Cálculo de seno");
            System.out.println("Introduce un ángulo entre 0 y 360º: ");
            a = Sc.nextDouble();
        double c= Math.toRadians(a);
        System.out.println("El seno de " + a + " es: " + Math.sin(c));
        break;
        
        
        case 3:
            System.out.println("Cálculo de coseno");
            System.out.println("Introduce un ángulo entre 0 y 360º: ");
            a = Sc.nextDouble();
        double d= Math.toRadians(a);
        System.out.println("El coseno de " + a + " es: " + Math.cos(d));
        break;
        
        default:
                System.out.println("Adiós!");  
                
      
        
    }
    
        
       
        
        }
    
        
                
                
                
                
                
                
                
                
         
       
        
   
   
    
}
