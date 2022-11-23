package requests.types;

import business.object.Employee;
import enums.RequestsNature;

import java.time.LocalDate;

public abstract class TimeOffRequest {
    private RequestsNature requestsNature;
    private LocalDate startPeriod;
    private LocalDate endPeriod;
    private Employee employee;

    public TimeOffRequest(
            LocalDate startPeriod,
            LocalDate endPeriod,
            Employee employee
    ) {
        this.startPeriod = startPeriod;
        this.endPeriod = endPeriod;
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public RequestsNature getRequestsNature() {
        return requestsNature;
    }

    public void setRequestsNature(RequestsNature requestsNature) {
        this.requestsNature = requestsNature;
    }

    public LocalDate getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(LocalDate startPeriod) {
        this.startPeriod = startPeriod;
    }

    public LocalDate getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(LocalDate endPeriod) {
        this.endPeriod = endPeriod;
    }

    @Override
    public String toString() {
        return "TimeOffRequest{" +
                "requestsNature=" + requestsNature +
                ", startPeriod=" + startPeriod +
                ", endPeriod=" + endPeriod +
                ", employee=" + employee +
                '}';
    }
}
