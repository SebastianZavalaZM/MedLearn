package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Medicine")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMedicine;
    @Column(name = "descriptionMedicine", length = 100, nullable = false)
    private String descriptionMedicine;
    @Column(name = "nameMedicine", length = 100,nullable = false)
    private String nameMedicine;
}
