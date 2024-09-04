package pe.edu.upc.medlearn.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int suple_id;

    @Column(name = "suple_description", nullable = false, length = 200)
    private String supleDescription;

    @Column(name = "suple_name", nullable = false, length = 30)
    private String supleName;

    @ManyToOne
    @JoinColumn(name = "diet_id", nullable = false)
    private Diets diet;

    @ManyToOne
    @JoinColumn(name = "treatments_id", nullable = false)
    private Treatments treatments;

    // Constructor vacío
    public Medicine() {
    }

    // Constructor con parámetros
    public Medicine(int suple_id, String supleDescription, String supleName, Diets diet, Treatments treatments) {
        this.suple_id = suple_id;
        this.supleDescription = supleDescription;
        this.supleName = supleName;
        this.diet = diet;
        this.treatments = treatments;
    }

    // Getters y Setters
    public int getSupleId() {
        return suple_id;
    }

    public void setSupleId(int suple_id) {
        this.suple_id = suple_id;
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

    public Diets getDiet() {
        return diet;
    }

    public void setDiet(Diets diet) {
        this.diet = diet;
    }

    public Treatments getTreatments() {
        return treatments;
    }

    public void setTreatments(Treatments treatments) {
        this.treatments = treatments;
    }
}

