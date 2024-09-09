package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Exercises")
public class Exercises {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExercises;
    @Column(name = "nameExercises",nullable = false,length = 100)
    private String nameExercises;
    @Column(name = "setsExercises",nullable = false,length = 100)
    private int setsExercises;
    @ManyToOne
    @JoinColumn(name = "id_diet")
    private Diets di;

    public Exercises() {
    }

    public Exercises(int idExercises, String nameExercises, int setsExercises, Diets di) {
        this.idExercises = idExercises;
        this.nameExercises = nameExercises;
        this.setsExercises = setsExercises;
        this.di = di;
    }

    public int getIdExercises() {
        return idExercises;
    }

    public void setIdExercises(int idExercises) {
        this.idExercises = idExercises;
    }

    public String getNameExercises() {
        return nameExercises;
    }

    public void setNameExercises(String nameExercises) {
        this.nameExercises = nameExercises;
    }

    public int getSetsExercises() {
        return setsExercises;
    }

    public void setSetsExercises(int setsExercises) {
        this.setsExercises = setsExercises;
    }

    public Diets getDi() {
        return di;
    }

    public void setDi(Diets di) {
        this.di = di;
    }
}
