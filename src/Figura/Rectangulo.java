package Figura;
public class Rectangulo extends Figuras {
    //Atributos
    private float base;
    private float altura;

    //Método constructor
    public Rectangulo (float base, float altura){
        this.base=base;
        this.altura=altura;
    }   

    //Métodos Accesores
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //Método sub clase
    public void calcularArea(){
        float area=0;
        area=base*altura;
        System.out.println("La base del Rectangulo es: "+base+" la altura es: "+altura+" Entonces su area es: "+area);
    }   
}

