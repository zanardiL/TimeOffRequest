package business.object;

import enums.JobTitle;
import enums.Shift;

import java.time.LocalDate;

public class DataAnalyst extends Employee {
    public DataAnalyst(String name, Shift shift, LocalDate hiringDate) {
        super(name, JobTitle.DATA_ANALYST, shift, hiringDate);
    }
}
