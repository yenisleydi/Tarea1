package Ingresar;

import Interfaz.Interfaz;
import Pojo.Persona;
import Pojo.PersonalLimpieza;
import Pojo.Profesor;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistrarLimpieza implements Interfaz {
    ArrayList<Persona> personas= new ArrayList<>();

    @Override
    public void imprimir() {
        System.out.println("--------------------------------------------------------");
        System.out.println("   Se ha registrado un Personal de Limpieza!! :) <3 !");
        System.out.println("--------------------------------------------------------");
    }

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
        System.out.println("Ingresar Sueldo : ");
        double sueldo = scanner.nextDouble();
        System.out.println("Ingresar Horario : ");
        String horario = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Ingresar Jornada : ");
        String jornada = scanner.nextLine();
        System.out.println("Ingresar Area: ");
        String area = scanner.nextLine();

        PersonalLimpieza personalLimpieza = new PersonalLimpieza( nombre,edad,correo, genero, curp,  telefono, sueldo,horario,jornada ,area);
        personas.add(personalLimpieza);
        imprimir();


    }

    public ArrayList<Persona> getPersonas(){return personas;}
}
