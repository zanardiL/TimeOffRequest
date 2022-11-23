package requests;

import business.object.Employee;
import enums.RequestsNature;

import java.time.LocalDate;

public class TimeOffRequest {
    private RequestsNature requestsNature;
    private LocalDate startPeriod;
    private LocalDate endPeriod;


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
}
