import java.util.Scanner;

public class Act4 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero para su Factorial: ");
        //declara contador
        int contFact = 1;
        //lee numero
        int contNum = leer.nextInt();
        leer.close();

        //comienza iterador
        for (int x=2; x <= contNum; x++){
            contFact = contFact * x;
        }

        //imprime resultado
        System.out.println("El factorial del numero " + contNum + " es: " + contFact);
    }
}
