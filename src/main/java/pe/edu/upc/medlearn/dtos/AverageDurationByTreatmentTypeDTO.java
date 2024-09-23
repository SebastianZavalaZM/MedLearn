package pe.edu.upc.medlearn.dtos;

public class AverageDurationByTreatmentTypeDTO {
    private String treatmentDescription;
    private double averageDuration;


    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    public double getAverageDuration() {
        return averageDuration;
    }

    public void setAverageDuration(double averageDuration) {
        this.averageDuration = averageDuration;
    }

}
