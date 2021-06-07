package Act2;

public class Empleado {
    //La palabra "private" hace que los argumentos no puedan se utilizados
    //publicamente desde otra clase, en este ejemplo, desde ServicioSueldo
    //esto es el encapsulamiento
    private int dni;
    private String nombre;
    private String apellido;

    public Empleado(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //El "set" vuelve público al argumento, pudiendo así utilizarse desde otra clase
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.valueOf(this.dni) +
            " - " + this.nombre +
            " - " + this.apellido;
    }
}
