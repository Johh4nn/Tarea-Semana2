package org.example;

public class jugador {
    public String nombre;
    public String posicion;
    public int edad;
    public int numero_cam;

    public jugador(String nombre, String posicion, int edad, int numero_cam) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numero_cam = numero_cam;
    }

    public  void presentar_jugador(){
        System.out.println("---------------------------");
        System.out.println("Nombre del jugador: "+nombre);
        System.out.println("Posicion del jugador: "+posicion);
        System.out.println("Edad del jugador: "+edad);
        System.out.println("Numero de la camiseta del jugador: "+numero_cam);
        System.out.println("----------------");
    }
}
