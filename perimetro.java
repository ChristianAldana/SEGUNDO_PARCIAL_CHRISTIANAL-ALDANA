
package figurasgeometricas;


public class perimetro {
    
    double lado, area, per;
    
    public  double Cuadrado( double lado ){
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
         
         
         double perimetro1;
    
         public double circulo( double radio, double radio1){
         
            radio1 = 2*Math.PI*radio;
             
         System.out.println("El perimetro del circulo es es" +radio1);
        return 0;
         
    } 

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getPerim() {
        return perim;
    }

    public void setPerim(double perim) {
        this.perim = perim;
    }

    public double getPerimetroTriangulo() {
        return perimetroTriangulo;
    }

    public void setPerimetroTriangulo(double perimetroTriangulo) {
        this.perimetroTriangulo = perimetroTriangulo;
    }

    public double getPerimetro1() {
        return perimetro1;
    }

    public void setPerimetro1(double perimetro1) {
        this.perimetro1 = perimetro1;
    }
    
         
         
         
}
    

