package Principal;
import java.util.Scanner;
import Salud.Persona;
import Salud.Empleado;
public class Inicio {
    public static void main(String [] args){
        Persona usuario=new Persona(); //crear objetos usuario 
  //crear objeto -> instanciar clase
  //variables
     /*   double resultado;
        int peso=0;
        int estatura=0;
        double pesoActual=0;
        
    //invocar metodo
           
        usuario.pedirDatos();
        usuario.mostrarPersona();
        
      resultado=usuario.Calcular(estatura,peso);
        usuario.MayorEdad();

        if(pesoActual<20){
            System.out.println("Su peso esta por debajo de lo ideal");
        }else if(pesoActual==20||pesoActual<25){
            System.out.println("Su peso es ideal");
        }else if(pesoActual>25){
            System.out.println("Usted esta en sobrepeso");
        } */
        

//Argumentos
usuario.pedirDatos();
Empleado user=new Empleado(usuario.getTipoDoc(), usuario.getDocumento(), usuario.getNombre(), usuario.getApellido(),user.getCargo(), user.getValorHora(), user.getHorasTrabajadas(), user.getDepartamento());
user.pedirEmpleado();
user.calcularHonorarios();
user.mostrarEmpleado();



    

    
    } 
}
    
       