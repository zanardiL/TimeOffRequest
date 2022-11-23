package requests.requirements;

import business.object.Employee;
import requests.types.TimeOffRequest;

public interface RequirementsByCompanyPolicy {
    boolean companyPolicy(TimeOffRequest timeOffRequest, Employee employee);
}
