package bsec.ipomanagement;

public class IPOApplication {
    private int applicationId, applicantId, numberOfShares ;
    private String companyName, status;
    private double amountPaid;

    public IPOApplication() {
    }

    public IPOApplication(int applicationId, int applicantId, int numberOfShares, String companyName, String status, double amountPaid) {
        this.applicationId = applicationId;
        this.applicantId = applicantId;
        this.numberOfShares = numberOfShares;
        this.companyName = companyName;
        this.status = status;
        this.amountPaid = amountPaid;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    @Override
    public String toString() {
        return "IPOApplication{" +
                "applicationId=" + applicationId +
                ", applicantId=" + applicantId +
                ", numberOfShares=" + numberOfShares +
                ", companyName='" + companyName + '\'' +
                ", status='" + status + '\'' +
                ", amountPaid=" + amountPaid +
                '}';
    }

    public boolean submitApplication() {
        System.out.println("Application " + applicationId + " submitted successfully.");
        return true;
    }

    public boolean cancelApplication() {
        this.status = "Cancelled";
        System.out.println("Application " + applicationId + " cancelled.");
        return true;
    }

    public String trackStatus() {
        return "Current Status: " + status;
    }
}
