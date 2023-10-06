package Pojo;

public class Administrativo extends Empleados{
    private String area;
    private int numSeguroSocial;

    public Administrativo(String nombreCompleto, int edad, String correo, String genero, String curp, int telefono,  Double sueldo, String horario, String jornada,String area, int numSeguroSocial) {
        super(nombreCompleto,edad,correo,genero,curp,telefono,sueldo,horario,jornada);
        this.area = area;
        this.numSeguroSocial = numSeguroSocial;
    }

    @Override
    public String toString() {
        return "-> Administrativo \n" +
                "Nombre: " + getNombreCompleto() + "  -  " +
                "Telefono: " + getTelefono() + "  -  " +
                "Area: " + area + "  -  " +
                "Numero de seguridad social: " + numSeguroSocial
                ;
    }
}

