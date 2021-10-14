import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo para secuenciar: ");
        //lee el numero
        int num = leer.nextInt();
        //llama a la funcion
        Secuencia(num);
        leer.close();
    }
    //Se declara funcion
    public static void Secuencia( int num) {
        //evalua si el numero ingresado es entero y positivo
        if (num<=0) {
            //si es verdadero, devuelve error
            System.out.println("Error: su numero es menor o igual a 0");
            return;
        }
        else {
            //al ser falso, comienza con la operacion
            int aux = 1;
            for (int i = 0; i < num; i++) {
                for (int j = 1; j <= aux; j++) {
                    System.out.print(j);
                }
                aux++;
                System.out.print("\n");
            }
        }
    }
}
