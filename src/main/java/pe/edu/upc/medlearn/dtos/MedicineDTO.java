package pe.edu.upc.medlearn.dtos;

import pe.edu.upc.medlearn.entities.Diet;
import pe.edu.upc.medlearn.entities.Treatment;

public class MedicineDTO {
    private int suple_id;
    private String suple_description;
    private String suple_name;
    private Diet diet;
    private Treatment treatment;

    // Getters y Setters

    public int getSupleId() {
        return suple_id;
    }

    public void setSupleId(int suple_id) {
        this.suple_id = suple_id;
    }

    public String getSupleDescription() {
        return suple_description;
    }

    public void setSupleDescription(String suple_description) {
        this.suple_description = suple_description;
    }

    public String getSupleName() {
        return suple_name;
    }

    public void setSupleName(String suple_name) {
        this.suple_name = suple_name;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public Treatment getTreatments() {
        return treatment;
    }

    public void setTreatments(Treatment treatment) {
        this.treatment = treatment;
    }
}
