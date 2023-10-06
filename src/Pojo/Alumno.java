package Pojo;

public class Alumno extends Persona{
    private String matricula;
    private String carrera;
    private String semestre;
    private Double promedio;

    public Alumno(String nombreCompleto, int edad, String correo, String genero, String curp, int telefono, String matricula, String carrera, String semestre, Double promedio) {
        super(nombreCompleto, edad, correo, genero, curp, telefono);
        this.matricula = matricula;
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public Double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "-> Alumno \n" +
                "Nombre: " + getNombreCompleto() + "  -  " +
                "Telefono: " + getTelefono() + "  -  " +
                "Carrera: " + carrera + "  -  " +
                "Semestre: " + semestre
                ;
    }
}
