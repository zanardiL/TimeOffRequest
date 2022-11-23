package requests.types;

import business.object.Employee;
import requests.requirements.RequirementsByCompanyPolicy;
import requests.requirements.RequirementsByLaw;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class MaternityLeave
        extends TimeOffRequest
        implements RequirementsByLaw, RequirementsByCompanyPolicy {
    public MaternityLeave(LocalDate startPeriod, LocalDate endPeriod, Employee employee) {
        super(startPeriod, endPeriod, employee);
    }

    /*
     * A funcionária tem direito a 120 dias de licença maternidade.
     * A licença tem início 28 dias antes da data do parto
     * e término 91 dias após o parto.
     */
    @Override
    public boolean minimumRequirementsByLaw(TimeOffRequest timeOffRequest, Employee employee) {
        if(getStartPeriod().until(getEndPeriod()) == Period.ofDays(120)) {
            System.out.println(employee.getName() + " maternity's leave starts at: " + getStartPeriod());
            System.out.println(employee.getName() + " maternity's leave ends at: " +getEndPeriod());
            return true;
        } else {
            System.out.println("Maternity leave must be at least 120 days long.");
            return false;
        }
    }

    /**
     * A empresa pede que a Data da requisição seja de ao
     * menos 45 dias antes da data de início do período de licença maternidade;
     */
    public boolean companyPolicy(
            TimeOffRequest timeOffRequest,
            Employee employee
    ) {
        int daysInAdvance = (int) LocalDate.now().until(timeOffRequest.getStartPeriod(), ChronoUnit.DAYS);
        if(daysInAdvance >= 45) {
            System.out.printf("Request made %d days in advance.", daysInAdvance);
            return true;
        } else {
            System.out.printf("Request made %d days in advance.", daysInAdvance);
            System.err.println("Request denied.");
            return false;
        }
    }
}
