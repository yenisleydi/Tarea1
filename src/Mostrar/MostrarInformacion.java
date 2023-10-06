package Mostrar;

import Ingresar.RegistrarAdministrativo;
import Pojo.Persona;

import java.util.ArrayList;

public class MostrarInformacion {
    public void mostrar(RegistrarAdministrativo registrarAdministrativo){
        ArrayList <Persona> personas = registrarAdministrativo.getPersonas();

        for (Persona persona : personas) {
            System.out.println(persona.toString());

        }
    }
}
