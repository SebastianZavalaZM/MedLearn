package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Exercise")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExercise;
    @Column(name = "nameExercise",nullable = false,length = 100)
    private String nameExercise;
    @Column(name = "setsExercise",nullable = false)
    private int setsExercise;

    @ManyToOne
    @JoinColumn(name = "idDiet")
    private Diet diet;

    public Exercise() {
    }

    public Exercise(int idExercise, String nameExercise, int setsExercise, Diet diet) {
        this.idExercise = idExercise;
        this.nameExercise = nameExercise;
        this.setsExercise = setsExercise;
        this.diet = diet;
    }

    public int getIdExercise() {
        return idExercise;
    }

    public void setIdExercise(int idExercise) {
        this.idExercise = idExercise;
    }

    public String getNameExercise() {
        return nameExercise;
    }

    public void setNameExercise(String nameExercise) {
        this.nameExercise = nameExercise;
    }

    public int getSetsExercise() {
        return setsExercise;
    }

    public void setSetsExercise(int setsExercise) {
        this.setsExercise = setsExercise;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }
}
