import java.util.Scanner;

public class Act1 {
        public static void main(String[] args) {
        var leer = new Scanner(System.in);
        System.out.println("Por favor, ingrese su nombre: ");
        String saludo = leer.next();
        leer.close();
        System.out.println("HOLA " + saludo);
    }
}