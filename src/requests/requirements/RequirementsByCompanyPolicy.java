package requests.requirements;

import business.object.Employee;
import requests.TimeOffRequest;

public interface RequirementsByCompanyPolicy {
    boolean companyPolicy(TimeOffRequest timeOffRequest, Employee employee);
}
