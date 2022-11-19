import requests.TimeOffRequest;

import java.util.Date;

public class ManageRequests implements TimeOffRequest {
    @Override
    public boolean minimumRequirements(Date startDate, Date endDate) {
        boolean firstRequirement;
        return false;
    }
}
