
package figurasgeometricas;


public class clasePadre {
    
    double lado, area, per;
    
    public double Cuadrado( double lado ){
         area= lado *lado;
         per = (lado + lado + lado + lado);
         
         System.out.println("El area del cuadro es" +area);
         System.out.println("El perimetro del cuadro es"+per);
         
        return 0;
    }
    
    
    double n1, n2, perim;
    
       public double Rectangulo( double base, double altura  ){
         
          perim = 2  * (base + altura);
           
         System.out.println("El perimetro del rectangulo es"+perim);
         
        return 0;
       
    } 
       
            double perimetroTriangulo;
    
         public double Triangulo( double triangulo1, double triangulo2, double triangulo3  ){
         
        perimetroTriangulo = triangulo1 + triangulo2 + triangulo3;
             
         System.out.println("El perimetro del rectangulo es" +perimetroTriangulo);
         
        return 0;
       
    } 
    
}
    
}
