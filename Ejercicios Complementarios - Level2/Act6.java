import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Act6 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> dni = new LinkedHashSet<>();
        Set<String> nombres = new HashSet<>();
        LinkedHashSet<Integer> hsTrabajadas = new LinkedHashSet<>();
        LinkedHashSet<Integer> valorHora = new LinkedHashSet<>();
        Map<Integer, Integer> cobranza = new HashMap<>();
        
        dni.add(2131231312);
        dni.add(987654321);
    
        nombres.add("Sr. Calamardo");
        nombres.add("Bob Esponja");

        hsTrabajadas.add(4);
        hsTrabajadas.add(8);
        
        valorHora.add(350);
        valorHora.add(345);

        ArrayList<Integer> documentos = new ArrayList<>(dni);
        ArrayList<Integer> horasDeTrabajo = new ArrayList<>(hsTrabajadas);
        ArrayList<Integer> pesosPorHora = new ArrayList<>(valorHora);
        
        for (Integer i=0; i<=1; i++) {
            cobranza.put(documentos.get(i), horasDeTrabajo.get(i) * pesosPorHora.get(i));
        }
        
        for (Map.Entry<Integer, Integer> registro: cobranza.entrySet()) {
            System.out.println("DNI: " + registro.getKey() + " Sueldo: " + registro.getValue());
        }
    }
}