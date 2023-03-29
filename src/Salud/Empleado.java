package Salud;

import java.util.Scanner;

public class Empleado extends Persona {
    //ATRIBUTOS PROPIOS DE LA SUBCLASE-> CLASE HIJA
    private String cargo;
    private int valorHora;
    private int horasTrabajadas;
    private String departamento;
    Scanner sc=new Scanner(System.in);

    //METODO CONSTRUCTOR
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getValorHora() {
        return valorHora;
    }
    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //CREAR METODO CONSTRUCTOR DE LA SUBCLASE CON ATRIBUTOS DE LA SUPERCLASE
    public Empleado (String tipoDoc,int documento, String nombre,String apellido,String cargo,int valorHora, int horasTrabajadas,String departamento){
    super(tipoDoc,nombre,apellido, documento);
    this.cargo=cargo;
    this.valorHora=valorHora;
    this.horasTrabajadas=horasTrabajadas;
    this.departamento=departamento;
    }
    //METODOS PROPIOS DE LA SUBCLASE
    public void pedirEmpleado(){
        System.out.println("Digite los siguientes datos" );
        System.out.println("Valor por hora");
        valorHora=sc.nextInt();
        System.out.println("Horas trabajadas");
        horasTrabajadas=sc.nextInt();
        System.out.println("departamento");
        departamento=sc.nextLine();
    }
    public void calcularHonorarios(){
        double valorTotal= valorHora*horasTrabajadas;
        double reteica= (0.966) * (valorTotal);
        valorTotal=valorTotal-reteica;
    }

    public void mostrarEmpleado(){
        System.out.println("Su tipo de documento es "+getTipoDoc()+" Su numero de documento es: "+getDocumento()+" Su nombre es "+getNombre()+" Su apellido es: "+getApellido()+" Su cargo es: "+cargo+" El valor por hora es: "+valorHora+" Las horas trabajadas son: "+horasTrabajadas+" Su departamento es: "+departamento );
    }

   
}