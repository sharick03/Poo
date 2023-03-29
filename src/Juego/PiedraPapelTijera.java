package Juego;
import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera implements Juego {

    //Atributos
    private String jugador;
    private int opcion;
    private int maquina;
    Scanner sc=new Scanner(System.in);

    public void iniciar() {
        System.out.println("Ingrese su nombre");
        jugador=sc.next();
    }

    public void jugar() {
       System.out.println(jugador+" Escoja \n1-Piedra \n2-Papel \n3-Tijera");
       opcion=sc.nextInt();

       Random aleatorio= new Random();
        maquina=aleatorio.nextInt(3)+1;
        System.out.println("Generando elección");
    }

    public void finalizar() {
        if(opcion == maquina){
            System.out.println(jugador+" quedo en empate");
        }else if ((opcion == 1 && maquina == 3) || (opcion == 2 && maquina == 1) || (opcion== 3 && maquina == 2)){
            System.out.println(jugador+"La máquina gana");
             
        } else {
            System.out.println(jugador+" ganaste");
            sc.close();
    }

    }
}
