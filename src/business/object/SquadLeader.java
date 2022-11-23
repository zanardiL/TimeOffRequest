package business.object;

import enums.JobTitle;
import enums.Shift;

import java.time.LocalDate;

public class SquadLeader extends Employee {
    public SquadLeader(String name, Shift shift, LocalDate hiringDate) {
        super(name, JobTitle.SQUAD_LEADER, shift, hiringDate);
    }
}
