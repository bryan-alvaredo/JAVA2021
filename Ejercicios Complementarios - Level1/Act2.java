import java.util.Scanner;

public class Act2 {
    

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //lee los numeros
        System.out.println("Por favor, ingrese un numero entero");
        int a = leer.nextInt();
        System.out.println("Por favor, ingrese otro numero entero");
        int b = leer.nextInt();
        leer.close();

        //imprime los resultados
        System.out.println("Suma: " + a + " + " + b + " = " + (a+b));
        System.out.println("Resta: " + a + " - " + b + " = " + (a-b));
        System.out.println("Multiplicacion: " + a + " * " + b + " = " + (a*b));
        System.out.println("Division: " + a + " / " + b + " = " + (a/b));
        System.out.println("Modulo: " + a + " % " + b + " = " + (a%b));
    }
}
