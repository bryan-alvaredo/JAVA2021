import java.util.Scanner;

public class Act8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Lee variables
        System.out.println("Ingrese su Nombre y Apellido: ");
        String nom = leer.nextLine();
        System.out.println("Ingrese su Edad: ");
        String edad = leer.nextLine();
        System.out.println("Ingrese su Domicilio: ");
        String dom = leer.nextLine();
        System.out.println("Ingrese su Ciudad: ");
        String ciu = leer.nextLine();
        leer.close();

        //imprime cadena
        System.out.print(ciu + " - " + dom + " - " + edad + " - " + nom);
    }
}
