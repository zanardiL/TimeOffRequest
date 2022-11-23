package requests.requirements;

import business.object.Employee;
import requests.types.TimeOffRequest;

public interface RequirementsByLaw {
    boolean minimumRequirementsByLaw(TimeOffRequest timeOffRequest, Employee employee);


}
