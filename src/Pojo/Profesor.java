package Pojo;

public class Profesor extends Empleados{
    private String carrera;
    private String puesto;
    private int numGrupos;


    public Profesor(String nombreCompleto, int edad, String correo, String genero, String curp, int telefono,  Double sueldo, String horario, String jornada,String carrera, String puesto, int numGrupos) {
        super(nombreCompleto,edad,correo,genero,curp,telefono,sueldo,horario,jornada);
        this.carrera = carrera;
        this.puesto = puesto;
        this.numGrupos = numGrupos;
    }


    @Override
    public String toString() {
        return "-> Profesor \n" +
                "Nombre: " + getNombreCompleto() + "  -  " +
                "Telefono: " + getTelefono() + "  -  " +
                "Carrera: " + carrera + "  -  " +
                "Puesto: " + puesto
                ;
    }
}
