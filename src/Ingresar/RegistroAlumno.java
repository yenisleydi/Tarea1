package Ingresar;

import Interfaz.Interfaz;
import Pojo.Alumno;
import Pojo.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroAlumno implements Interfaz {

    ArrayList<Persona> personas = new ArrayList <>();
    @Override
    public void registrar() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingresar Nombre Completo: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingresar Edad: ");
        int edad = scanner.nextInt();
        System.out.println("Ingresar Correo: ");
        String correo = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Ingresar Genero: ");
        String genero = scanner.nextLine();
        System.out.println("Ingresar Curp: ");
        String curp = scanner.nextLine();
        System.out.println("Ingresar Telefono: ");
        int telefono =scanner.nextInt();
        System.out.println("Ingresar Matricula: ");
        String matricula = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Ingresar Carrrera: ");
        String carrera = scanner.nextLine();
        System.out.println("Ingresar Semestre : ");
        String semestre = scanner.nextLine();
        System.out.println("Ingresar Promedio: ");
        double promedio = scanner.nextDouble();

        Alumno alumno= new Alumno(nombre,edad,correo, genero, curp,  telefono, matricula,carrera,semestre,promedio);
        personas.add(alumno);
        imprimir();

    }
    @Override
    public void imprimir() {
        System.out.println("-----------------------------------------");
        System.out.println("   Se ha registrado un Alumno!! :) <3 !");
        System.out.println("-----------------------------------------\n");

    }
    public ArrayList<Persona> getPersonas(){return personas;}
}
