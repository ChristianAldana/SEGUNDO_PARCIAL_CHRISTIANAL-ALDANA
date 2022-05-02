
package figurasgeometricas;


public class Area extends perimetro {
                
    double resultadoParalelogramo;
    public double Paralelogramo( double ladoP, double alturaP  ){
                  
        resultadoParalelogramo = 2 * (ladoP + alturaP) ;
             
         System.out.println("El resultado del paralelogramo es" +resultadoParalelogramo);
        return 0;
         
   
    }  
    
     double areaTrapecio;
    public double Trapecio( double BM, double bm, double altT  ){
                  
         areaTrapecio = ((BM + bm)*altT/2);
        
         System.out.println("El resultado del trapecio es" +areaTrapecio);
        return 0;
         
   
    }  

    public double getResultadoParalelogramo() {
        return resultadoParalelogramo;
    }

    public void setResultadoParalelogramo(double resultadoParalelogramo) {
        this.resultadoParalelogramo = resultadoParalelogramo;
    }

    public double getAreaTrapecio() {
        return areaTrapecio;
    }

    public void setAreaTrapecio(double areaTrapecio) {
        this.areaTrapecio = areaTrapecio;
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
