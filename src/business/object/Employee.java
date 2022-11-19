package business.object;

import enums.JobTitle;
import enums.Shift;

import java.util.Date;


public class Employee {
    private String name;
    private String id;
    private JobTitle jobTitle;
    private Shift shift;
    private Date hiringDate;

    public Employee(
            String name,
            String id,
            JobTitle jobTitle,
            Shift shift,
            Date hiringDate
    ) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.shift = shift;
        this.hiringDate = hiringDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }
}
