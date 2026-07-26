package cse213.simulating_operations_of_bsec;

import java.time.LocalDate;

public class Report {
    protected String reportId;         // PF, unique
    protected String reportingPeriod;  // e.g. "Monthly" or "Quarterly"
    protected LocalDate generateDate;
    protected String status;

    public Report() {
    }

    public Report(String reportId, String reportingPeriod, LocalDate generateDate, String status) {
        this.reportId = reportId;
        this.reportingPeriod = reportingPeriod;
        this.generateDate = generateDate;
        this.status = status;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportingPeriod() {
        return reportingPeriod;
    }

    public void setReportingPeriod(String reportingPeriod) {
        this.reportingPeriod = reportingPeriod;
    }

    public LocalDate getGenerateDate() {
        return generateDate;
    }

    public void setGenerateDate(LocalDate generateDate) {
        this.generateDate = generateDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
