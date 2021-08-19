import java.io.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Calendar;

public class Empleado {

    public static void main(String[] args) throws IOException, ParseException {

        List<Emploee> emploees = new ArrayList<>();
        List<String> apellidos = new ArrayList<>();
        List<String> filteredList = new ArrayList<>();
        List<String> ordenEdad = new ArrayList<>();
        List<Calendar> joven = new ArrayList<>();
        List<Calendar> viejo = new ArrayList<>();
        int count = 0;
        String path = "empleados.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String content = br.readLine();
            //StringBuilder sb = new StringBuilder();

            while (content != null) {
                emploees.add(processLine(content, apellidos, count, ordenEdad));
                content = br.readLine();
            }
            System.out.println(emploees);
            //String fileAsString = sb.toString();
            //System.out.println(fileAsString);
            System.out.println("Apellidos: "+ apellidos);
            FiltroApellido(apellidos, filteredList);
            System.out.println("Apellidos con comienzan con 'G': "+filteredList);
        }
        catch (IOException ex) {
        }
    
    }

    public static Emploee processLine(String content, List<String> apellidos, int count, List<String> ordenEdad) throws ParseException {
        List<String> line = new ArrayList<>(Arrays.asList(content.split(",")));
        Emploee emp = new Emploee(line.get(0), line.get(1), line.get(2), line.get(3));
        apellidos.add(line.get(1));
        /*if (count == 0) {
            ordenEdad.add(line.get(0) + "," + line.get(1) + "," + birthDate);
        }*/
        return emp;
    }

    public static void FiltroApellido (List<String> apellidos, List<String> filteredList) {
        for (String entry : apellidos) {
            if (entry.startsWith("G")) {
                filteredList.add(entry);
            }
        }
    }
}