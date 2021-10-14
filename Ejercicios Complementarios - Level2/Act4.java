import java.util.ArrayList;
import java.util.List;

public class Act4 {
    public static void main(String[] args) {
        List<String> alum = new ArrayList<>();

        cargarLista(alum);

        List<String> curso1 = alum.subList(0, 4);
        List<String> curso2 = alum.subList(4, 8);
        List<String> curso3 = alum.subList(8, 12);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
    }

    public static void cargarLista(List<String> alum) {
        alum.add("Esteban");
        alum.add("Brenda");
        alum.add("Camila");
        alum.add("Gabriela");
        alum.add("Gisela");
        alum.add("Natali");
        alum.add("Ada");
        alum.add("Eliana");
        alum.add("Sebastian");
        alum.add("Jorge");
        alum.add("Patricia");
        alum.add("Cuervo");
    }
}