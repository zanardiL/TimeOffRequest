import java.time.LocalDate;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager(
                "Neire",
                "ID02",
                Shift.SECOND
        );

        Employee employee = new Employee(
                "Sara",
                "ID",
                JobTitle.RECEIVING_INSPECTOR,
                Shift.SECOND,
                new Date(1/10/2020)
                );



        PrintCalendar printCalendar = new PrintCalendar();
        printCalendar.calendar(LocalDate.now());
    }
}
