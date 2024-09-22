package pe.edu.upc.medlearn.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Exercises")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExercises;
    @Column(name = "nameExercises",nullable = false,length = 100)
    private String nameExercises;
    @Column(name = "setsExercises",nullable = false,length = 100)
    private int setsExercises;
    @ManyToOne
    @JoinColumn(name = "id_diet")
    private Diet di;

    public Exercise() {
    }

    public Exercise(int idExercises, String nameExercises, int setsExercises, Diet di) {
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

    public Diet getDi() {
        return di;
    }

    public void setDi(Diet di) {
        this.di = di;
    }
}
