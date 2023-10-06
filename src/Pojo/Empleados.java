package Pojo;

public class Empleados extends Persona{
    private Double sueldo;
    private String horario;
    private String jornada;

    public Empleados(String nombreCompleto, int edad, String correo, String genero, String curp, int telefono,  Double sueldo, String horario, String jornada) {
        super(nombreCompleto,edad,correo,genero,curp,telefono);
        this.sueldo = sueldo;
        this.horario = horario;
        this.jornada = jornada;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public String getHorario() {
        return horario;
    }

    public String getJornada() {
        return jornada;
    }


}
