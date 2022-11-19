package requests;

import business.object.Employee;
import enums.RequestsNature;
import requests.rules.RequestsRules;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AnnualLeaveRequest extends TimeOffRequest implements RequestsRules {

    public AnnualLeaveRequest(
            RequestsNature requestsNature,
            LocalDate startPeriod,
            LocalDate endPeriod
    ) {
        super(requestsNature ,startPeriod, endPeriod);
        this.requestNature = RequestsNature.ANNUAL_LEAVE;

    }
    @Override
    public boolean minimumRequirementsByLaw(TimeOffRequest timeOffRequest, Employee employee) {
        long daysEmployed = timeOffRequest.getStartPeriod().until(employee.getHiringDate(), ChronoUnit.DAYS);
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

    @Override
    public boolean minimumRequirementsByCompanyPolicy(TimeOffRequest timeOffRequest, Employee employee) {
        int daysInAdvance = (int) employee.getHiringDate().until(timeOffRequest.getStartPeriod(), ChronoUnit.DAYS);
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
