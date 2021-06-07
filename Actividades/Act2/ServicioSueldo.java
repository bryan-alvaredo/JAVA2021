package Act2;
public class ServicioSueldo {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(1234, "Homero", "Simpson");
        Empleado emp2 = new Empleado(8451, "Lisa", "Simpson");
    //emp1.apellido ="Balboa"; cambia el nombre de emp1 solo si este es
    //público en la clase Empleado.java
        emp1.setNombre("Balboa"); //otorga ese nombre al atributo
    //ya que el atributo fue "seteado" para ser público.
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
