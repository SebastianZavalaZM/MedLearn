package pe.edu.upc.medlearn.dtos;

import pe.edu.upc.medlearn.entities.Diets;

public class ExercisesDTO {
    private int idExercises;
    private String nameExercises;
    private int setsExercises;
    private Diets di;

    public Diets getDi() {
        return di;
    }

    public void setDi(Diets di) {
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
}
