package cse213.simulating_operations_of_bsec;

import java.time.LocalDate;

public class Penalty {
    private String penaltyId;
    private String violationId;
    private String type;
    private float amount;
    private LocalDate dueDate;
    private String status;

    public Penalty(String penaltyId, String violationId, String type, float amount, LocalDate dueDate, String status) {
        this.penaltyId = penaltyId;
        this.violationId = violationId;
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.status = status;
    }

    public String getPenaltyId() {
        return penaltyId;
    }

    public void setPenaltyId(String penaltyId) {
        this.penaltyId = penaltyId;
    }

    public String getViolationId() {
        return violationId;
    }

    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
