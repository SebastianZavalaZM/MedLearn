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
    @JoinColumn(name = "diet_id", nullable = false)
    private Diet diet;

    @ManyToOne
    @JoinColumn(name = "treatments_id", nullable = false)
    private Treatment treatment;

    // Constructor vacío
    public Medicine() {
    }

}
