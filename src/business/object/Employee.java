package business.object;

import enums.JobTitle;
import enums.Shift;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Employee {
    private String name;
    private JobTitle jobTitle;
    private Shift shift;
    private LocalDate hiringDate;
    private int daysOffAvaiable;

    public Employee(
            String name,
            JobTitle jobTitle,
            Shift shift
    ) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.shift = shift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public int getDaysOffAvaiable() {
        return daysOffAvaiable;
    }

    public void setDaysOffAvaiable(int daysOffAvaiable) {
        this.daysOffAvaiable = daysOffAvaiable;
    }
    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

}
