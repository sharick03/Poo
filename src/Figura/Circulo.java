package Figura;
public class Circulo extends Figuras {
    //Atributos
    private float radio;

    //Método Constructor
    public Circulo (float radio){
        this.radio=radio;
    }

     //Métodos Accesores
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    //Método sub clase
    public void calcularArea(){
        float area=0;
        area=radio*2;
        System.out.println("El radio de circulo es: "+radio+" Entonces su area es de: "+area);
        

    }
    
}