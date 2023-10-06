package Principal;

import Ingresar.RegistrarAdministrativo;
import Ingresar.RegistrarLimpieza;
import Ingresar.RegistrarProfesor;
import Ingresar.RegistroAlumno;
import Mostrar.MostrarInformacion;
import Pojo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    RegistroAlumno registroAlumno = new RegistroAlumno();
    RegistrarProfesor registrarProfesor = new RegistrarProfesor();
    RegistrarAdministrativo registrarAdministrativo = new RegistrarAdministrativo();
    RegistrarLimpieza registrarLimpieza = new RegistrarLimpieza();
    MostrarInformacion mostrarInformacion = new MostrarInformacion();
    private ArrayList<Persona> personas= new ArrayList<>();


    public void menu (){
        Scanner scanner = new Scanner(System.in);
        int op;
        do {
            System.out.println("---------- INGRESAR ----------");
            System.out.println("[1] Ingresar Alumno ");
            System.out.println("[2] Ingresar Administrativo ");
            System.out.println("[3] Ingresar Profesor ");
            System.out.println("[4] Ingresar Personal de limpieza ");
            System.out.println("[5] Mostrar Informacion");
            System.out.println("[6] Salir ");
            op = scanner.nextInt();
            switch (op){
                case 1:
                    registroAlumno.registrar();
                    break;
                case 2:
                    registrarAdministrativo.registrar();
                    break;
                case 3:
                    registrarProfesor.registrar();
                    break;
                case 4:
                    registrarLimpieza.registrar();
                    break;
                case 5:
                    mostrarInformacion.mostrar(registrarAdministrativo);
                    break;
            }
        }while(op != 6);

        ArrayList <Persona> personas = registrarAdministrativo.getPersonas();
        ArrayList <Persona> personas1 = registrarAdministrativo.getPersonas();
        ArrayList <Persona> personas2 = registrarAdministrativo.getPersonas();
        personas.add(personas1);

    }

}
