package business.object;

import enums.JobTitle;
import enums.Shift;

public class SquadLeader extends Employee {
    public SquadLeader(String name, JobTitle jobTitle, Shift shift) {
        super(name, JobTitle.SQUAD_LEADER, shift);
    }
}
