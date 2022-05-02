
package figurasgeometricas;


public class Volumen extends perimetro{
    
    double iVolumen, iArista;
    public double Cubo( double iArista  ){
                               
        
        iVolumen = Math.pow(iArista, 3);
        
        System.out.println("El volumen de un cubo de arista" +Double.toString(iArista)+ "es de" +Double.toString(iVolumen));
        return 0;

}
    
    double resultadoCono;
    public double Cono( double radioCono, double alturaCono  ){
                               
        
        resultadoCono = Math.PI*radioCono*alturaCono;
        
        System.out.println("El volumen del cono es" +resultadoCono);
        return 0;

}
    
    
      double resultaEsfera;
    public double Esfera( double radioEsfera1  ){
                               
        
        resultaEsfera = (4.0/3.0)*Math.PI*(Math.pow(radioEsfera1, 3));
        
        System.out.println("El volumen de la esfera es: " +resultaEsfera);
        return 0;

}

    public double getiVolumen() {
        return iVolumen;
    }

    public void setiVolumen(double iVolumen) {
        this.iVolumen = iVolumen;
    }

    public double getiArista() {
        return iArista;
    }

    public void setiArista(double iArista) {
        this.iArista = iArista;
    }

    public double getResultadoCono() {
        return resultadoCono;
    }

    public void setResultadoCono(double resultadoCono) {
        this.resultadoCono = resultadoCono;
    }

    public double getResultaEsfera() {
        return resultaEsfera;
    }

    public void setResultaEsfera(double resultaEsfera) {
        this.resultaEsfera = resultaEsfera;
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