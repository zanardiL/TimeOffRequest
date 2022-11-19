import business.object.Employee;
import business.object.Manager;
import calendar.PrintCalendar;
import enums.JobTitle;
import enums.Shift;
import requests.AnnualLeaveRequest;
import requests.TimeOffRequest;

import java.time.LocalDate;
import java.time.LocalDateTime;


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
                Shift.SECOND
        );

        employee.setHiringDate(LocalDate.of(2020,12,12));

        PrintCalendar printCalendar = new PrintCalendar();
        printCalendar.calendar(LocalDate.now());

        TimeOffRequest request1 = new TimeOffRequest()

    }
}
