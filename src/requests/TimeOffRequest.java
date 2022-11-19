package requests;

import enums.RequestsNature;
import business.object.Employee;
import java.time.LocalDate;

public interface TimeOffRequest {
    void timeOffRequest(
            Employee employee,
            RequestsNature requestsNature,
            LocalDate periodStart,
            LocalDate periodEnd
    );



}
