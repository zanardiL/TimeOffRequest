package business.object;

import enums.JobTitle;
import enums.Shift;

import java.time.LocalDate;


public class Employee {
    private String name;
    private JobTitle jobTitle;
    private Shift shift;
    private LocalDate hiringDate;


    public Employee(
            String name,
            JobTitle jobTitle,
            Shift shift,
            LocalDate hiringDate
    ) {
        this.name = name;
        this.shift = shift;
        this.hiringDate = hiringDate;
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

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle=" + jobTitle +
                ", shift=" + shift +
                ", hiringDate=" + hiringDate +
                '}';
    }
}
