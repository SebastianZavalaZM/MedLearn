package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "suple_id")
    private int supleId;

    @Column(name = "suple_description", nullable = false, length = 200)
    private String supleDescription;

    @Column(name = "suple_name", nullable = false, length = 30)
    private String supleName;

    @ManyToOne
    @JoinColumn(name = "Diets_diet_id", nullable = false)
    private Diet diet;

    @ManyToOne
    @JoinColumn(name = "Treatments_treatments_id", nullable = false)
    private Treatment treatment;

    // Constructor vacío
    public Medicine() {
    }

    // Constructor con parámetros
    public Medicine(int supleId, String supleDescription, String supleName, Diet diet, Treatment treatment) {
        this.supleId = supleId;
        this.supleDescription = supleDescription;
        this.supleName = supleName;
        this.diet = diet;
        this.treatment = treatment;
    }

    // Getters y Setters
    public int getSupleId() {
        return supleId;
    }

    public void setSupleId(int supleId) {
        this.supleId = supleId;
    }

    public String getSupleDescription() {
        return supleDescription;
    }

    public void setSupleDescription(String supleDescription) {
        this.supleDescription = supleDescription;
    }

    public String getSupleName() {
        return supleName;
    }

    public void setSupleName(String supleName) {
        this.supleName = supleName;
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
