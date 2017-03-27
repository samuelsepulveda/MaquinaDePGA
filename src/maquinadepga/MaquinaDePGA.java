
package maquinadepga;


public class MaquinaDePGA {
    
    //Atri.
    public double promedioAsignaturas[];
    public double horasAsignaturas[];
    public double pesoAsignaturas[];
    public double pesoxPromedio[];
    public int totalAsignaturas=0;
    public double totalHoras=0;
    public double PGA=0;
    //Met.
    
    public void cantidaddeAsignaturas(int Num1){
    
        this.promedioAsignaturas=new double[Num1];
        this.horasAsignaturas=new double[Num1];
        this.pesoAsignaturas=new double[Num1];
        this.pesoxPromedio=new double[Num1];
        this.totalAsignaturas=Num1;
    }
    
    public void ingresarPromedios(int Num2, double Num3){
        
        this.promedioAsignaturas[Num2]=Num3;
                
    }
    
    public void ingresarHoras(int Num4, double Num5){
        
        this.horasAsignaturas[Num4]=Num5;
    }
    
    
    
    

   
    
}
