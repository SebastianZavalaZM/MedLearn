package pe.edu.upc.medlearn.dtos;

import pe.edu.upc.medlearn.entities.Diet;

public class ExercisesDTO {
    private int idExercises;
    private String nameExercises;
    private int setsExercises;
    private Diet di;

    public Diet getDi() {
        return di;
    }

    public void setDi(Diet di) {
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
