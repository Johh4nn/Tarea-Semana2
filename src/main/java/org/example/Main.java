package org.example;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        //crearjugadores();
        crearempelados();


    }

    public static void crearempelados(){
        Scanner input = new Scanner(System.in);
        String nombre;
        String cargo;
        double salario;
        String fecha_inicio;

        System.out.println("Ingrese el nombre del empleado:   ");
        nombre = input.nextLine();
        System.out.println("Ingrese el cargo del empleado:   ");
        cargo = input.nextLine();
        System.out.println("Ingrese el Salario del empleado:    ");
        salario = input.nextDouble();
        input.nextLine();
        System.out.println("Ingrese la fecha de inicio del  empleado:    ");
        fecha_inicio= input.nextLine();
        input.nextLine();

        empelado empelado1 = new empelado(nombre,cargo,salario,fecha_inicio);
        System.out.println("*****************************");

        System.out.println("Ingrese el segundo empleado");
        System.out.println("Ingrese el nombre del empleado:   ");
        nombre = input.nextLine();
        System.out.println("Ingrese el cargo del empleado:   ");
        cargo = input.nextLine();
        System.out.println("Ingrese el Salario del empleado:    ");
        salario = input.nextDouble();
        input.nextLine();
        System.out.println("Ingrese la fecha de inicio del  empleado:    ");
        fecha_inicio= input.nextLine();
        input.nextLine();

        empelado empelado2 = new empelado(nombre,cargo,salario,fecha_inicio);
        System.out.println("****************************************");

        System.out.println("Ingrese el tercer empleado");
        System.out.println("Ingrese el nombre del empleado:   ");
        nombre = input.nextLine();
        System.out.println("Ingrese el cargo del empleado:   ");
        cargo = input.nextLine();
        System.out.println("Ingrese el Salario del empleado:    ");
        salario = input.nextDouble();
        input.nextLine();
        System.out.println("Ingrese la fecha de inicio del  empleado:    ");
        fecha_inicio= input.nextLine();
        input.nextLine();

        empelado empelado3 = new empelado(nombre,cargo,salario,fecha_inicio);



        empelado1.presentar_empleado();
        empelado2.presentar_empleado();
        empelado3.presentar_empleado();



    }
    public static void crearjugadores(){
        Scanner input = new Scanner(System.in);
        String nombre;
        String posicion;
        int edad;
        int numero_cam;

        System.out.println("Ingrese el nombre del jugador: ");
        nombre = input.nextLine();
        System.out.println("Ingrese la posicion del jugador");
        posicion = input.nextLine();
        System.out.println("Ingrese la edad del jugador: ");
        edad = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese el numero de camiseta del jugador: ");
        numero_cam= input.nextInt();
        input.nextLine();

        jugador jugador1 = new jugador(nombre,posicion,edad,numero_cam);

        jugador jugador2 = new jugador("Pacho","Defensa",21,35);

        jugador jugador3 = new jugador("Dibu","Arquero",36,23);

        jugador1.presentar_jugador();
        jugador2.presentar_jugador();
        jugador3.presentar_jugador();


    }

}

