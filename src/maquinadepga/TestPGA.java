// ver comentario 
package maquinadepga;
import java.util.Scanner;

public class TestPGA {
    
    static Scanner ent = new Scanner(System.in);

    
    public static void main(String[] args) {
        
        MaquinaDePGA mpga = new MaquinaDePGA();
        Calculadora c = new Calculadora();
    while(mpga.totalAsignaturas<=0){  
        System.out.println("ingrese cantidad de asignaturas");
        mpga.cantidaddeAsignaturas(ent.nextInt());
    }
        
        for(int q=0;q<mpga.totalAsignaturas; q++){
            while(mpga.promedioAsignaturas[q]<1 || mpga.promedioAsignaturas[q]>7){
            System.out.println("ingrese el PROMEDIO de la asignatura "+(q+1));
            mpga.ingresarPromedios(q,ent.nextDouble());
            }
            while(mpga.horasAsignaturas[q]<1){
            System.out.println("ingrese las HORAS de la asignatura "+(q+1));
            mpga.ingresarHoras(q,ent.nextDouble());
            }
        }
        
        for(int e=0;e<mpga.totalAsignaturas;e++){
            c.setNum1(mpga.totalHoras);
            c.setNum2(mpga.horasAsignaturas[e]);
            mpga.totalHoras=c.sumar();
         
        }
        
        for(int r=0;r<mpga.totalAsignaturas;r++){
            c.setNum1(mpga.horasAsignaturas[r]);
            c.setNum2(mpga.totalHoras);
            mpga.pesoAsignaturas[r]=c.dividir();
        }
        
        for(int t=0;t<mpga.totalAsignaturas;t++){
            c.setNum1(mpga.pesoAsignaturas[t]);
            c.setNum2(mpga.promedioAsignaturas[t]);
            mpga.pesoxPromedio[t]=c.multiplicar();
        }
        for(int y=0;y<mpga.totalAsignaturas;y++){
            c.setNum1(mpga.PGA);
            c.setNum2(mpga.pesoxPromedio[y]);
            mpga.PGA=c.sumar();
        }
        System.out.println("Tu PGA tiene un valor de "+mpga.PGA);
    
    
    }
            
        
        
        
        
        
    }
    
