package Salud;
import java.util.Scanner;
public class Persona {
    Scanner sc=new Scanner (System.in);

    //ENCAPSULAMIENTO PERMIRE QUE LOS ATRIBUTOS DE UNA CLASE SEAN EDITADOS POR METODOS
    //ATRIBUTOS PRIVADOS
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private String sexo;
    private double estatura=0;
    private int edad;
    private int peso=0;

    //METODO CONSTRUCTOR VACIO 
    public Persona(){
    }

    //METODOS CONSTRUCTOR, CON PARAMETROS CON NOMBRES IGUALES
    public Persona(String tipoDoc,String nombre,String apellido,int documento){
        this.tipoDoc=tipoDoc;
        this.nombre=nombre;
        this.apellido=apellido;
        this.documento=documento;

    } 
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    //METODOS
    public void pedirDatos(){
        System.out.println("Digite su nombre");
        nombre=sc.next();
        System.out.println("Digite su apellido");
        apellido=sc.next();
        System.out.println("Digite su tipo de documento");
        tipoDoc=sc.next();
        System.out.println("Digite su documento");
        documento=sc.nextInt();
     /*    System.out.println("Digite su edad");
        edad=sc.nextInt();
        System.out.println("Digite su peso");
        peso=sc.nextInt();
        System.out.println("Digite su estatura");
        estatura=sc.nextDouble();
        System.out.println("Digite su sexo masculino o femenino");
        sexo=sc.next(); */
    }
    //METODO SIN PARAMETROS
    public void mostrarPersona(){
        System.out.println("La persona registrada es "+nombre+apellido);
        System.out.println("Su tipo de documento es "+tipoDoc);
        System.out.println("Su documento es "+documento);
    /*    System.out.println("Su peso es "+peso);
        System.out.println("Su estatura es "+estatura);
        System.out.println("Su edad es "+edad);
        System.out.println("Su sexo es "+sexo); */
    }
     //METODO CON PARAMETROS
    /* public void mostrarPersona(String  nombre, String apellido, int tipoDoc, int documento, int peso, double estatura, int edad, String sexo ){
        System.out.println("La persona registrada es "+nombre+apellido);
        System.out.println("Su tipo de documento es "+tipoDoc);
        System.out.println("Su documento es "+documento);
        System.out.println("Su peso es "+peso);
        System.out.println("Su estatura es "+estatura);
        System.out.println("Su edad es "+edad);
        System.out.println("Su sexo es "+sexo);
    }
    
    
   /* public void Calcular() {
        double pesoActual=(peso)/(estatura*estatura);
        System.out.println("Su peso actual es de "+pesoActual);
        if(pesoActual<20){
            System.out.println("Su peso esta por debajo de lo ideal");
        }else if(pesoActual==20||pesoActual<25){
            System.out.println("Su peso es ideal");
        }else if(pesoActual>25){
            System.out.println("Usted esta en sobrepeso");
        } 
    }


      //Reto 2 
    public double Calcular(double estatura, int peso){
        double pesoActual=(peso)/(estatura*estatura);
        return pesoActual;  
    }
    
    public void MayorEdad(){
        if(edad<18){
            System.out.println("Usted es menor de edad");
        }else if(edad>18){
            System.out.println("Usted es mayor de edad");
        }
 */
    

    }
