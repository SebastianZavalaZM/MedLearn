package pe.edu.upc.medlearn.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMedicine;

    @Column(name = "descriptionMedicine", nullable = false, length = 200)
    private String descriptionMedicine;

    @Column(name = "nameMedicine", nullable = false, length = 100)
    private String nameMedicine;

    @ManyToOne
    @JoinColumn(name = "idTreatment")
    private Treatment treatment;

    // Constructor vacío
    public Medicine() {
    }

    public Medicine(int idMedicine, String descriptionMedicine, String nameMedicine, Treatment treatment) {
        this.idMedicine = idMedicine;
        this.descriptionMedicine = descriptionMedicine;
        this.nameMedicine = nameMedicine;
        this.treatment = treatment;
    }

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

