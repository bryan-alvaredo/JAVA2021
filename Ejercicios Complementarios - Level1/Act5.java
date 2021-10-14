import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //declara variable
        int suma = 0;
        //lee numeros
        System.out.println("Ingrese el primer numero a multiplicar: ");
        int a = leer.nextInt();
        System.out.println("Ingrese el segundo numero a multiplicar: ");
        int b = leer.nextInt();
        leer.close();

        //comienza iterador
        for (int i=0; i < b; i++) {
            suma = suma + a;
        }

        //imprime resultado
        System.out.print(a + " x " + b + " = " + suma);
    }
}
