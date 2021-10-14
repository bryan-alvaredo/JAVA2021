import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //lee numeros
        System.out.println("Ingrese un numero a operar:");
        int num = leer.nextInt();
        System.out.println("Ingrese un numero que sera la potencia del anterior:");
        int pot = leer.nextInt();
        int tot = 1;
        leer.close();

        //iterador
        for (int i=0; i < pot; i++) {
            tot = tot * num;
        }

        //imprime resultado
        System.out.print(num + " elevado a la" + pot + " = " + tot);
    }
}