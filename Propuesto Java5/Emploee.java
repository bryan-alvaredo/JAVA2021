import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.time.Period;

public class Emploee {

    public double salary;
    public String firstName;
    public String lastName;
    public LocalDate birthDate;
    public Object age;

    public Emploee(String firstName, String lastName, String birthDate, String salary) throws ParseException {
        this.firstName = firstName;
        this.lastName = lastName;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.birthDate = LocalDate.parse(birthDate, formatter);
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        cal.setTime(sdf.parse(birthDate));
        this.age = calculateAge(cal);
        this.salary = Double.parseDouble(salary);
    }

    public Object calculateAge(Calendar cal) {
        LocalDate ahora = LocalDate.now();
        Period cale = Period.between(this.birthDate, ahora);
        return (cale.getYears() + " años " + cale.getMonths() + " meses " + cale.getDays() + " días");
    }

    public void ordenEdades(String firstName, String lastName, Object age, int count) throws ParseException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        
    }

    @Override
    public String toString() {
        return String.valueOf(this.firstName) +
            " - " + this.lastName +
            " - " + this.birthDate + " - " + this.salary + " - " + this.age;
    }
}
