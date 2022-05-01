
package figurasgeometricas;

import java.util.Scanner;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        int accion, accion2;
        
        clasePadre padre = new clasePadre(); 
        
        Scanner leerAccion = new Scanner (System.in);
        System.out.println("1.FigurasConPerimetro");
        System.out.println("2.FigurasConArea");
        System.out.println("3.FiguraConVolumen");
        System.out.println("Digite el numero del tipo de la funcion que desea realizar");
                
        accion = leerAccion.nextInt();
                   
        switch (accion) {
          
       case 1:
        System.out.println("Que figura geometrica desea realizar su funcion");           
        System.out.println("1.Cuadrado");
        System.out.println("2.Rectangulo");
        System.out.println("3.Triangulo");
        System.out.println("4.TrianguloRectangulo");
        System.out.println("5.Circulo");
        System.out.println("Digite el numero del tipo de la funcion que desea realizar");
           accion2 = leerAccion.nextInt();     
            
           switch (accion2) {
          
                case 1:
               double lado;
           
              System.out.println("Ingrese cuanto mide un lado de el cuadrado");
               Scanner leerLado = new Scanner(System.in);
                
                lado = leerLado.nextDouble();
              
                System.out.println(padre.Cuadrado(lado));

                break;
                
               case 2:
           
             double base, altura;
                Scanner leerBase = new Scanner(System.in);
                Scanner leerAltura = new Scanner (System.in);
                
                System.out.println("Ingrese la base ");
                base = leerBase.nextDouble();
                
                System.out.println("Ingrese la altura");
                altura = leerAltura.nextDouble();
                
                
                System.out.println(padre.Rectangulo(base, altura));

                break; 
        
                case 3:
           
             double triangulo1,triangulo2,triangulo3;
                Scanner leerLado1 = new Scanner(System.in);
                Scanner leerLado2 = new Scanner(System.in);
                Scanner leerLado3 = new Scanner(System.in);

                System.out.println("Ingrese el lado 1 del triangulo ");
                triangulo1 = leerLado1.nextDouble();
                
                System.out.println("Ingrese el lado 2 del triangulo ");
                triangulo2 = leerLado2.nextDouble();
                
                System.out.println("Ingrese el lado 3 del triangulo ");
                triangulo3 = leerLado3.nextDouble();
                
                System.out.println(padre.Triangulo(triangulo1, triangulo2, triangulo3));

                break; 
                
                case 4:
           
                double perimetro, radio;
                Scanner leerCirculo = new Scanner(System.in);

            
                System.out.println("Ingrese el perimetro del circulo ");
                radio = leerCirculo.nextDouble();
                
                System.out.println(padre.Triangulo(triangulo1, triangulo2, triangulo3));

                break; 
        
           }     
    }
    
}
    

