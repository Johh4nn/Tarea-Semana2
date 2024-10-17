package org.example;

public class empelado {
    public String nombre;
    public String cargo;
    public double salario;
    public String fecha;

    public empelado(String nombre, String cargo, double salario, String fecha) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fecha = fecha;
    }

    public  void presentar_empleado(){
        System.out.println("******************************");
        System.out.println("Nombre del empleado: "+nombre);
        System.out.println("Cargo del empleado: "+cargo);
        System.out.println("Salario del empleado: "+salario);
        System.out.println("La fecha de ingreso: "+fecha);
        System.out.println("******************************");
    }
}
