package pe.edu.upc.medlearn.dtos;

import pe.edu.upc.medlearn.entities.Treatment;

public class MedicineDTO {
    private int idMedicine;
    private String descriptionMedicine;
    private String nameMedicine;
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

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }
}
