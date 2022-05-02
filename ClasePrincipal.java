
package figurasgeometricas;

import java.util.Scanner;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        int accion, accion2, accion3, accion4;
        
        perimetro padre = new perimetro(); 
        Area hija = new Area();
        Volumen hija2 = new Volumen();
        
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
                 System.out.println("4.Circulo");
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

                         double radio;
                         Scanner leerCirculo = new Scanner(System.in);


                         System.out.println("Ingrese el perimetro del circulo ");
                         radio = leerCirculo.nextDouble();

                         System.out.println(padre.circulo(radio, radio));


                         break; 
           }  
          case 2: 
                 System.out.println("Que figura geometrica desea realizar su funcion");           
                 System.out.println("1.Cuadrado");
                 System.out.println("2.Rectangulo");
                 System.out.println("3.Triangulo");
                 System.out.println("4.Circulo");
                 System.out.println("5.Paralelogramo");
                 System.out.println("6.Trapezoide");
                 System.out.println("Digite el numero del tipo de la funcion que desea realizar");
                  
                    accion3 = leerAccion.nextInt();     
               

                 switch (accion3) {
                        
                        case 5:
                            double ladoP,alturaP;
                          Scanner leerLadoParale = new Scanner(System.in);
                         Scanner leerLadoParale2 = new Scanner(System.in);
                        
                        
                         System.out.println("Ingrese el lado ");
                         ladoP = leerLadoParale.nextDouble();

                         System.out.println("Ingrese la altura ");
                         alturaP = leerLadoParale2.nextDouble();
                       
                         System.out.println(hija.Paralelogramo(ladoP, alturaP));
                         
                         break;
                         
                         
                         case 6:
                             
                            double BM,bm, altT;
                            
                          Scanner leerBaseMayorTrapecio = new Scanner(System.in);
                         Scanner leerBaseMenorTrapecio = new Scanner(System.in);
                          Scanner leerAlturaTrapecio = new Scanner(System.in);

                        
                         System.out.println("Ingrese la base mayor ");
                         BM = leerBaseMayorTrapecio.nextDouble();

                         System.out.println("Ingrese la base menor");
                         bm = leerBaseMenorTrapecio.nextDouble();
                       
                         System.out.println("Ingrese la altura");
                         altT = leerAlturaTrapecio.nextDouble();
                       
                         
                         System.out.println(hija.Trapecio(bm, bm, altT));
                         
                         break;
                         
                        
  
  
  
    }
          
        } 
}}
  

