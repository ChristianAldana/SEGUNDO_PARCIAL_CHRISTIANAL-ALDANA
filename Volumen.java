
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

}