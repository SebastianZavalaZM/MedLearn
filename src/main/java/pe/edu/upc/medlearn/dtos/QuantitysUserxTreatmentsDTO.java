package pe.edu.upc.medlearn.dtos;

public class QuantitysUserxTreatmentsDTO {
    private String treatmentDescription;
    private int userCount;

    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }
}
