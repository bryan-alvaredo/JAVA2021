import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Act3 {
    public static void main(String[] args) {
        ArrayList<String> cartas = new ArrayList<>();
        baraja(cartas);

        System.out.println(cartas);
        Comparator<String> comparador = Collections.reverseOrder();
        Collections.sort(cartas, comparador);
        System.out.println(cartas);
        Collections.shuffle(cartas);
        System.out.println(cartas);
    }
    
    public static void baraja(ArrayList<String> cartas){
        cartas.add("1");
        cartas.add("2");
        cartas.add("3");
        cartas.add("4");
        cartas.add("5");
        cartas.add("6");
        cartas.add("7");
        cartas.add("8");
        cartas.add("9");
        cartas.add("10");
        cartas.add("J");
        cartas.add("Q");
        cartas.add("K");
    }
}
