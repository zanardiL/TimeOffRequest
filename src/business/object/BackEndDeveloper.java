package business.object;

import enums.JobTitle;
import enums.Shift;

public class BackEndDeveloper extends Employee{
    public BackEndDeveloper(String name, JobTitle jobTitle, Shift shift) {
        super(name, JobTitle.BACKEND_DEVELOPER, shift);
    }
}
