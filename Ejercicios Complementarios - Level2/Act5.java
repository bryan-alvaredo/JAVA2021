import java.util.ArrayList;

public class Act5 {
    public static void main(String[] args) {
        ArrayList<Integer> hsTrabajadas = new ArrayList<>();
        ArrayList<Integer> valorHora = new ArrayList<>();
        ArrayList<Integer> valorTotal = new ArrayList<>();

        cargarHorasTrabajadas(hsTrabajadas);
        cargarValorPorHora(valorHora);

        Integer sueldo = 0;

        for (Integer i=0; i<=4; i++) {
            valorTotal.add(hsTrabajadas.get(i) * valorHora.get(i));
        }

        for (Integer i=0; i<=4; i++) {
            sueldo = sueldo + valorTotal.get(i);
        }

        System.out.println(hsTrabajadas);
        System.out.println(valorHora);
        System.out.println(valorTotal);
        System.out.print("Total Final: $" + sueldo);
    }

    public static void cargarHorasTrabajadas(ArrayList<Integer> hsTrabajadas){
        hsTrabajadas.add(6);
        hsTrabajadas.add(7);
        hsTrabajadas.add(8);
        hsTrabajadas.add(4);
        hsTrabajadas.add(5);
    }
    public static void cargarValorPorHora(ArrayList<Integer> valorHora){
        valorHora.add(350);
        valorHora.add(345);
        valorHora.add(550);
        valorHora.add(600);
        valorHora.add(320);
    }
}
