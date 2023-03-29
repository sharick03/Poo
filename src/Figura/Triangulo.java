package Figura;
public class Triangulo extends Figuras {
//Atributos
    private float base;
    private float altura;

//Método Constructor
    public Triangulo (float base, float altura){
        this.base=base;
        this.altura=altura;
    }
  //métodos accesores
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
    //metodo de la Subclase
    public void calcularArea(){
        float area=0;
        area=base*altura/2;
        System.out.println("La base del Triangulo es: "+base+" y la altura es: "+altura+" Entonces su area es: "+area);
        

        



    }
}
