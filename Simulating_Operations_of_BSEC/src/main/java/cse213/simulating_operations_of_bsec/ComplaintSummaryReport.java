package cse213.simulating_operations_of_bsec;

import java.util.ArrayList;

public class ComplaintSummaryReport {
    private int totalComplaints;
    private float resolutionRate;
    private ArrayList<String> topIssues;

    public int getTotalComplaints() {
        return totalComplaints;
    }

    public void setTotalComplaints(int totalComplaints) {
        this.totalComplaints = totalComplaints;
    }

    public float getResolutionRate() {
        return resolutionRate;
    }

    public void setResolutionRate(float resolutionRate) {
        this.resolutionRate = resolutionRate;
    }

    public ArrayList<String> getTopIssues() {
        return topIssues;
    }

    public void setTopIssues(ArrayList<String> topIssues) {
        this.topIssues = topIssues;
    }
}
