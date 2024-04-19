package Entidad;

public class Mascotas {
    String dniCliente;
    String nombre;
    String edad;
    String condicion;
    String sexo; // Nuevo atributo para el sexo de la mascota

    public Mascotas(String dniCliente, String nombre, String edad, String condicion, String sexo) {
        this.dniCliente = dniCliente;
        this.nombre = nombre;
        this.edad = edad;
        this.condicion = condicion;
        this.sexo = sexo; // Inicializar el atributo sexo
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
