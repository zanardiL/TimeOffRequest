import business.object.Employee;
import business.object.SquadLeader;
import calendar.PrintCalendar;
import enums.JobTitle;
import enums.RequestsNature;
import enums.Shift;
import requests.types.AnnualLeave;
import requests.TimeOffRequest;

import java.time.LocalDate;


public class Test {
    public static void main(String[] args) {
        SquadLeader manager = new SquadLeader(
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

        employee.setHiringDate(LocalDate.of(2022,1,12));

        PrintCalendar printCalendar = new PrintCalendar();
        printCalendar.calendar(LocalDate.now());

        TimeOffRequest request1 = new TimeOffRequest();
        request1.setRequestsNature(RequestsNature.ANNUAL_LEAVE);
        request1.setStartPeriod(LocalDate.of(2023, 2, 20));
        request1.setEndPeriod(LocalDate.of(2023, 3, 20));

        AnnualLeave vacation1 = new AnnualLeave();
        vacation1.minimumRequirementsByLaw(request1, employee);
        vacation1.minimumRequirementsByCompanyPolicy(request1, employee);

    }
}
