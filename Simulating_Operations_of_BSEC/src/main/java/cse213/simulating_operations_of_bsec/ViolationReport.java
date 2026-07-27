package cse213.simulating_operations_of_bsec;

public class ViolationReport {
    private String violationId;     // PF, unique
    private String sourceDepartment;
    private String description;
    private String evidenceRef;     // FF <-- CDBLRepresentative (teammate's class)
    private String status;

    public ViolationReport(String violationId, String sourceDepartment, String description, String evidenceRef, String status) {
        this.violationId = violationId;
        this.sourceDepartment = sourceDepartment;
        this.description = description;
        this.evidenceRef = evidenceRef;
        this.status = status;
    }

    public String getViolationId() {
        return violationId;
    }

    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }

    public String getSourceDepartment() {
        return sourceDepartment;
    }

    public void setSourceDepartment(String sourceDepartment) {
        this.sourceDepartment = sourceDepartment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEvidenceRef() {
        return evidenceRef;
    }

    public void setEvidenceRef(String evidenceRef) {
        this.evidenceRef = evidenceRef;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
