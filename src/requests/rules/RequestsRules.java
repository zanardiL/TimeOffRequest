package requests.rules;

import business.object.Employee;
import requests.TimeOffRequest;

public interface RequestsRules {
    boolean minimumRequirementsByLaw(TimeOffRequest timeOffRequest, Employee employee);
    boolean minimumRequirementsByCompanyPolicy(TimeOffRequest timeOffRequest, Employee employee);

}
