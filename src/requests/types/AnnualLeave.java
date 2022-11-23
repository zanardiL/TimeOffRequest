package requests.types;

import business.object.Employee;
import requests.TimeOffRequest;
import requests.requirements.RequirementsByCompanyPolicy;
import requests.requirements.RequirementsByLaw;

import java.sql.Time;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AnnualLeave
        extends TimeOffRequest
        implements RequirementsByLaw, RequirementsByCompanyPolicy {

    /**
     * O funcionário tem direito a 30 dias de férias 12 meses após ser contratado,
     * que devem ser utilizados nos 12 meses subsequentes.
     * O empregador não precisa conceder os 30 dias de férias de uma vez.
     */
    @Override
    public boolean minimumRequirementsByLaw(
            TimeOffRequest timeOffRequest,
            Employee employee
    ) {
        long daysEmployed = employee.getHiringDate().until(timeOffRequest.getStartPeriod(), ChronoUnit.DAYS);
        LocalDate closingDate = employee.getHiringDate().plus(730, ChronoUnit.DAYS);

        if((daysEmployed > 365) && timeOffRequest.getEndPeriod().isBefore(closingDate)) {
            System.out.println("Days employed: " + daysEmployed);
            System.out.println("Closing date for annual leave: " + closingDate);
            return true;
        } else {
            System.out.println("Days employed: " + daysEmployed);
            System.out.println("Closing date for annual leave: " + closingDate);
            System.err.println("Request denied.");
            return false;
        }
    }

    /*
     * A empresa pede que a requisição seja feita de acordo com os seguintes requisitos:
     * 1) Data da requisição pelo menos 45 dias antes da data de início do período de férias;
     * 2) Que funcionários que desempenham a mesma função no mesmo turno tirem férias em períodos diferentes.
     */
    @Override
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

    public boolean companyPolicy2(
            TimeOffRequest timeOffRequest1,
            Employee employee1,
            TimeOffRequest timeOffRequest2,
            Employee employee2
    ) {
        if(employee1.getJobTitle().equals(employee2.getJobTitle()) && (employee1.getShift().equals(employee2.getShift()))) {
            return isOverlapping(timeOffRequest1, timeOffRequest2);
        }
    }

    public static boolean isOverlapping(TimeOffRequest timeOffRequest, TimeOffRequest timeOffRequest2) {
        if(timeOffRequest.getEndPeriod().isBefore(timeOffRequest2.getStartPeriod()) {
            return false;
        } else {
            return true;
        }
    }
}
