package Entidad;

public class Mascotas {
    String dniCliente;
    String nombre;
    String edad;
    String estado;
    String sexo; // Nuevo atributo para el sexo de la mascota

    public Mascotas(String dniCliente, String nombre, String edad, String estado, String sexo) {
        this.dniCliente = dniCliente;
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public void setCondicion(String condicion) {
        this.estado = condicion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
