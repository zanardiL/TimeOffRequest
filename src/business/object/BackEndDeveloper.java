package business.object;

import enums.JobTitle;
import enums.Shift;

import java.time.LocalDate;

public class BackEndDeveloper extends Employee{
    public BackEndDeveloper(String name, Shift shift, LocalDate hiringDate) {
        super(name, JobTitle.BACKEND_DEVELOPER, shift, hiringDate);
    }
}
