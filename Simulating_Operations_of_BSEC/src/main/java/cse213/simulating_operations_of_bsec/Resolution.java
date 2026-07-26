package cse213.simulating_operations_of_bsec;

import java.time.LocalDate;

public class Resolution {
    private String resolutionId;
    private String complaintId;
    private String decisionType;
    private String certificateId;
    private LocalDate issueDate;

    public Resolution(String resolutionId, String complaintId, String decisionType, String certificateId, LocalDate issueDate) {
        this.resolutionId = resolutionId;
        this.complaintId = complaintId;
        this.decisionType = decisionType;
        this.certificateId = certificateId;
        this.issueDate = issueDate;
    }

    public String getResolutionId() {
        return resolutionId;
    }

    public void setResolutionId(String resolutionId) {
        this.resolutionId = resolutionId;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getDecisionType() {
        return decisionType;
    }

    public void setDecisionType(String decisionType) {
        this.decisionType = decisionType;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }
}
