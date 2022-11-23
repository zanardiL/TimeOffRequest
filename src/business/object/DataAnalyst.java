package business.object;

import enums.JobTitle;
import enums.Shift;

public class DataAnalyst extends Employee {
    public DataAnalyst(String name, JobTitle jobTitle, Shift shift) {
        super(name, JobTitle.DATA_ANALYST, shift);
    }
}
