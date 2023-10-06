package Pojo;

public class Persona {
    private String nombreCompleto;
    private int edad;
    private String correo;
    private String genero;
    private String curp;
    private int telefono;

    public Persona(String nombreCompleto, int edad, String correo, String genero, String curp, int telefono) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.correo = correo;
        this.genero = genero;
        this.curp = curp;
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCurp() {
        return curp;
    }

    public int getTelefono() {
        return telefono;
    }


}
