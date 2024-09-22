package pe.edu.upc.medlearn.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.medlearn.entities.Diet;
import pe.edu.upc.medlearn.entities.Treatment;

public class MedicineDTO {
    private int idMedicine;
    private String descriptionMedicine;
    private String nameMedicine;
    private Diet diet;
    private Treatment treatment;

    public int getIdMedicine() {
        return idMedicine;
    }

    public void setIdMedicine(int idMedicine) {
        this.idMedicine = idMedicine;
    }

    public String getDescriptionMedicine() {
        return descriptionMedicine;
    }

    public void setDescriptionMedicine(String descriptionMedicine) {
        this.descriptionMedicine = descriptionMedicine;
    }

    public String getNameMedicine() {
        return nameMedicine;
    }

    public void setNameMedicine(String nameMedicine) {
        this.nameMedicine = nameMedicine;
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
