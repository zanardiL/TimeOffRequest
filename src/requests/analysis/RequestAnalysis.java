package requests.analysis;

import requests.types.AnnualLeave;

public class RequestAnalysis {
    private boolean approved;

    public boolean isApproved(AnnualLeave annualLeave, AnnualLeave annualLeave2) {
        if(annualLeave.minimumRequirementsByLaw(annualLeave, annualLeave.getEmployee())
                && annualLeave.companyPolicy(annualLeave, annualLeave.getEmployee())
                && annualLeave.companyPolicy2(annualLeave, annualLeave.getEmployee(), annualLeave2, annualLeave2.getEmployee())
        ) {
            System.out.println("Annual leave request approved!");
            System.out.println("Employee: "+annualLeave.getEmployee());
            System.out.println("Start: "+annualLeave.getStartPeriod());
            System.out.println("End: "+annualLeave.getEndPeriod());
            return approved = true;
        }
        else {
            System.err.println("Request denied.");
            System.out.println("Employee: "+annualLeave.getEmployee());
            System.out.println("Start: "+annualLeave.getStartPeriod());
            System.out.println("End: "+annualLeave.getEndPeriod());
            return approved = false;
        }
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
