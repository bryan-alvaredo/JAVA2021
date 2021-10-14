import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //declara el arreglo
        String[] ciud = new String[4];
        ciud[0] = "Nada";
        //lee texto ingresado
        System.out.println("Ingrese se ciudad favorta #1");
        ciud[1] = leer.nextLine();
        System.out.println("Ingrese se ciudad favorta #2");
        ciud[2] = leer.nextLine();
        System.out.println("Ingrese se ciudad favorta #3");
        ciud[3] = leer.nextLine();
        leer.close();

        //imprime lista de ciudades
        for (int i = 1; i <= 4; i++) {
            System.out.println("#" + i + " - " + ciud[i]);
        }
    }
}
