package cse213.simulating_operations_of_bsec;

import java.time.LocalDate;

public class PSIDisclosure {
    private String disclosureId;
    private String issuerId;
    private LocalDate submissionDate;
    private String status;

    public PSIDisclosure(String disclosureId, String issuerId, LocalDate submissionDate, String status) {
        this.disclosureId = disclosureId;
        this.issuerId = issuerId;
        this.submissionDate = submissionDate;
        this.status = status;
    }

    public String getDisclosureId() {
        return disclosureId;
    }

    public void setDisclosureId(String disclosureId) {
        this.disclosureId = disclosureId;
    }

    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
