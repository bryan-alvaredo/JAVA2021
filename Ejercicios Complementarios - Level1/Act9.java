import java.io.IOException;
import java.util.Scanner;

public class Act9 {
    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in);
        String tex;
        char car;
        int cantDeVeces = 0;
        do {
            System.out.println("Ingrese un texto: ");
            tex = leer.nextLine();
        } while (tex.isEmpty());
        System.out.print("Ingrese una letra a buscar: ");
        car = (char) System.in.read();
        leer.close();
        cantDeVeces = contCaracteres(tex, car);
        System.out.println("La letra " + car + " se repite " + cantDeVeces + " veces en el texto");                   
    }

    public static int contCaracteres(String cadena, char car) {
        int pos, cont = 0;
        pos = cadena.indexOf(car);
        while (pos != -1) { 
            cont++;           
            pos = cadena.indexOf(car, pos + 1);
        }
        return cont;
   }
}
