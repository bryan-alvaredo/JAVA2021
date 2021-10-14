import java.util.Scanner;
import java.util.ArrayList;

public class Act2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ArrayList<Integer> listNum = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero: ");
            int num = leer.nextInt();
            addNum(-1,listNum, num);
        }

        System.out.println("Tamaño antes de agregar al principio: " + listNum.size());
        System.out.println("Ingrese un numero para agregar al principio: ");
        int numAdd = leer.nextInt();

        addNum(0, listNum, numAdd);

        System.out.println("Tamaño  despues de agregar al principio : " + listNum.size());
        System.out.println("Tamaño antes de agregar al final : " + listNum.size());
        System.out.println("Ingrese un numero para agregar al final: ");

        numAdd = leer.nextInt();
        addNum(-1,listNum, numAdd);

        System.out.println("Tamaño despues de agregar al final: " + listNum.size());

        printList(listNum);
        leer.close();
    }

    public static ArrayList<Integer> addNum(int index ,ArrayList<Integer> listNum, int num ) {
        if (index!= -1) {
            listNum.add(index,num);
        }
        else {
            listNum.add(num);
        }
        return listNum;
    }

    public static void printList(ArrayList<Integer>listNum) {
        for (Integer i : listNum) {   
            System.out.print(i+ " - ");
        }  
    }
}