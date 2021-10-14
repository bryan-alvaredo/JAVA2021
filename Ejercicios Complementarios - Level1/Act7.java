import java.util.Scanner;

public class Act7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o una frase: ");
        //Lee palabra
        String str = leer.nextLine();
        StringBuilder sb = new StringBuilder();
        //iterador
        for (int i = 0; i< str.length(); i++) {
            char letra = str.charAt(i);
            if (letra==' ') { //retoma el empacio
                //sb.append(' ');
            }
            if (122 >= letra && letra >= 97) {
                letra = (char)((letra - 32)); 
                sb.append(letra);
            }
            else {
                sb.append(letra);
            }
        }
        //imprime resultado
        System.out.println(sb);
        leer.close();
     }
}
