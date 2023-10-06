package Pojo;

public class PersonalLimpieza extends Empleados{
    private String area;

    public PersonalLimpieza(String nombreCompleto, int edad, String correo, String genero, String curp, int telefono,  Double sueldo, String horario, String jornada,String area) {
        super(nombreCompleto,edad,correo,genero,curp,telefono,sueldo,horario,jornada);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "-> Personal de limpieza \n" +
                "Nombre: " + getNombreCompleto() + "  -  " +
                "Telefono: " + getTelefono() + "  -  " +
                "Area: " + area + "  -  ";
    }
}
