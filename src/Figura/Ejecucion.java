package Figura;
import java.util.Scanner;

public class Ejecucion {
    public static void main(String []args){
        int n;
        float base;
        float altura;
        float radio;
        String res;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Bienvenido al menu de opciones \tEscoja una Figura a la que desee calcular el area");

        do{
            System.out.println("\n1-Triangulo \n2-Rectangulo \n3-Circulo");
            n=sc.nextInt();
    
        //TRIANGULO 
            if (n == 1){
                System.out.println("Ingrese el valor de la base Triangulo");
                base=sc.nextFloat();
                System.out.println("Ingrese el valor de la Altura del Triangulo");
                altura=sc.nextFloat();
    
                //Crear el objeto para la sub clase Triangulo
                Triangulo t1= new Triangulo(base, altura);
                t1.calcularArea();
    
        //RECTANGULO
            }else if(n == 2){
                System.out.println("Ingrese el valor de la base del Rectangulo");
                base=sc.nextFloat();
                System.out.println("Ingrese el valor de la Altura del Rectangulo");
                altura=sc.nextFloat(); 
        
                //Crear el objeto para la sub clase rectangulo
                Rectangulo r1=new Rectangulo(base, altura);
                r1.calcularArea();
    
        //CIRCULO
            }else if(n == 3){
                System.out.println("Ingrese el valor del radio del circulo");
                radio=sc.nextFloat();
            
                //Crear el objeto para la subclase Circulo
                Circulo c1=new Circulo(radio);
                c1.calcularArea();
        
            } else {
                System.out.println("Digite una figura valida ");
    
            }
            System.out.println("Desea calcular otra figura si o no");
            res=sc.next();

        } while (res.equalsIgnoreCase("si"));
    }
}

    

