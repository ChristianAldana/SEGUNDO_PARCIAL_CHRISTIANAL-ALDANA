
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
